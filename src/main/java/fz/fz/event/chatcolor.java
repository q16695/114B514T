package fz.fz.event;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;

public class chatcolor implements Listener{
    @EventHandler
    public void onChat(AsyncPlayerChatEvent evt){
        ArrayList<ChatColor> chatColors = new ArrayList<>();
        chatColors.add(ChatColor.RED);
        chatColors.add(ChatColor.GOLD);
        chatColors.add(ChatColor.YELLOW);
        chatColors.add(ChatColor.GREEN);
        chatColors.add(ChatColor.DARK_GREEN);
        chatColors.add(ChatColor.AQUA);
        chatColors.add(ChatColor.LIGHT_PURPLE);
        if(evt.getPlayer().hasPermission("114b514t.vip.name")){
            evt.setFormat("<" + ChatColor.DARK_PURPLE + evt.getPlayer().getName() + ChatColor.WHITE +  "> " + evt.getMessage());
        }
        else if(evt.getPlayer().hasPermission("114b514t.admin.name")){
            evt.setFormat("<" + ChatColor.YELLOW + evt.getPlayer().getName() + ChatColor.WHITE +  "> " + evt.getMessage());
        }
        else if(evt.getPlayer().getName().equals("CNflummonkin")){
            String namePrefix = ChatColor.DARK_RED + "["+ ChatColor.GOLD + "J" + ChatColor.YELLOW + "N" + ChatColor.GREEN + "T" + ChatColor.DARK_GREEN + "M" + ChatColor.AQUA + "-" + ChatColor.LIGHT_PURPLE + "副" + ChatColor.DARK_RED + "首" + ChatColor.GOLD + "领" + ChatColor.YELLOW + "]";
            evt.setFormat(namePrefix+ "<" + ChatColor.AQUA + ChatColor.ITALIC + evt.getPlayer().getName() + ChatColor.WHITE + "> " + ChatColor.WHITE + evt.getMessage());
        }
        else if((evt.getPlayer().hasPermission("114b514t.green-chat.use")) && (evt.getPlayer().hasPermission("chat-light-green.name"))){
            evt.setFormat(ChatColor.GREEN + evt.getFormat());
        }
        else if(evt.getPlayer().hasPermission("114b514t.chat-light-green.name")){
            evt.setFormat("<" + ChatColor.GREEN + evt.getPlayer().getName() + ChatColor.WHITE + "> " + ChatColor.WHITE + evt.getMessage());
        }
        else if(evt.getPlayer().hasPermission("114b514t.green-chat.use")) {
            evt.setMessage(ChatColor.GREEN + evt.getMessage());
        }
        else if(evt.getPlayer().hasPermission("114b514t.red.name")){
            evt.setFormat("<" + ChatColor.DARK_RED + ChatColor.BOLD +ChatColor.STRIKETHROUGH+ evt.getPlayer().getName() + ChatColor.WHITE + "> " + ChatColor.WHITE + evt.getMessage());
        }
        else if(evt.getPlayer().hasPermission("114b514t.light.blue.name")){
            evt.setFormat("<" + ChatColor.AQUA + ChatColor.ITALIC +ChatColor.UNDERLINE+ evt.getPlayer().getName() + ChatColor.WHITE + "> " + ChatColor.WHITE + evt.getMessage());
        }
        else if(evt.getPlayer().hasPermission("114b514t.rgb.name")){
            String s = "";
            if(evt.getPlayer().getName().equals("有种别打我谢谢")){
                s = "[mso 新手救援隊-成员]";
            }
            if(evt.getPlayer().getName().equals("hll_RGB")){
                evt.setFormat(" <" +ChatColor.RED+ "h"+ChatColor.GOLD+"l"+ChatColor.YELLOW+"l"+ChatColor.GREEN+"_"+ChatColor.DARK_GREEN+"R"+ChatColor.AQUA+"G"+ChatColor.DARK_PURPLE+"B" + ChatColor.WHITE + "> " + ChatColor.WHITE + evt.getMessage());
            }
            else{
                String str = "";
                for(int i=0;i<evt.getPlayer().getName().length();i++) {
                    str = str+chatColors.get((int) (Math.random()*chatColors.size()))+(String.valueOf((evt.getPlayer().getName().toCharArray())[i]));
                }
                evt.setFormat(s + " <" + str + ChatColor.WHITE + "> " + ChatColor.WHITE + evt.getMessage());
            }
        }
        else if(evt.getPlayer().hasPermission("114b514t.gokuui4563.name.chat")){
            String str = ChatColor.GREEN+"G"+ChatColor.DARK_GREEN+"o"+ChatColor.AQUA+"k"+ChatColor.DARK_PURPLE+"u"+ChatColor.DARK_RED+"u"+ChatColor.GOLD+"i"+ChatColor.GREEN+"4"+ChatColor.DARK_GREEN+"5"+ChatColor.AQUA+"6"+ChatColor.DARK_PURPLE+"3";
            evt.setFormat(ChatColor.DARK_RED + "["+ChatColor.GOLD+"我"+ChatColor.YELLOW+"來"+ChatColor.GREEN+"瓦"+ChatColor.DARK_GREEN+"暗"+ChatColor.AQUA+"影"+ChatColor.DARK_PURPLE+"殺"+ChatColor.DARK_RED+"手"+ChatColor.GOLD+"]" + ChatColor.RESET + "<" + ChatColor.UNDERLINE + str + ChatColor.WHITE + "> " + ChatColor.GOLD + ChatColor.ITALIC + evt.getMessage()+"  [mso 新手救援隊-隊長]");;
        }
        else if(evt.getPlayer().getName().equals("ndcwzxk")){
            evt.setFormat("[mso 新手救援隊-成员]"+ " <"  + ChatColor.RED+"n"+ChatColor.GOLD+"d"+ChatColor.YELLOW+"c"+ChatColor.GREEN+"w"+ChatColor.DARK_GREEN+"z"+ChatColor.AQUA+"x"+ChatColor.DARK_PURPLE+"k" + ChatColor.WHITE + "> " + ChatColor.GOLD + evt.getMessage());
        }
        else if(evt.getPlayer().getName().equals("eyd零11")){
            evt.setCancelled(true);
            evt.getPlayer().sendMessage(ChatColor.RED+"Fuck your mother. You still want to talk when you're dead?");
        }
    }
    @EventHandler
    public void Join(PlayerJoinEvent evt){
        if(evt.getPlayer().hasPermission("114b514t.vip.name")){
            evt.getPlayer().setPlayerListName(ChatColor.DARK_PURPLE+evt.getPlayer().getName());
        }
        else if(evt.getPlayer().hasPermission("114b514t.admin.name")){
            evt.getPlayer().setPlayerListName(ChatColor.YELLOW+evt.getPlayer().getName());
        }
        else if(evt.getPlayer().hasPermission("114b514t.chat-light-green-name.use")){
            evt.getPlayer().setPlayerListName(ChatColor.GREEN+evt.getPlayer().getName());
        }
        else if(evt.getPlayer().hasPermission("114b514t.red.name")){
            evt.getPlayer().setPlayerListName(ChatColor.DARK_RED+evt.getPlayer().getName());
        }
        else if(evt.getPlayer().hasPermission("114b514t.light.blue.name")){
            evt.getPlayer().setPlayerListName(ChatColor.AQUA+evt.getPlayer().getName());
        }
    }
    @EventHandler
    public void ChatPreFix(AsyncPlayerChatEvent evt){
        if(evt.getMessage().startsWith(">")){
            evt.setMessage(ChatColor.GREEN+evt.getMessage());
        }
        else if(evt.getMessage().startsWith(":")){
            evt.setMessage(ChatColor.LIGHT_PURPLE+evt.getMessage());
        }
        else if(evt.getMessage().startsWith("'")){
            evt.setMessage(ChatColor.GOLD+evt.getMessage());
        }
    }
}
