package f114b514t.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Trickster_player implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String arg = "";
        for(int i=1;i<=args.length-1;i++){
            arg=arg+" "+args[i];
        }
        if(args.length>=2) {
            Bukkit.getPlayer(args[0]).chat(arg);
        }
        else{
            sender.sendMessage("没有足够的内容,用法/chatP <Player> <message>");
        }
        return false;
    }
}
