package fz.fz;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class say implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String arg = "";
        for(int i=1;i<=args.length-1;i++){
            arg=arg+" "+args[i];
        }
        if(sender instanceof Player){
            for(Player player : Bukkit.getOnlinePlayers()){
                player.sendMessage(ChatColor.RED+"["+sender.getName()+"]"+ChatColor.YELLOW+arg);
                Fz.getPlugin(Fz.class).getLogger().info(ChatColor.RED+"["+sender.getName()+"]"+ChatColor.YELLOW+arg);
            }
        }
        else{
            for(Player player : Bukkit.getOnlinePlayers()){
                player.sendMessage(ChatColor.RED+"[Server]" + ChatColor.YELLOW + arg);
                Fz.getPlugin(Fz.class).getLogger().info(ChatColor.RED+"[Server]" + ChatColor.YELLOW + arg);
            }
        }
        return false;
    }
}
