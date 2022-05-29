package f114b514t.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class burrow implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length==0){
            Player player = (Player)sender;
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"setblock "+player.getLocation().getX()+" "+player.getLocation().getY()+" "+player.getLocation().getZ()+" obsidian");
        }
        return false;
    }
}
