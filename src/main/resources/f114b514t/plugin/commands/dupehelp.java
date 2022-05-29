package f114b514t.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class dupehelp implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(args.length==0)) {
            if (args[0].equals("help")) {
                sender.sendMessage(ChatColor.RED + (ChatColor.UNDERLINE + "--------------------------"));
                sender.sendMessage(ChatColor.RED + "驴刷：杀一只驴带有箱子的驴，可以复制");
                sender.sendMessage(ChatColor.RED + "经验瓶复制：左手放要刷的物资，右手放经验瓶，右键即可刷物品");
                sender.sendMessage(ChatColor.RED + "潜影盒复制：放5个潜影盒多一个");
                sender.sendMessage(ChatColor.RED + "/fz <数量> 复制物品");
                sender.sendMessage(ChatColor.RED + "/max 获取手上物品最大堆叠");
                sender.sendMessage(ChatColor.RED + "/dupe gui 打开复制GUI");
                sender.sendMessage(ChatColor.RED + (ChatColor.UNDERLINE + "--------------------------"));
            } else if (args[0].equals("gui")) {
                ItemStack fz = new ItemStack(Material.COMMAND, 1);
                ItemStack exp_copy = new ItemStack(Material.EXP_BOTTLE, 1);
                exp_copy.getItemMeta().setDisplayName("经验瓶复制");
                fz.getItemMeta().setDisplayName("指令复制");
                Inventory inventory = Bukkit.createInventory(null, 3 * 9, "复制");
                inventory.setItem(10, exp_copy);
                inventory.setItem(16, fz);
                ((Player) sender).openInventory(inventory);
            } else {
                sender.sendMessage(ChatColor.RED + (ChatColor.UNDERLINE + "--------------------------"));
                sender.sendMessage(ChatColor.RED + "驴刷：杀一只驴带有箱子的驴，可以复制");
                sender.sendMessage(ChatColor.RED + "经验瓶复制：左手放要刷的物资，右手放经验瓶，右键即可刷物品");
                sender.sendMessage(ChatColor.RED + "潜影盒复制：放5个潜影盒多一个");
                sender.sendMessage(ChatColor.RED + "/fz <数量> 复制物品");
                sender.sendMessage(ChatColor.RED + "/max 获取手上物品最大堆叠");
                sender.sendMessage(ChatColor.RED + (ChatColor.UNDERLINE + "--------------------------"));
            }
        } else {
            sender.sendMessage(ChatColor.RED + (ChatColor.UNDERLINE + "--------------------------"));
            sender.sendMessage(ChatColor.RED + "驴刷：杀一只驴带有箱子的驴，可以复制");
            sender.sendMessage(ChatColor.RED + "经验瓶复制：左手放要刷的物资，右手放经验瓶，右键即可刷物品");
            sender.sendMessage(ChatColor.RED + "潜影盒复制：放5个潜影盒多一个");
            sender.sendMessage(ChatColor.RED + "/fz <数量> 复制物品");
            sender.sendMessage(ChatColor.RED + "/max 获取手上物品最大堆叠");
            sender.sendMessage(ChatColor.RED + (ChatColor.UNDERLINE + "--------------------------"));
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("help");
        list.add("gui");
        return list;
    }
}
