package me.nojuslopro.nojusnetcoretwo.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class onItemDrop implements Listener {
    @EventHandler
    public void itemDrop(PlayerDropItemEvent e) {
        e.setCancelled(true);
    }
}
