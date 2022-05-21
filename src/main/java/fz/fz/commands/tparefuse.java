package fz.fz.commands;

import fz.fz.commands.tpa;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tparefuse implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = Bukkit.getPlayer(args[0]);
        if(args.length==1) {
            if (tpa.PlayerRequest.get(Bukkit.getPlayer(args[0]))) {
                tpa.PlayerRequest.replace(Bukkit.getPlayer(args[0]), false);
                sender.sendMessage(ChatColor.GREEN + "成功拒绝 " + Bukkit.getPlayer(args[0]).getName() + " 的TPA请求");
                player.sendMessage(ChatColor.RED + sender.getName() + " 拒绝了您的TPA请求");

            } else {
                sender.sendMessage(ChatColor.RED + "没有任何人对您发送TPA请求");
            }
        }
        else{
            sender.sendMessage(ChatColor.RED+"用法：/tparefuse 玩家");
        }
        return false;
    }
}
