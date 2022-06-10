package f114b514t.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class siliao implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String arg = "";
        if(args.length>=2) {
            for (int i = 1; i < args.length; i++) {
                arg = arg + " " + args[i];
            }
        }
        if(args.length>=2) {
            if(Bukkit.getOnlinePlayers().contains(Bukkit.getPlayer(args[0]))) {
                if (!(args[0].equals("server") || !(!args[0].startsWith("se") && ((!args[0].startsWith("S")) && ((!args[0].startsWith("s"))))))) {
                    if (sender instanceof Player) {
                        Player player = Bukkit.getPlayer(args[0]);
                        if (!sender.getName().equals(args[1])) {
                            sender.sendMessage(ChatColor.LIGHT_PURPLE + "发至 " + player.getName() + ": " + arg);
                            player.sendMessage(ChatColor.LIGHT_PURPLE + "来自 " + sender.getName() + ": " + arg);
                        } else if (player.getName().equals(sender.getName())) {
                            sender.sendMessage(ChatColor.RED + "不能对自己发消息");
                        }
                    } else {
                        sender.sendMessage(ChatColor.LIGHT_PURPLE + "发至 " + args[0] + ": " + arg);
                        Bukkit.getPlayer(args[0]).sendMessage(ChatColor.LIGHT_PURPLE + "来自 " + " Server " + ": " + arg);
                    }
                } else {
                    sender.sendMessage(ChatColor.LIGHT_PURPLE + "发至 Server: " + arg);
                    Bukkit.getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "来自 " + sender.getName() + ": " + arg);
                }
            }else{
                sender.sendMessage(ChatColor.RED+"该玩家不在线或不存在");
            }
        }
        else{
            sender.sendMessage(ChatColor.RED+"用法：/tell <玩家名> <内容>");
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Player> list = new ArrayList<>(Bukkit.getOnlinePlayers());
        for (Player player : list) {
            if(args[0].startsWith("se")||(args[0].startsWith("S"))||(args[0].startsWith("s"))){
                list1.add("Server");
            }
            if(player.getName().startsWith(args[0])) {
                list1.add(player.getName());
            }
        }
        return list1;
    }
}
