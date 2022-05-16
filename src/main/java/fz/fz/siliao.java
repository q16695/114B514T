package fz.fz;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class siliao implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String arg = "";
        for(int i=1;i<=args.length-1;i++){
            arg=arg+" "+args[i];
        }
        if(args.length==0) {
            sender.sendMessage(ChatColor.RED+"用法,/tell <PlayerName> <Message>");
        }
        else{
            Player player = Bukkit.getPlayer(args[0]);
            if (sender instanceof Player) {
                if (!sender.getName().equals(args[1])) {
                    sender.sendMessage(ChatColor.LIGHT_PURPLE + "发至 " + player.getName() + " ：" + arg);
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "来自 " + sender.getName() + " ：" + arg);
                } else if (player.equals(sender)) {
                    sender.sendMessage(ChatColor.RED + "不能对自己发消息");
                }
            } else {
                sender.sendMessage(ChatColor.LIGHT_PURPLE + "发至 " + player.getName() + " ：" + arg);
                player.sendMessage(ChatColor.LIGHT_PURPLE + "来自 " + " Server " + " ：" + arg);
            }
        }
        return false;
    }
}
