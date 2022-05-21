package fz.fz.commands;

import fz.fz.Fz;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class home implements CommandExecutor {
    FileConfiguration yaml = YamlConfiguration.loadConfiguration(new File(Fz.getPlugin(Fz.class).getDataFolder(),"location.yml"));
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;
        String string = yaml.getString(sender.getName());

        return false;
    }
}
