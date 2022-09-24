package me.nojuslopro.nojusnetcoretwo.listeners;

import me.nojuslopro.nojusnetcoretwo.Nojusnetcoretwo;
import me.nojuslopro.nojusnetcoretwo.utils.ScoreboardUtility;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class onPlayerLeave implements Listener {
    @EventHandler(priority = EventPriority.MONITOR)
    public void playerlave(PlayerQuitEvent e) {

        e.setQuitMessage(ChatColor.DARK_PURPLE + e.getPlayer().getName() + ChatColor.BLUE + " ᴀᴛsɪᴊᴜɴɢᴇ ɴᴜᴏ sᴇʀᴠᴇʀɪᴏ");

    }

}
