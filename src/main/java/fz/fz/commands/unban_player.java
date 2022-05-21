package fz.fz.commands;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.ArrayList;
import java.util.List;

public class unban_player implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Bukkit.getBanList(BanList.Type.NAME).pardon(args[0]);
        sender.sendMessage(ChatColor.GREEN+"成功解封 "+ChatColor.YELLOW+args[0]);
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        ArrayList<String> list = new ArrayList<>();
        if(args.length==1) {
            for (Object sss : Bukkit.getBannedPlayers().toArray()) {
                list.add(sss.toString());
            }
        }
        return list;
    }
}
