package fz.fz.commands;

import fz.fz.commands.tpa;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tpacancel implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length==1) {
            if (tpa.PlayerRequest.get((Player)sender)) {
                tpa.PlayerRequest.replace((Player)sender, false);
                sender.sendMessage(ChatColor.GREEN + "成功取消对 " + Bukkit.getPlayer(args[0]).getName() + " 的请求");
                Bukkit.getPlayer(args[0]).sendMessage(sender.getName()+" 取消了对您的TPA请求");
            } else {
                sender.sendMessage(ChatColor.RED + "您没有对任何人发送TPA请求");
            }
        }
        else{
            sender.sendMessage(ChatColor.RED+"用法：/tpacancel 玩家");
        }
        return false;
    }
}
