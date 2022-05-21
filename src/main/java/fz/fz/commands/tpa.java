package fz.fz.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tpa implements CommandExecutor, TabExecutor {
    public static Map<Player, Boolean> PlayerRequest = new HashMap<>();
    public static Map<Player, Location> PlayerLocation = new HashMap<>();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        PlayerRequest.putIfAbsent(((Player)sender),false);
        PlayerRequest.replace(((Player)sender),false);
        if(args[0].equals("help")){
            sender.sendMessage(ChatColor.AQUA+"=======================================");
            sender.sendMessage(ChatColor.GRAY+"/tpa <玩家名> - "+ChatColor.YELLOW+"TPA玩家");
            sender.sendMessage(ChatColor.GRAY+"/tpacancel <玩家名> - "+ChatColor.YELLOW+"取消对玩家的TPA请求");
            sender.sendMessage(ChatColor.GRAY+"/tpaccept <玩家名> - "+ChatColor.YELLOW+"同意玩家的TPA请求");
            sender.sendMessage(ChatColor.GRAY+"/tparefuse <玩家名> - "+ChatColor.YELLOW+"拒绝玩家的TPA请求");
            sender.sendMessage(ChatColor.GRAY+"/tpa help - "+ChatColor.YELLOW+"显示此帮助");
            sender.sendMessage(ChatColor.AQUA+"=======================================");
        }
        else if(args.length==1) {
            if (!Bukkit.getPlayer(args[0]).equals(sender)) {
                if(Bukkit.getPlayer(args[0]).isOnline()) {
                    if (!PlayerRequest.get((Player) sender)) {
                        PlayerLocation.putIfAbsent(Bukkit.getPlayer(args[0]), Bukkit.getPlayer(args[0]).getLocation());
                        PlayerLocation.replace(Bukkit.getPlayer(args[0]), Bukkit.getPlayer(args[0]).getLocation());
                        Bukkit.getPlayer(args[0]).sendMessage(ChatColor.LIGHT_PURPLE + sender.getName() + " 想传送到你那里,使用/tpaccept接受请求");
                        sender.sendMessage(ChatColor.LIGHT_PURPLE + "成功对 " + Bukkit.getPlayer(args[0]).getName() + " 发起TPA请求,取消请用/tpacancel");
                        PlayerRequest.replace(((Player) sender), true);
                    }
                } else{
                    sender.sendMessage(ChatColor.RED+"玩家不存在！");
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

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("help");
        return list;
    }
}
