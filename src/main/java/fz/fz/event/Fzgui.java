package fz.fz.event;

import fz.fz.Fz;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Fzgui implements Listener {
    @EventHandler
    public void Fzsgui(InventoryClickEvent evt){
        if((evt.getClickedInventory().getTitle().equals("复制"))||(evt.getClickedInventory().getName().equals("复制"))){
            evt.setCancelled(true);
            if(evt.getCurrentItem().getType().equals(Material.COMMAND)){
                if(evt.getWhoClicked().hasPermission("114b514t.fz.use")){
                    evt.getWhoClicked().addAttachment(Fz.getPlugin(Fz.class),"114b514t.fz.use",false);
                    evt.getWhoClicked().sendMessage(ChatColor.GREEN+"你成功的关闭了/fz");
                }
                else if(!evt.getWhoClicked().hasPermission("114b514t.fz.use")){
                    evt.getWhoClicked().addAttachment(Fz.getPlugin(Fz.class),"114b514t.fz.use",true);
                    evt.getWhoClicked().sendMessage(ChatColor.GREEN+"你成功的开启/fz");
                }
            }else if(evt.getCurrentItem().getType().equals(Material.EXP_BOTTLE)){
                if(evt.getWhoClicked().hasPermission("114b514t.exp_dupe.use")){
                    evt.getWhoClicked().addAttachment(Fz.getPlugin(Fz.class),"114b514t.exp_dupe.use",false);
                    evt.getWhoClicked().sendMessage(ChatColor.GREEN+"你成功的关闭了经验瓶复制");
                }
                else if(!evt.getWhoClicked().hasPermission("114b514t.exp_dupe.use")){
                    evt.getWhoClicked().addAttachment(Fz.getPlugin(Fz.class),"114b514t.exp_dupe.use",true);
                    evt.getWhoClicked().sendMessage(ChatColor.GREEN+"你成功的开启经验瓶复制");
                }
            }
        }else if((evt.getClickedInventory().getTitle().equals("KIT"))||(evt.getClickedInventory().getName().equals("KIT"))){
            evt.setCancelled(true);
            if(evt.getCurrentItem().getType().equals(Material.DIAMOND_SWORD)){
                ((Player)evt.getWhoClicked()).performCommand("give " + evt.getWhoClicked().getName() + " minecraft:white_shulker_box 1 0 {BlockEntityTag:{CustomName:\"32kKIT\",Items:[{Slot:0b,id:\"minecraft:diamond_sword\",Count:64b,tag:{ench:[{lvl:10s,id:16s},{lvl:10s,id:19s},{lvl:10s,id:20s},{lvl:5s,id:21s},{lvl:3s,id:22s},{lvl:32767s,id:34s}],display:{Lore:[\"§7锋利 enchantment.lebel.32767\"],Name:\"32K Weapon\"}},Damage:0s},{Slot:1b,id:\"minecraft:diamond_sword\",Count:64b,tag:{ench:[{lvl:32767s,id:16s},{lvl:10s,id:19s},{lvl:32767s,id:20s},{lvl:10s,id:21s},{lvl:32767s,id:34s}],display:{Name:\"Alpha's stacked 32k's\"}},Damage:0s},{Slot:2b,id:\"minecraft:diamond_sword\",Count:64b,tag:{ench:[{lvl:32767s,id:0s},{lvl:32767s,id:1s},{lvl:32767s,id:2s},{lvl:32767s,id:3s},{lvl:32767s,id:4s},{lvl:32767s,id:5s},{lvl:1s,id:6s},{lvl:32767s,id:7s},{lvl:32767s,id:8s},{lvl:32767s,id:9s},{lvl:32767s,id:16s},{lvl:32767s,id:17s},{lvl:32767s,id:18s},{lvl:32767s,id:19s},{lvl:32767s,id:20s},{lvl:32767s,id:21s},{lvl:32767s,id:22s},{lvl:32767s,id:32s},{lvl:1s,id:33s},{lvl:32767s,id:34s},{lvl:32767s,id:35s},{lvl:32767s,id:48s},{lvl:32767s,id:49s},{lvl:1s,id:50s},{lvl:1s,id:51s},{lvl:32767s,id:61s},{lvl:32767s,id:62s},{lvl:1s,id:70s},{lvl:1s,id:71s}],Unbreakable:1b,display:{Name:\"§aAlpha's Stacked 32k 's\"}},Damage:0s},{Slot:3b,id:\"minecraft:bow\",Count:64b,tag:{ench:[{lvl:5s,id:48s},{lvl:1s,id:50s},{lvl:1s,id:51s},{lvl:1s,id:71s}],Unbreakable:1b},Damage:0s},{Slot:4b,id:\"minecraft:diamond_pickaxe\",Count:64b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:71s}],Unbreakable:1b},Damage:0s},{Slot:5b,id:\"minecraft:golden_pickaxe\",Count:64b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:33s},{lvl:1s,id:71s}],RepairCost:1,Unbreakable:1b,HideFlags:7,display:{Lore:[\"§e持有人§f：<DTing_CN>\",\"§9§l附 魔§f：[精准采集.不可破坏]\"],Name:\"§6建筑师之稿\"}},Damage:0s},{Slot:6b,id:\"minecraft:diamond_axe\",Count:64b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:71s}],Unbreakable:1b},Damage:0s},{Slot:7b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:1s,id:71s}],Unbreakable:1b,AttributeModifiers:[{UUIDMost:2133141227569395592L,UUIDLeast:-1653746915254639826L,Amount:251,AttributeName:\"generic.maxHealth\",Operation:0,Name:\"generic.maxHealth\"}]},Damage:0s},{Slot:8b,id:\"minecraft:diamond_chestplate\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:1s,id:71s}],Unbreakable:1b,AttributeModifiers:[{UUIDMost:2892892372399596428L,UUIDLeast:-1273969869213691474L,Amount:251,AttributeName:\"generic.maxHealth\",Operation:0,Name:\"generic.maxHealth\"}]},Damage:0s},{Slot:9b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:1s,id:71s}],Unbreakable:1b,AttributeModifiers:[{UUIDMost:2175524231853274915L,UUIDLeast:-1494423717572957776L,Amount:251,AttributeName:\"generic.maxHealth\",Operation:0,Name:\"generic.maxHealth\"}]},Damage:0s},{Slot:10b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:1s,id:71s}],Unbreakable:1b,AttributeModifiers:[{UUIDMost:2311313726686948651L,UUIDLeast:-1199917882853873385L,Amount:251,AttributeName:\"generic.maxHealth\",Operation:0,Name:\"generic.maxHealth\"}]},Damage:0s},{Slot:11b,id:\"minecraft:mob_spawner\",Count:64b,Damage:0s},{Slot:12b,id:\"minecraft:bedrock\",Count:64b,Damage:0s},{Slot:13b,id:\"minecraft:end_portal_frame\",Count:64b,Damage:0s},{Slot:14b,id:\"minecraft:totem_of_undying\",Count:64b,Damage:0s},{Slot:15b,id:\"minecraft:totem_of_undying\",Count:64b,Damage:0s},{Slot:16b,id:\"minecraft:totem_of_undying\",Count:64b,Damage:0s},{Slot:17b,id:\"minecraft:totem_of_undying\",Count:64b,Damage:0s},{Slot:18b,id:\"minecraft:bed\",Count:1b,tag:{ench:[{lvl:32767s,id:16s},{lvl:10s,id:19s},{lvl:32767s,id:20s},{lvl:10s,id:21s},{lvl:32767s,id:34s}],display:{Name:\"§cMurmy's bed 32k\"}},Damage:14s},{Slot:19b,id:\"minecraft:potion\",Count:1b,tag:{CustomPotionEffects:[{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:5b,Amplifier:126b},{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:10b,Amplifier:126b}],Potion:\"minecraft:empty\"},Damage:0s},{Slot:20b,id:\"minecraft:potion\",Count:1b,tag:{CustomPotionEffects:[{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:3b,Amplifier:126b},{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:11b,Amplifier:126b}],Potion:\"minecraft:empty\"},Damage:0s},{Slot:21b,id:\"minecraft:potion\",Count:1b,tag:{CustomPotionEffects:[{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:12b,Amplifier:126b},{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:21b,Amplifier:126b}],Potion:\"minecraft:empty\"},Damage:0s},{Slot:22b,id:\"minecraft:potion\",Count:1b,tag:{CustomPotionEffects:[{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:22b,Amplifier:126b}],Potion:\"minecraft:empty\"},Damage:0s}]},display:{Name:\"32kKIT\"}}");
            }else if(evt.getCurrentItem().getType().equals(Material.END_CRYSTAL)){
                ((Player)evt.getWhoClicked()).performCommand("give " + evt.getWhoClicked().getName() + " minecraft:light_blue_shulker_box 1 0 {BlockEntityTag:{Items:[{Slot:0b,id:\"minecraft:diamond_sword\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:2s,id:19s},{lvl:2s,id:20s},{lvl:3s,id:21s},{lvl:3s,id:22s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:15},Damage:0s},{Slot:1b,id:\"minecraft:diamond_pickaxe\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:2b,id:\"minecraft:diamond_axe\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s}],RepairCost:31},Damage:0s},{Slot:3b,id:\"minecraft:diamond_shovel\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:33s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:15},Damage:0s},{Slot:4b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:5b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:6b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:7b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:8b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:9b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:10b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:11b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:12b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:13b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:3s,id:5s},{lvl:1s,id:6s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:14b,id:\"minecraft:diamond_chestplate\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:15b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:4s,id:3s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:16b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:4s,id:2s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s},{lvl:3s,id:8s}],RepairCost:7},Damage:0s},{Slot:17b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:18b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:19b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:20b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:21b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:22b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:23b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:24b,id:\"minecraft:ender_chest\",Count:64b,Damage:0s},{Slot:25b,id:\"minecraft:obsidian\",Count:64b,Damage:0s},{Slot:26b,id:\"minecraft:flint_and_steel\",Count:1b,tag:{ench:[{lvl:5s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s}]},display:{Name:\"Common\"}}");
            }else if(evt.getCurrentItem().getType().equals(Material.PISTON_BASE)){
                ((Player)evt.getWhoClicked()).performCommand("give " + evt.getWhoClicked().getName() + " minecraft:purple_shulker_box 1 0 {BlockEntityTag:{CustomName:\"PistonCrystal\",Items:[{Slot:0b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:63},Damage:0s},{Slot:1b,id:\"minecraft:diamond_chestplate\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:63},Damage:0s},{Slot:2b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:4s,id:3s},{lvl:2s,id:7s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:15},Damage:0s},{Slot:3b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:63},Damage:0s},{Slot:4b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:5b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:6b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:7b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:8b,id:\"minecraft:obsidian\",Count:64b,Damage:0s},{Slot:9b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:10b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:11b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:12b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:13b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:14b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:15b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:16b,id:\"minecraft:redstone_block\",Count:64b,Damage:0s},{Slot:17b,id:\"minecraft:piston\",Count:64b,Damage:0s},{Slot:18b,id:\"minecraft:chorus_fruit\",Count:64b,Damage:0s},{Slot:19b,id:\"minecraft:ender_chest\",Count:64b,Damage:0s},{Slot:20b,id:\"minecraft:diamond_pickaxe\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:7},Damage:0s},{Slot:21b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:22b,id:\"minecraft:totem_of_undying\",Count:64b,Damage:0s},{Slot:23b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:24b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:25b,id:\"minecraft:redstone_block\",Count:64b,Damage:0s},{Slot:26b,id:\"minecraft:piston\",Count:64b,Damage:0s}]},display:{Name:\"PistonCrystal\"}}");
            }else if(evt.getCurrentItem().getType().equals(Material.ELYTRA)){
                ((Player)evt.getWhoClicked()).performCommand("give " + evt.getWhoClicked().getName() + " minecraft:silver_shulker_box 1 0 {BlockEntityTag:{CustomName:\"RunGod\",Items:[{Slot:0b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:1b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:2b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:3b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:4b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:5b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:6b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:7b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:8b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:9b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:10b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:11b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:12b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:13b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:14b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:15b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:16b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:17b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:18b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:19b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:20b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:21b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:22b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:23b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:24b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:25b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:26b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s}]},display:{Name:\"RunGod\"}}");
            }else{
                ((Player)evt.getWhoClicked()).performCommand("give " + evt.getWhoClicked().getName() + " minecraft:light_blue_shulker_box 1 0 {BlockEntityTag:{Items:[{Slot:0b,id:\"minecraft:diamond_sword\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:2s,id:19s},{lvl:2s,id:20s},{lvl:3s,id:21s},{lvl:3s,id:22s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:15},Damage:0s},{Slot:1b,id:\"minecraft:diamond_pickaxe\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:2b,id:\"minecraft:diamond_axe\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s}],RepairCost:31},Damage:0s},{Slot:3b,id:\"minecraft:diamond_shovel\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:33s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:15},Damage:0s},{Slot:4b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:5b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:6b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:7b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:8b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:9b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:10b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:11b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:12b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:13b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:3s,id:5s},{lvl:1s,id:6s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:14b,id:\"minecraft:diamond_chestplate\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:15b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:4s,id:3s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:16b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:4s,id:2s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s},{lvl:3s,id:8s}],RepairCost:7},Damage:0s},{Slot:17b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:18b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:19b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:20b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:21b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:22b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:23b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:24b,id:\"minecraft:ender_chest\",Count:64b,Damage:0s},{Slot:25b,id:\"minecraft:obsidian\",Count:64b,Damage:0s},{Slot:26b,id:\"minecraft:flint_and_steel\",Count:1b,tag:{ench:[{lvl:5s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s}]},display:{Name:\"Common\"}}");
            }
        }
    }
}
