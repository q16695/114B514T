package fz.fz.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class giveitem implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length>0) {
            if (Bukkit.getOnlinePlayers().contains(Bukkit.getPlayer(args[0]))) {
                Bukkit.getPlayer(args[0]).getInventory().addItem(((Player) sender).getInventory().getItemInMainHand());
            } else {
                sender.sendMessage(ChatColor.RED + "该玩家不在线");
            }
        }
        else{
            sender.sendMessage(ChatColor.RED+"用法,/giveitem <Player>");
        }
        return false;
    }
}
