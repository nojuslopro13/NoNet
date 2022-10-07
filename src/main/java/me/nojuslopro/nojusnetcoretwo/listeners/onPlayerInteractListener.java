package me.nojuslopro.nojusnetcoretwo.listeners;

import me.nojuslopro.nojusnetcoretwo.guis.HelpGUI;
import me.nojuslopro.nojusnetcoretwo.guis.ServerGUI;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class onPlayerInteractListener implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        try {
            if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.COMPASS)) {
                Inventory gui = ServerGUI.createGui(event.getPlayer());
                event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.BLOCK_BARREL_OPEN, 1, 1);
                event.getPlayer().openInventory(gui);

            }

            if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BOOK)) {
                HelpGUI.createBookGui(event.getPlayer());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
