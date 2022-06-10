package f114b514t.plugin.commands;

import f114b514t.plugin.plugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.permissions.Permission;

import java.util.List;

public class permissions implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(Bukkit.getPlayer(args[0]).hasPermission(args[1])) {
            Bukkit.getPlayer(args[0]).addAttachment(plugin.getPlugin(plugin.class), args[1], true);
            sender.sendMessage(ChatColor.GREEN+"将 "+ChatColor.AQUA+args[0]+ChatColor.GREEN+" 的权限 "+ChatColor.AQUA+args[1]+ChatColor.GREEN+" 设为 "+ChatColor.AQUA+" true");
        }
        else if(!Bukkit.getPlayer(args[0]).hasPermission(args[1])) {
            Bukkit.getPlayer(args[0]).addAttachment(plugin.getPlugin(plugin.class), args[1], false);
            sender.sendMessage(ChatColor.GREEN+"将 "+ChatColor.AQUA+args[0]+ChatColor.GREEN+" 的权限 "+ChatColor.AQUA+args[1]+ChatColor.GREEN+" 设为 "+ChatColor.AQUA+" false");
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if(args.length==2){

        }
        return null;
    }
}
