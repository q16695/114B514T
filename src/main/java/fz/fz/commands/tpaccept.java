package fz.fz.commands;

import fz.fz.commands.tpa;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tpaccept implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length==1) {
            if(tpa.PlayerRequest.get(Bukkit.getPlayer(args[0]))){
                Bukkit.getPlayer(args[0]).teleport(((Player)sender).getLocation());
                tpa.PlayerRequest.replace(Bukkit.getPlayer(args[0]), true);
            }
        }
        else{
            sender.sendMessage(ChatColor.RED+"用法,/tpaccept 玩家");
        }
        return false;
    }
}
