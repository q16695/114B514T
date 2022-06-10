package f114b514t.plugin.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ungmc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            if (((Player) sender).getGameMode().equals(GameMode.CREATIVE)) {
                ((Player) sender).setGameMode(GameMode.SURVIVAL);
                ((Player)sender).spigot().sendMessage(ChatMessageType.ACTION_BAR,new TextComponent(ChatColor.RED+"生存辣"));
            }
            else{
                ((Player)sender).spigot().sendMessage(ChatMessageType.ACTION_BAR,new TextComponent(ChatColor.RED+"你不是创造"));
            }
        }
        else{
            sender.sendMessage(ChatColor.DARK_RED+"You are not a player. You cannot use the command for YOURSELF as a console");
        }
        return false;
    }
}
