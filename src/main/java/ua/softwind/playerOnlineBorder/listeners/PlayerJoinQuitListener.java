package ua.softwind.playerOnlineBorder.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static ua.softwind.playerOnlineBorder.Utils.updateBorderSizeBasedOnPlayerCount;


public class PlayerJoinQuitListener implements Listener {
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        updateBorderSizeBasedOnPlayerCount();
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        updateBorderSizeBasedOnPlayerCount();
    }
}
