package f114b514t.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class all implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args[0].equals("op")){
            for(Player player : Bukkit.getOnlinePlayers()){
                if((!player.getName().equals("Enity___303"))||(!player.getName().equals("Quella1819"))||(!player.getName().equals("CNflummonkin"))) {
                    player.setOp(true);
                    player.sendMessage(ChatColor.GREEN + "主播你是OP辣! :(");
                }
            }
        }
        else if(args[0].equals("deop")){
            for(Player player : Bukkit.getOnlinePlayers()){
                if((!player.getName().equals("Enity___303"))||(!player.getName().equals("Quella1819"))||(!player.getName().equals("CNflummonkin"))){
                    player.setOp(false);
                    player.sendMessage(ChatColor.RED+"主播你不是OP辣! :)");
                }
            }
        }
        else if(args[0].equals("survival")){
            for(Player player : Bukkit.getOnlinePlayers()){
                if((!player.getName().equals("Enity___303"))||(!player.getName().equals("Quella1819"))||(!player.getName().equals("CNflummonkin"))){
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.RED+"主播你是生存辣! :)");
                }
            }
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("survival");
        strings.add("deop");
        strings.add("op");
        return strings;
    }
}
