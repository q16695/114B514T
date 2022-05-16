package fz.fz;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ungmc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if((sender instanceof Player)&&(((Player) sender).getGameMode().equals(GameMode.CREATIVE))){
            ((Player) sender).setGameMode(GameMode.SURVIVAL);
        }
        return false;
    }
}
