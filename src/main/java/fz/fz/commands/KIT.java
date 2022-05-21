package fz.fz.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class KIT implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length==0) {
            ((Player)sender).performCommand("give " + sender.getName() + " minecraft:light_blue_shulker_box 1 0 {BlockEntityTag:{Items:[{Slot:0b,id:\"minecraft:diamond_sword\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:2s,id:19s},{lvl:2s,id:20s},{lvl:3s,id:21s},{lvl:3s,id:22s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:15},Damage:0s},{Slot:1b,id:\"minecraft:diamond_pickaxe\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:2b,id:\"minecraft:diamond_axe\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s}],RepairCost:31},Damage:0s},{Slot:3b,id:\"minecraft:diamond_shovel\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:33s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:15},Damage:0s},{Slot:4b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:5b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:6b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:7b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:8b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:9b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:10b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:11b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:12b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:13b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:3s,id:5s},{lvl:1s,id:6s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:14b,id:\"minecraft:diamond_chestplate\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:15b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:4s,id:3s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:16b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:4s,id:2s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s},{lvl:3s,id:8s}],RepairCost:7},Damage:0s},{Slot:17b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:18b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:19b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:20b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:21b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:22b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:23b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:24b,id:\"minecraft:ender_chest\",Count:64b,Damage:0s},{Slot:25b,id:\"minecraft:obsidian\",Count:64b,Damage:0s},{Slot:26b,id:\"minecraft:flint_and_steel\",Count:1b,tag:{ench:[{lvl:5s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s}]},display:{Name:\"Common\"}}");
        }
        else if((args[0].equals("Common"))||(args[0].equals("common"))){
            ((Player)sender).performCommand("give " + sender.getName() + " minecraft:light_blue_shulker_box 1 0 {BlockEntityTag:{Items:[{Slot:0b,id:\"minecraft:diamond_sword\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:2s,id:19s},{lvl:2s,id:20s},{lvl:3s,id:21s},{lvl:3s,id:22s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:15},Damage:0s},{Slot:1b,id:\"minecraft:diamond_pickaxe\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:2b,id:\"minecraft:diamond_axe\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s}],RepairCost:31},Damage:0s},{Slot:3b,id:\"minecraft:diamond_shovel\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:33s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:15},Damage:0s},{Slot:4b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:5b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:6b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:7b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:8b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:9b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:10b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:11b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:12b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:13b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:3s,id:5s},{lvl:1s,id:6s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:14b,id:\"minecraft:diamond_chestplate\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:15b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:4s,id:3s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:16b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:4s,id:2s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s},{lvl:3s,id:8s}],RepairCost:7},Damage:0s},{Slot:17b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:18b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:19b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:20b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:21b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:22b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:23b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:24b,id:\"minecraft:ender_chest\",Count:64b,Damage:0s},{Slot:25b,id:\"minecraft:obsidian\",Count:64b,Damage:0s},{Slot:26b,id:\"minecraft:flint_and_steel\",Count:1b,tag:{ench:[{lvl:5s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s}]},display:{Name:\"Common\"}}");
        }
        else if((args[0].equals("RunGod"))||(args[0].equals("rungod"))){
            ((Player)sender).performCommand("give " + sender.getName() + " minecraft:silver_shulker_box 1 0 {BlockEntityTag:{CustomName:\"RunGod\",Items:[{Slot:0b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:1b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:2b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:3b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:4b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:5b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:6b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:7b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:8b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:9b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:10b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:11b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:12b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:13b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:14b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:15b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:16b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:17b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:18b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:19b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:20b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:21b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:22b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:23b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:24b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:25b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:26b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s}]},display:{Name:\"RunGod\"}}");
        }
        else if((args[0].equals("32kKit"))||(args[0].equals("32kkit"))){
            ((Player)sender).performCommand("give " + sender.getName() + " minecraft:white_shulker_box 1 0 {BlockEntityTag:{CustomName:\"32kKIT\",Items:[{Slot:0b,id:\"minecraft:diamond_sword\",Count:64b,tag:{ench:[{lvl:10s,id:16s},{lvl:10s,id:19s},{lvl:10s,id:20s},{lvl:5s,id:21s},{lvl:3s,id:22s},{lvl:32767s,id:34s}],display:{Lore:[\"§7锋利 enchantment.lebel.32767\"],Name:\"32K Weapon\"}},Damage:0s},{Slot:1b,id:\"minecraft:diamond_sword\",Count:64b,tag:{ench:[{lvl:32767s,id:16s},{lvl:10s,id:19s},{lvl:32767s,id:20s},{lvl:10s,id:21s},{lvl:32767s,id:34s}],display:{Name:\"Alpha's stacked 32k's\"}},Damage:0s},{Slot:2b,id:\"minecraft:diamond_sword\",Count:64b,tag:{ench:[{lvl:32767s,id:0s},{lvl:32767s,id:1s},{lvl:32767s,id:2s},{lvl:32767s,id:3s},{lvl:32767s,id:4s},{lvl:32767s,id:5s},{lvl:1s,id:6s},{lvl:32767s,id:7s},{lvl:32767s,id:8s},{lvl:32767s,id:9s},{lvl:32767s,id:16s},{lvl:32767s,id:17s},{lvl:32767s,id:18s},{lvl:32767s,id:19s},{lvl:32767s,id:20s},{lvl:32767s,id:21s},{lvl:32767s,id:22s},{lvl:32767s,id:32s},{lvl:1s,id:33s},{lvl:32767s,id:34s},{lvl:32767s,id:35s},{lvl:32767s,id:48s},{lvl:32767s,id:49s},{lvl:1s,id:50s},{lvl:1s,id:51s},{lvl:32767s,id:61s},{lvl:32767s,id:62s},{lvl:1s,id:70s},{lvl:1s,id:71s}],Unbreakable:1b,display:{Name:\"§aAlpha's Stacked 32k 's\"}},Damage:0s},{Slot:3b,id:\"minecraft:bow\",Count:64b,tag:{ench:[{lvl:5s,id:48s},{lvl:1s,id:50s},{lvl:1s,id:51s},{lvl:1s,id:71s}],Unbreakable:1b},Damage:0s},{Slot:4b,id:\"minecraft:diamond_pickaxe\",Count:64b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:71s}],Unbreakable:1b},Damage:0s},{Slot:5b,id:\"minecraft:golden_pickaxe\",Count:64b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:33s},{lvl:1s,id:71s}],RepairCost:1,Unbreakable:1b,HideFlags:7,display:{Lore:[\"§e持有人§f：<DTing_CN>\",\"§9§l附 魔§f：[精准采集.不可破坏]\"],Name:\"§6建筑师之稿\"}},Damage:0s},{Slot:6b,id:\"minecraft:diamond_axe\",Count:64b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:71s}],Unbreakable:1b},Damage:0s},{Slot:7b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:1s,id:71s}],Unbreakable:1b,AttributeModifiers:[{UUIDMost:2133141227569395592L,UUIDLeast:-1653746915254639826L,Amount:251,AttributeName:\"generic.maxHealth\",Operation:0,Name:\"generic.maxHealth\"}]},Damage:0s},{Slot:8b,id:\"minecraft:diamond_chestplate,Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:1s,id:71s}],Unbreakable:1b,AttributeModifiers:[{UUIDMost:2892892372399596428L,UUIDLeast:-1273969869213691474L,Amount:251,AttributeName:\"generic.maxHealth\",Operation:0,Name:\"generic.maxHealth\"}]},Damage:0s},{Slot:9b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:1s,id:71s}],Unbreakable:1b,AttributeModifiers:[{UUIDMost:2175524231853274915L,UUIDLeast:-1494423717572957776L,Amount:251,AttributeName:\"generic.maxHealth\",Operation:0,Name:\"generic.maxHealth\"}]},Damage:0s},{Slot:10b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:1s,id:71s}],Unbreakable:1b,AttributeModifiers:[{UUIDMost:2311313726686948651L,UUIDLeast:-1199917882853873385L,Amount:251,AttributeName:\"generic.maxHealth\",Operation:0,Name:\"generic.maxHealth\"}]},Damage:0s},{Slot:11b,id:\"minecraft:mob_spawner\",Count:64b,Damage:0s},{Slot:12b,id:\"minecraft:bedrock\",Count:64b,Damage:0s},{Slot:13b,id:\"minecraft:end_portal_frame\",Count:64b,Damage:0s},{Slot:14b,id:\"minecraft:totem_of_undying\",Count:64b,Damage:0s},{Slot:15b,id:\"minecraft:totem_of_undying\",Count:64b,Damage:0s},{Slot:16b,id:\"minecraft:totem_of_undying\",Count:64b,Damage:0s},{Slot:17b,id:\"minecraft:totem_of_undying\",Count:64b,Damage:0s},{Slot:18b,id:\"minecraft:bed\",Count:1b,tag:{ench:[{lvl:32767s,id:16s},{lvl:10s,id:19s},{lvl:32767s,id:20s},{lvl:10s,id:21s},{lvl:32767s,id:34s}],display:{Name:\"§cMurmy's bed 32k\"}},Damage:14s},{Slot:19b,id:\"minecraft:potion\",Count:1b,tag:{CustomPotionEffects:[{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:5b,Amplifier:126b},{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:10b,Amplifier:126b}],Potion:\"minecraft:empty\"},Damage:0s},{Slot:20b,id:\"minecraft:potion\",Count:1b,tag:{CustomPotionEffects:[{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:3b,Amplifier:126b},{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:11b,Amplifier:126b}],Potion:\"minecraft:empty\"},Damage:0s},{Slot:21b,id:\"minecraft:potion\",Count:1b,tag:{CustomPotionEffects:[{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:12b,Amplifier:126b},{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:21b,Amplifier:126b}],Potion:\"minecraft:empty\"},Damage:0s},{Slot:22b,id:\"minecraft:potion\",Count:1b,tag:{CustomPotionEffects:[{Ambient:0b,ShowParticles:0b,Duration:1999980,Id:22b,Amplifier:126b}],Potion:\"minecraft:empty\"},Damage:0s}]},display:{Name:\"32kKIT\"}}");
        }
        else if((args[0].equals("PistonCrystal"))||(args[0].equals("pistoncrystal"))){
            ((Player)sender).performCommand("give " + sender.getName() + " minecraft:purple_shulker_box 1 0 {BlockEntityTag:{CustomName:\"PistonCrystal\",Items:[{Slot:0b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:63},Damage:0s},{Slot:1b,id:\"minecraft:diamond_chestplate\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:63},Damage:0s},{Slot:2b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:4s,id:3s},{lvl:2s,id:7s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:15},Damage:0s},{Slot:3b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:63},Damage:0s},{Slot:4b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:5b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:6b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:7b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:8b,id:\"minecraft:obsidian\",Count:64b,Damage:0s},{Slot:9b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:10b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:11b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:12b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:13b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:14b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:15b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:16b,id:\"minecraft:redstone_block\",Count:64b,Damage:0s},{Slot:17b,id:\"minecraft:piston\",Count:64b,Damage:0s},{Slot:18b,id:\"minecraft:chorus_fruit\",Count:64b,Damage:0s},{Slot:19b,id:\"minecraft:ender_chest\",Count:64b,Damage:0s},{Slot:20b,id:\"minecraft:diamond_pickaxe\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:7},Damage:0s},{Slot:21b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:22b,id:\"minecraft:totem_of_undying\",Count:64b,Damage:0s},{Slot:23b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:24b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:25b,id:\"minecraft:redstone_block\",Count:64b,Damage:0s},{Slot:26b,id:\"minecraft:piston\",Count:64b,Damage:0s}]},display:{Name:\"PistonCrystal\"}}");
        }
        else if(args[0].equals("list")){
            sender.sendMessage(ChatColor.GREEN + (ChatColor.UNDERLINE+"--------------------------------"));
            sender.sendMessage(ChatColor.GREEN + "Kit：Common");
            sender.sendMessage(ChatColor.GREEN + "Kit：PistonCrystal");
            sender.sendMessage(ChatColor.GREEN + "Kit：32kKit");
            sender.sendMessage(ChatColor.GREEN + "Kit：RunGod");
            sender.sendMessage(ChatColor.GREEN + (ChatColor.UNDERLINE+"--------------------------------"));
        }
        else if(args[0].equals("gui")){
            Inventory inventory = Bukkit.createInventory(null,3*9,"KIT");
            ItemStack Common = new ItemStack(Material.END_CRYSTAL,1);
            Common.getItemMeta().setDisplayName("普通KIT");
            ItemStack PistonCrystal = new ItemStack(Material.PISTON_BASE,1);
            PistonCrystal.getItemMeta().setDisplayName("活塞水晶KIT");
            ItemStack kKit = new ItemStack(Material.DIAMOND_SWORD,1);
            kKit.getItemMeta().setDisplayName("32k fag");
            ItemStack RunGod = new ItemStack(Material.ELYTRA,1);
            RunGod.addEnchantment(Enchantment.DURABILITY,3);
            RunGod.addEnchantment(Enchantment.MENDING,1);
            RunGod.getItemMeta().setDisplayName("逃逸大神");
            inventory.setItem(10,Common);
            inventory.setItem(12,PistonCrystal);
            inventory.setItem(14,kKit);
            inventory.setItem(16,RunGod);
            ((Player)sender).openInventory(inventory);
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if(args.length==1){
            List<String> list = new ArrayList<>();
            list.add("list");
            list.add("Common");
            list.add("PistonCrystal");
            list.add("32kKit");
            list.add("RunGod");
            list.add("gui");
            return list;
        }
        return null;
    }
}
