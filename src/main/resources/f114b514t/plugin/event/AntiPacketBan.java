package f114b514t.plugin.event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEditBookEvent;

public class AntiPacketBan implements Listener {
    @EventHandler
    public void AntiBookBan(PlayerEditBookEvent evt) {
        if(evt.getNewBookMeta().getPageCount()>5){
            evt.setCancelled(true);
            evt.getPlayer().sendMessage(ChatColor.RED+"禁止制作禁人书");
        }
    }
}
