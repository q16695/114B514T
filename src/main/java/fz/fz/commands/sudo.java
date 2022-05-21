package fz.fz.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class sudo implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length==1){
            String string = "";
            for(int i=1;i<args.length;i++){
                string=string+args[i]+" ";
            }
            (Bukkit.getPlayer(args[0])).performCommand(string);
        }else{
            sender.sendMessage(ChatColor.RED+"/sudo <玩家名> <命令>");
        }
        return false;
    }
}
