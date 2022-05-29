package f114b514t.plugin.commands;

import f114b514t.plugin.plugin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class aa64 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        FileConfiguration ymal = YamlConfiguration.loadConfiguration(new File(plugin.getPlugin(plugin.class).getDataFolder(),"config.yml"));
        if(ymal.getBoolean("max")) {
            if (((Player) sender).getInventory().getItemInMainHand().getType() == Material.AIR) {
                sender.sendMessage(ChatColor.DARK_RED + "不能空手");
            } else if (((Player) sender).getInventory().getItemInMainHand().getAmount() == ((Player) sender).getInventory().getItemInMainHand().getMaxStackSize()) {
                sender.sendMessage(ChatColor.DARK_RED + "此物品已经到最大数量了");
            } else {
                ((Player) sender).getInventory().getItemInMainHand().setAmount(((Player) sender).getInventory().getItemInMainHand().getMaxStackSize());
            }
        }
        else{
            sender.sendMessage(ChatColor.DARK_RED+"["+ymal.getString("server_name")+"]未启用/max");
        }
        return false;
    }
}
