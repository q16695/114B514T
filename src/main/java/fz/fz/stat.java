package fz.fz;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.md_5.bungee.api.ChatColor;

public class stat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length==1) {
            if(!Bukkit.getOnlinePlayers().contains(Bukkit.getPlayer(args[0]))) {
                sender.sendMessage(ChatColor.RED+"该玩家不在线");
            }
            else{
                Player player = Bukkit.getPlayer(args[0]);
                String players = PlaceholderAPI.setPlaceholders(player, "%player_name%");
                String joints = PlaceholderAPI.setPlaceholders(player, "%statistic_leave_game%");
                String datetime = PlaceholderAPI.setPlaceholders(player, "%statistic_deaths%");
                String gametes = PlaceholderAPI.setPlaceholders(player, " %statistic_time_played%");
                String killings = PlaceholderAPI.setPlaceholders(player, "%statistic_player_kills%");
                sender.sendMessage(ChatColor.AQUA + "-----------------");
                sender.sendMessage(ChatColor.GOLD + "玩家名称: " + players);
                sender.sendMessage(ChatColor.GOLD + "加入游戏次数: " + (Integer.parseInt(joints) + 1));
                sender.sendMessage(ChatColor.GOLD + "击杀次数：" + killings);
                sender.sendMessage(ChatColor.GOLD + "死亡次数: " + datetime);
                sender.sendMessage(ChatColor.GOLD + "游戏时长: " + gametes);
                sender.sendMessage(ChatColor.AQUA + "-----------------");
            }
        }
        else{
            Player player = (Player)sender;
            String players = PlaceholderAPI.setPlaceholders(player,"%player_name%");
            String joints = PlaceholderAPI.setPlaceholders(player,"%statistic_leave_game%");
            String datetime = PlaceholderAPI.setPlaceholders(player,"%statistic_deaths%");
            String gametes = PlaceholderAPI.setPlaceholders(player," %statistic_time_played%");
            String killings = PlaceholderAPI.setPlaceholders(player, "%statistic_player_kills%");
            sender.sendMessage(ChatColor.AQUA+"-----------------");
            sender.sendMessage(ChatColor.GOLD+"玩家名称: "+ players);
            sender.sendMessage(ChatColor.GOLD+"加入游戏次数: "+ (Integer.parseInt(joints)+1));
            sender.sendMessage(ChatColor.GOLD+"击杀次数："+ killings);
            sender.sendMessage(ChatColor.GOLD+"死亡次数: "+ datetime);
            sender.sendMessage(ChatColor.GOLD+"游戏时长: "+ gametes);
            sender.sendMessage(ChatColor.AQUA+"-----------------");
        }
        return false;
    }
}