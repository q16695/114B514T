package fz.fz;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class tpa implements CommandExecutor {
    public static Map<Player, Boolean> PlayerRequest = new HashMap<>();
    public static Map<Player, Location> PlayerLocation = new HashMap<>();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        PlayerRequest.putIfAbsent(((Player)sender),false);
        PlayerRequest.replace(((Player)sender),false);
        if(args[0].equals("help")){
            sender.sendMessage(ChatColor.GREEN+"-----------------------------");
            sender.sendMessage(ChatColor.GREEN+"/tpa 玩家 | TPA玩家");
            sender.sendMessage(ChatColor.GREEN+"/tpacancel 玩家 | 取消对玩家的TPA请求");
            sender.sendMessage(ChatColor.GREEN+"/tpaccept 玩家 | 同意玩家的TPA请求");
            sender.sendMessage(ChatColor.GREEN+"/tparefuse 玩家 | 拒绝玩家的TPA请求");
            sender.sendMessage(ChatColor.GREEN+"/tpa help | 显示此帮助");
            sender.sendMessage(ChatColor.GREEN+"-----------------------------");
        }
        else if(args.length==1) {
            if (!Bukkit.getPlayer(args[0]).equals(sender)) {
                if (Bukkit.getPlayer(args[0]).isOnline()) {
                    if (!PlayerRequest.get((Player) sender)) {
                        PlayerLocation.putIfAbsent(Bukkit.getPlayer(args[0]), Bukkit.getPlayer(args[0]).getLocation());
                        PlayerLocation.replace(Bukkit.getPlayer(args[0]), Bukkit.getPlayer(args[0]).getLocation());
                        Bukkit.getPlayer(args[0]).sendMessage(ChatColor.LIGHT_PURPLE + sender.getName() + " 想传送到你那里,使用/tpaccept接受请求");
                        sender.sendMessage(ChatColor.LIGHT_PURPLE + "成功对 " + Bukkit.getPlayer(args[0]).getName() + " 发起TPA请求,取消请用/tpacancel");
                        PlayerRequest.replace(((Player) sender), true);
                    } else {
                        sender.sendMessage(ChatColor.RED + "你已经发送了一个请求");
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "玩家不存在！");
                }
            }else{
                sender.sendMessage(ChatColor.RED+"不能对自己传送");
            }
        }
        else{
            sender.sendMessage(ChatColor.RED+"用法,/tpa 玩家");
        }
        return false;
    }
}
