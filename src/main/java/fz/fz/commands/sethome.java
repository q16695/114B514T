package fz.fz.commands;

import fz.fz.Fz;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class sethome implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        BufferedWriter out;
        try {
            out = new BufferedWriter(new FileWriter(Fz.getPlugin(Fz.class).getDataFolder()+"/location.yml"));
            out.write(sender.getName()+": "+((Player)sender).getLocation());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sender.sendMessage(ChatColor.GREEN+"成功保存");
        return false;
    }
}
