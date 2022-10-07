package me.nojuslopro.nojusnetcoretwo.runnables;

import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class OwnerParticles extends BukkitRunnable {

    @Override
    public void run() {
        Player player = Bukkit.getPlayer("nojuslopro123");
        if (player != null) {
            player.getWorld().spawnParticle(Particle.FLAME, player.getLocation(), 100);
        }
    }
}
