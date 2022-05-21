package fz.fz.commands;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
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
        if(args.length==0) {
            if (sender instanceof Player) {
                float size = FileUtils.sizeOfDirectory(new File("C:/Users/Administrator/Desktop/114B514T/" + ((Player) sender).getWorld().getName()));
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
                sender.sendMessage(ChatColor.DARK_RED + "共有 " + ChatColor.YELLOW + Bukkit.getOfflinePlayers().length + ChatColor.DARK_RED + " 人来过这个服务器");
                sender.sendMessage(ChatColor.DARK_RED + "这个世界存档已经有 " + ChatColor.YELLOW + (((size / 1024) / 1024) / 1024) + ChatColor.DARK_RED + " GB");
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
            } else {
                float world = FileUtils.sizeOfDirectory(new File("C:/Users/Administrator/Desktop/114B514T/world"));
                float nether = FileUtils.sizeOfDirectory(new File("C:/Users/Administrator/Desktop/114B514T/world_nether"));
                float end = FileUtils.sizeOfDirectory(new File("C:/Users/Administrator/Desktop/114B514T/world_the_end"));
                float size = world + nether + end;
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
                sender.sendMessage(ChatColor.DARK_RED + "共有 " + ChatColor.YELLOW + Bukkit.getOfflinePlayers().length + ChatColor.DARK_RED + " 人来过这个服务器");
                sender.sendMessage(ChatColor.DARK_RED + "所有存档已经有 " + ChatColor.YELLOW + (((size / 1024) / 1024) / 1024) + ChatColor.DARK_RED + " GB");
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
            }
        }else{
            if (sender instanceof Player) {
                float size = FileUtils.sizeOfDirectory(new File("C:/Users/Administrator/Desktop/114B514T/" + ((Player) sender).getWorld().getName()));
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
                sender.sendMessage(ChatColor.DARK_RED + "共有 " + ChatColor.YELLOW + Bukkit.getOfflinePlayers().length + ChatColor.DARK_RED + " 人来过这个服务器");
                sender.sendMessage(ChatColor.DARK_RED + "这个世界存档已经有 " + ChatColor.YELLOW + (((size / 1024) / 1024) / 1024) + ChatColor.DARK_RED + " GB");
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
            } else {
                float world = FileUtils.sizeOfDirectory(new File("C:/Users/Administrator/Desktop/114B514T/world"));
                float nether = FileUtils.sizeOfDirectory(new File("C:/Users/Administrator/Desktop/114B514T/world_nether"));
                float end = FileUtils.sizeOfDirectory(new File("C:/Users/Administrator/Desktop/114B514T/world_the_end"));
                float size = world + nether + end;
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
                sender.sendMessage(ChatColor.DARK_RED + "共有 " + ChatColor.YELLOW + Bukkit.getOfflinePlayers().length + ChatColor.DARK_RED + " 人来过这个服务器");
                sender.sendMessage(ChatColor.DARK_RED + "所有存档已经有 " + ChatColor.YELLOW + (((size / 1024) / 1024) / 1024) + ChatColor.DARK_RED + " GB");
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
            }
        }
        return false;
    }
}
