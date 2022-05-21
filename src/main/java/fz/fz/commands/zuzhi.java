package fz.fz.commands;

import fz.fz.Fz;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class zuzhi implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        FileConfiguration yaml = YamlConfiguration.loadConfiguration(new File(Fz.getPlugin(Fz.class).getDataFolder(),"location.yml"));
        return false;
    }
}
