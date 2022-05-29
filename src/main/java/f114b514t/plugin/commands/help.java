package f114b514t.plugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class help implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.AQUA+"============="+ChatColor.YELLOW+"["+ChatColor.RED+"帮助列表"+ChatColor.YELLOW+"]"+ChatColor.AQUA+"==============");
        sender.sendMessage(ChatColor.GOLD+" 指令介绍:");
        sender.sendMessage(ChatColor.GRAY+"/ungmc - " +ChatColor.YELLOW+ "改生存模式");
        sender.sendMessage(ChatColor.GRAY+"/tell <玩家名> <内容> - "+ChatColor.YELLOW+"私聊"+ChatColor.RED+"(/w /msg /s 作用相同)");
        sender.sendMessage(ChatColor.GRAY+"/stat <玩家名> - " + ChatColor.YELLOW +"查询玩家基本信息"+ChatColor.RED+"(不可查询离线玩家)");
        sender.sendMessage(ChatColor.GRAY+"/stats - "+ChatColor.YELLOW+"获取服务器基本信息");
        sender.sendMessage(ChatColor.GRAY+"/kill - " +ChatColor.YELLOW+ "自杀"+ChatColor.RED+"(/514 /4 /suicide 作用相同)");
        sender.sendMessage(ChatColor.GRAY+"/kit <KIT> - " +ChatColor.YELLOW+ "获得kit");
        sender.sendMessage(ChatColor.GRAY+"/head <玩家名> - "+ChatColor.YELLOW+" 获得某个玩家的头颅"+ChatColor.RED+"(不可获得中文名玩家的头颅)");
        sender.sendMessage(ChatColor.GRAY+"/dupe help - "+ChatColor.YELLOW+"获取物品复制帮助");
        sender.sendMessage(ChatColor.RED+(ChatColor.BOLD+"注")+ChatColor.GRAY+(ChatColor.BOLD+":")+"死亡掉落,睡床可以重置复活点(QQ群672318944)");
        sender.sendMessage(ChatColor.AQUA+"=====================================");
        return false;
    }
}
