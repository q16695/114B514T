package f114b514t.plugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class getOp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.setOp(true);
        sender.sendMessage(ChatColor.GREEN+"OP上了");
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sender.setOp(false);
        sender.sendMessage(ChatColor.GREEN+"OP下了");
        return false;
    }
}
