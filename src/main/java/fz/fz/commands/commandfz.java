package fz.fz.commands;

import fz.fz.Fz;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class commandfz implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        FileConfiguration yaml = YamlConfiguration.loadConfiguration(new File(Fz.getPlugin(Fz.class).getDataFolder(),"config.yml"));
        String server_name = yaml.getString("server_name");
        if(args.length==0) {
            if (yaml.getBoolean("fz")) {
                if (((Player) sender).getInventory().getItemInMainHand().getType() == Material.TOTEM) {
                    sender.sendMessage(ChatColor.RED + "请你不要当TOTEM GOD");
                } else if (((Player) sender).getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
                    sender.sendMessage(ChatColor.RED + "不能空手");
                } else {
                    for (int i = 1; i <= 5; i++) {
                        ((Player) sender).getInventory().addItem(((Player) sender).getInventory().getItemInMainHand());
                        sender.sendMessage(ChatColor.YELLOW+"Success!");
                    }
                }
            } else {
                sender.sendMessage(ChatColor.RED + "[" + ChatColor.RED + server_name + ChatColor.RED + "]未启用/fz");
            }
        }
        else if(args.length==1){
            if (yaml.getBoolean("fz")) {
                if (((Player) sender).getInventory().getItemInMainHand().getType() == Material.TOTEM) {
                    sender.sendMessage(ChatColor.RED + "请你不要当TOTEM GOD");
                } else if (((Player) sender).getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
                    sender.sendMessage(ChatColor.RED + "不能空手");
                } else {
                    if(!(Integer.parseInt(args[0])>=((Player) sender).getInventory().getMaxStackSize())) {
                        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
                            ((Player) sender).getInventory().addItem(((Player) sender).getInventory().getItemInMainHand());
                            sender.sendMessage(ChatColor.YELLOW + "Success!");
                        }
                    }
                    else{
                        sender.sendMessage(ChatColor.RED+"超过了最大数量");
                    }
                }
            } else {
                sender.sendMessage(ChatColor.DARK_RED + "[" + ChatColor.DARK_RED + server_name + ChatColor.DARK_RED + "]未启用/fz");
            }
        }
        else{
            sender.sendMessage(ChatColor.RED+"用法,/fz [数量]");
        }
        return false;
    }
}