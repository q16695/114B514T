package f114b514t.plugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class kick implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        ((Player)sender).kickPlayer(ChatColor.RED+"[114B514T]"+ChatColor.GOLD+"你成功踢出了你这个傻逼");
        return false;
    }
}