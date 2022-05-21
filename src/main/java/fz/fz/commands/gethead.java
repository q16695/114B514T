package fz.fz.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class gethead implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"give " + sender.getName() + " minecraft:skull 1 3 {SkullOwner:"+args[0]+"}");
        return false;
    }
}
