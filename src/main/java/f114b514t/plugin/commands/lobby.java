package f114b514t.plugin.commands;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class lobby implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.RED+(ChatColor.UNDERLINE + "登录服人数： "+ ChatColor.YELLOW+ PlaceholderAPI.setPlaceholders(((Player)sender),"%bungee_lobby%")));
        return false;
    }
}
