package com.xiaolin233.boxlisterner;

import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class BoxLucker implements Listener {
    @EventHandler
    public void onBox(InventoryOpenEvent e){
        Inventory inventory = e.getInventory();
        InventoryHolder holder = inventory.getHolder();
        if(holder instanceof Chest){
            Random random = new Random();
            int luck = random.nextInt(10)+1;
            switch (luck){
                case 1:
                    inventory.setItem(0,new ItemStack(Material.DIAMOND,1));
                    break;
                    case 2:
                        inventory.setItem(0,new ItemStack(Material.IRON_INGOT,1));
                        break;
                        case 3:
                            inventory.setItem(0,new ItemStack(Material.GOLD_INGOT,1));
                            break;
                            case 4:
                                inventory.setItem(0,new ItemStack(Material.IRON_SWORD,1));
                                break;
                                case 5:
                                    inventory.setItem(0,new ItemStack(Material.DIAMOND_SWORD,1));
                                    break;
                                    case 6:
                                        inventory.setItem(0,new ItemStack(Material.DIAMOND_CHESTPLATE,1));
                                        break;
                                        case 7:
                                            inventory.setItem(0,new ItemStack(Material.DIAMOND_LEGGINGS,1));
                                            break;
                                            case 8:
                                                inventory.setItem(0,new ItemStack(Material.DIAMOND_BOOTS,1));
                                                break;
                                                case 9:
                                                    inventory.setItem(0,new ItemStack(Material.DIAMOND_HELMET,1));
                                                    break;
                                                    case 10:
                                                        inventory.setItem(0,new ItemStack(Material.DIAMOND_AXE,1));
                                                        break;
                                                        default:
                                                            inventory.setItem(0,new ItemStack(Material.AIR,1));
                                                           break;
            }
        }
    }
}
