package me.quang2107;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class joinquitmessage extends JavaPlugin {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("&aChào Mừng " + getName() + ("&aĐến Với Server!"));
    }
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage("&aTạm Biệt" + getName() + ("&a!"));
    }
}
