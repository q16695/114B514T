package f114b514t.plugin.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class kill implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            player.setHealth(0);
        }else{
            sender.sendMessage(ChatColor.DARK_RED+"You are not a player. You cannot use the command for YOURSELF as a console");
        }
        return false;
    }
}
