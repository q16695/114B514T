package f114b514t.plugin.commands;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
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
                float size = FileUtils.sizeOfDirectory(new File(((Player)sender).getWorld().getWorldFolder().getPath()));
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
                sender.sendMessage(ChatColor.DARK_RED + "共有 " + ChatColor.YELLOW + Bukkit.getOfflinePlayers().length + ChatColor.DARK_RED + " 人来过这个服务器");
                sender.sendMessage(ChatColor.DARK_RED + "这个世界存档已经有 " + ChatColor.YELLOW + (((size / 1024) / 1024) / 1024) + ChatColor.DARK_RED + " GB");
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
            } else {
                float size = 0.0F;
                for(World world : Bukkit.getWorlds()) {
                    size+=FileUtils.sizeOfDirectory(new File(world.getWorldFolder().getPath()));
                }
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
                sender.sendMessage(ChatColor.DARK_RED + "共有 " + ChatColor.YELLOW + Bukkit.getOfflinePlayers().length + ChatColor.DARK_RED + " 人来过这个服务器");
                sender.sendMessage(ChatColor.DARK_RED + "所有存档已经有 " + ChatColor.YELLOW + (((size / 1024) / 1024) / 1024) + ChatColor.DARK_RED + " GB");
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
            }
        }else{
            if (sender instanceof Player) {
                float size = FileUtils.sizeOfDirectory(new File(((Player)sender).getWorld().getWorldFolder().getPath()));
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
                sender.sendMessage(ChatColor.DARK_RED + "共有 " + ChatColor.YELLOW + Bukkit.getOfflinePlayers().length + ChatColor.DARK_RED + " 人来过这个服务器");
                sender.sendMessage(ChatColor.DARK_RED + "这个世界存档已经有 " + ChatColor.YELLOW + (((size / 1024) / 1024) / 1024) + ChatColor.DARK_RED + " GB");
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
            } else {
                float size = 0.0F;
                for(World world : Bukkit.getWorlds()) {
                    size+=FileUtils.sizeOfDirectory(new File(world.getWorldFolder().getPath()));
                }
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
                sender.sendMessage(ChatColor.DARK_RED + "共有 " + ChatColor.YELLOW + Bukkit.getOfflinePlayers().length + ChatColor.DARK_RED + " 人来过这个服务器");
                sender.sendMessage(ChatColor.DARK_RED + "所有存档已经有 " + ChatColor.YELLOW + (((size / 1024) / 1024) / 1024) + ChatColor.DARK_RED + " GB");
                sender.sendMessage(ChatColor.DARK_AQUA + (ChatColor.UNDERLINE + "---------------------------"));
            }
        }
        return false;
    }
}
