package f114b514t.plugin.commands;

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
                sender.sendMessage(ChatColor.AQUA + (ChatColor.UNDERLINE+"-------------------------"));
                sender.sendMessage(ChatColor.DARK_AQUA + "玩家名称: " +ChatColor.WHITE+ players);
                sender.sendMessage(ChatColor.DARK_AQUA + "加入游戏: " + ChatColor.WHITE+(Integer.parseInt(joints) + 1) +ChatColor.DARK_AQUA+ " 次");
                sender.sendMessage(ChatColor.DARK_AQUA + "死亡计数: " + ChatColor.WHITE+datetime + ChatColor.DARK_AQUA+" 次");
                sender.sendMessage(ChatColor.DARK_AQUA + "击杀计数：" + ChatColor.WHITE+killings + ChatColor.DARK_AQUA+" 人");
                sender.sendMessage(ChatColor.DARK_AQUA + "游戏时长: " + ChatColor.GOLD + gametes);
                sender.sendMessage(ChatColor.AQUA + (ChatColor.UNDERLINE+"-------------------------"));
            }
        }
        else{
            Player player = (Player)sender;
            String players = PlaceholderAPI.setPlaceholders(player,"%player_name%");
            String joints = PlaceholderAPI.setPlaceholders(player,"%statistic_leave_game%");
            String datetime = PlaceholderAPI.setPlaceholders(player,"%statistic_deaths%");
            String gametes = PlaceholderAPI.setPlaceholders(player," %statistic_time_played%");
            String killings = PlaceholderAPI.setPlaceholders(player, "%statistic_player_kills%");
            sender.sendMessage(ChatColor.AQUA + (ChatColor.UNDERLINE+"-------------------------"));
            sender.sendMessage(ChatColor.DARK_AQUA + "玩家名称: " +ChatColor.WHITE+ players);
            sender.sendMessage(ChatColor.DARK_AQUA + "加入游戏: " + ChatColor.WHITE+(Integer.parseInt(joints) + 1) +ChatColor.DARK_AQUA+ " 次");
            sender.sendMessage(ChatColor.DARK_AQUA + "死亡计数: " + ChatColor.WHITE+datetime + ChatColor.DARK_AQUA+" 次");
            sender.sendMessage(ChatColor.DARK_AQUA + "击杀计数：" + ChatColor.WHITE+killings + ChatColor.DARK_AQUA+" 人");
            sender.sendMessage(ChatColor.DARK_AQUA + "游戏时长: " + ChatColor.GOLD + gametes);
            sender.sendMessage(ChatColor.AQUA + (ChatColor.UNDERLINE+"-------------------------"));
        }
        return false;
    }
}