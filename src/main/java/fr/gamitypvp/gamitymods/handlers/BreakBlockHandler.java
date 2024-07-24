package fr.gamitypvp.gamitymods.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.gamitypvp.gamitymods.items.Items;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;

import java.util.*;

public class BreakBlockHandler {
    public BreakBlockHandler() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    private final Random random = new Random();
    private final Set<Item> oreBlocks = new HashSet<Item>() {{
        add(Item.getItemFromBlock(Blocks.iron_ore));
        add(Item.getItemFromBlock(Blocks.gold_ore));
        add(Item.getItemFromBlock(Block.getBlockById(581)));
        add(Item.getItemFromBlock(Block.getBlockById(582)));
        add(Item.getItemFromBlock(Block.getBlockById(583)));
        // Ajoutez ici d'autres minerais que vous souhaitez traiter
    }};

    @SubscribeEvent
    public void onHarvestDrops(BlockEvent.HarvestDropsEvent event) {

        // Vérifiez que le joueur utilise un ChromiumHammer avec Fortune 3
        if (event.harvester != null && event.harvester.getCurrentEquippedItem() != null) {
            List<ItemStack> newDrops = new ArrayList<>();
            ItemStack currentItem = event.harvester.getCurrentEquippedItem();
            int fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, currentItem);
            if ((currentItem.getItem() == fr.gamitypvp.gamitymods.items.Items.ChromiumHammer || currentItem.getItem() == Items.PlatiumHammer) && fortuneLevel > 0) {
                for (ItemStack drop : event.drops) {
                    ItemStack smeltingResult = FurnaceRecipes.smelting().getSmeltingResult(drop);
                    if (smeltingResult != null && oreBlocks.contains(drop.getItem())) {
                        ItemStack resultCopy = smeltingResult.copy();
                        resultCopy.stackSize = drop.stackSize;
                        // Ajouter une probabilité de doubler les drops
                        if(random.nextFloat() > 0.15 && random.nextFloat() < 0.65){ // 50% de chance de doubler les drops
                            resultCopy.stackSize *= 2;
                        }else if(random.nextFloat() > 0.65){ // 35% de chance de doubler les drops
                            resultCopy.stackSize *= 3;
                        }

                        newDrops.add(resultCopy);
                    }else{
                        ItemStack item = null;
                        if(Item.getItemFromBlock(Block.getBlockById(581)) == drop.getItem()){
                            item = new ItemStack(Item.getItemById(4465));
                        } else if(Item.getItemFromBlock(Block.getBlockById(582)) == drop.getItem()){
                            item = new ItemStack(Item.getItemById(4466));
                        } else if(Item.getItemFromBlock(Block.getBlockById(583)) == drop.getItem()){
                            item = new ItemStack(Item.getItemById(4467));
                        }else {
                            newDrops.add(drop);
                        }
                        if(item != drop && item != null) {
                            if (random.nextFloat() > 0.15 && random.nextFloat() < 0.65) { // 50% de chance de doubler les drops
                                item.stackSize *= 2;
                            } else if (random.nextFloat() > 0.65) { // 35% de chance de doubler les drops
                                item.stackSize *= 3;
                            }
                            newDrops.add(item);
                        }
                    }
                    // Ajoutez d'autres minerais ici
                }
                event.drops.clear();
                event.drops.addAll(newDrops);
            }
        }
    }
}
