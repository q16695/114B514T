package fz.fz;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class give_all_item implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        for (Player q : Bukkit.getOnlinePlayers()) {
            q.getInventory().addItem(((Player) sender).getInventory().getItemInMainHand());
        }
        return false;
    }
}
