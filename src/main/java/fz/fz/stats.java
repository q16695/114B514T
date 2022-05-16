package fz.fz;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class stats implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        float size = FileUtils.sizeOfDirectory(new File("C:/Users/Administrator/Desktop/114B514T/"+((Player)sender).getWorld().getName()));
        if(args.length==0) {
            sender.sendMessage(ChatColor.DARK_AQUA + "---------------------------");
            sender.sendMessage(ChatColor.DARK_RED + "共有 " + ChatColor.YELLOW + PlaceholderAPI.setPlaceholders(((Player) sender), "%server_unique_joins%") + ChatColor.DARK_RED + " 人来过这个服务器");
            sender.sendMessage(ChatColor.DARK_RED + "这个世界存档已经有 "+ ChatColor.YELLOW + (((size/1024)/1024)/1024) + ChatColor.DARK_RED + " GB");
            sender.sendMessage(ChatColor.DARK_AQUA + "---------------------------");
        }
        else{
            sender.sendMessage(ChatColor.DARK_AQUA + "---------------------------");
            sender.sendMessage(ChatColor.DARK_RED + "共有 " + ChatColor.YELLOW + PlaceholderAPI.setPlaceholders(((Player) sender), "%server_unique_joins%") + ChatColor.DARK_RED + " 人来过这个服务器");
            sender.sendMessage(ChatColor.DARK_RED + "这个世界存档已经有 "+ ChatColor.YELLOW + (((size/1024)/1024)/1024) + ChatColor.DARK_RED + " GB");
            sender.sendMessage(ChatColor.DARK_AQUA + "---------------------------");
        }
        return false;
    }
}
