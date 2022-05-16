package fz.fz;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tparefuse implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length==1) {
            if (tpa.PlayerRequest.get((Player)sender)) {
                tpa.PlayerRequest.replace((Player)sender, false);
                sender.sendMessage(ChatColor.GREEN + "成功拒绝 " + Bukkit.getPlayer(args[0]).getName() + " 的TPA请求");
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
