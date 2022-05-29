package f114b514t.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ViewUUID implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.GREEN+ Bukkit.getPlayer(args[0]).getName()+" 的UUID是 "+Bukkit.getPlayer(args[0]).getUniqueId());
        return false;
    }
}
