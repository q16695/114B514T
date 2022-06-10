package f114b514t.plugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.yaml.snakeyaml.Yaml;

import java.io.File;

public class kick implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            ((Player) sender).kickPlayer(ChatColor.RED + YamlConfiguration.loadConfiguration(new File(f114b514t.plugin.plugin.getPlugin(f114b514t.plugin.plugin.class).getDataFolder(),"config.yml")).getString("server_name") + ChatColor.GOLD + "你成功踢出了你这个傻逼");
        }else{
            sender.sendMessage(net.md_5.bungee.api.ChatColor.DARK_RED+"You are not a player. You cannot use the command for YOURSELF as a console");
        }
        return false;
    }
}