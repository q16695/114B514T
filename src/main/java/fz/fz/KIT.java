package fz.fz;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class KIT implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"give "+sender.getName()+" minecraft:light_blue_shulker_box 1 0 {BlockEntityTag:{Items:[{Slot:0b,id:\"minecraft:diamond_sword\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:2s,id:19s},{lvl:2s,id:20s},{lvl:3s,id:21s},{lvl:3s,id:22s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:15},Damage:0s},{Slot:1b,id:\"minecraft:diamond_pickaxe\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:2b,id:\"minecraft:diamond_axe\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s}],RepairCost:31},Damage:0s},{Slot:3b,id:\"minecraft:diamond_shovel\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:33s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:15},Damage:0s},{Slot:4b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:5b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:6b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:7b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:8b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:9b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:10b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:11b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:12b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:13b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:3s,id:5s},{lvl:1s,id:6s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:14b,id:\"minecraft:diamond_chestplate\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:15b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:4s,id:3s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:16b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:4s,id:2s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s},{lvl:3s,id:8s}],RepairCost:7},Damage:0s},{Slot:17b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:18b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:19b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:20b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:21b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:22b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:23b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:24b,id:\"minecraft:ender_chest\",Count:64b,Damage:0s},{Slot:25b,id:\"minecraft:obsidian\",Count:64b,Damage:0s},{Slot:26b,id:\"minecraft:flint_and_steel\",Count:1b,tag:{ench:[{lvl:5s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s}]},display:{Name:\"迷你世界 ON TOP!!!!!!!!!!!!!!\"}}");
        return false;
    }
}
