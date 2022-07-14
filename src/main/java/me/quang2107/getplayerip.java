package me.quang2107;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class getplayerip extends JavaPlugin {
        public void onPlayerLogin(PlayerLoginEvent e) {
            Player p = e.getPlayer();
            String sIp1 = p.getAddress().getHostName();
            getLogger().info(p + "Joined Server With IP : " + sIp1);
    }
}
