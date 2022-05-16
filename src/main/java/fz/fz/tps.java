package fz.fz;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tps implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.GOLD+"TPS from last 1m, 5m, 15m: "+ChatColor.GREEN+me.clip.placeholderapi.PlaceholderAPI.setPlaceholders(((Player)sender),"%server_tps%"));
        return false;
    }
}
