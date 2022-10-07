package me.nojuslopro.nojusnetcoretwo.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDamage implements Listener {
    @EventHandler
    public void onPlayerAttack(EntityDamageEvent e) {
        e.setCancelled(true);
    }
}
