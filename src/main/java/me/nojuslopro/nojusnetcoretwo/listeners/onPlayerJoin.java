package me.nojuslopro.nojusnetcoretwo.listeners;

import me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet;
import me.nojuslopro.nojusnetcoretwo.Nojusnetcoretwo;
import me.nojuslopro.nojusnetcoretwo.guis.ServerGUI;
import me.nojuslopro.nojusnetcoretwo.guis.WelcomeGUI;
import me.nojuslopro.nojusnetcoretwo.utils.KickForVPN;
import me.nojuslopro.nojusnetcoretwo.utils.ScoreboardUtility;
import me.nojuslopro.nojusnetcoretwo.utils.Tablist;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.ScoreboardManager;

public class onPlayerJoin implements Listener {


    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoin(PlayerJoinEvent e) {
        e.getPlayer().getInventory().clear();
        ItemStack compass = new ItemStack(Material.COMPASS);
        ItemMeta compassmeta = compass.getItemMeta();
        compassmeta.setDisplayName(ChatColor.GREEN + "Serverių pasirinkimas " + ChatColor.GRAY + "(ᴅᴇšɪɴɪ ᴋʟᴀᴠɪšᴀ)");
        compass.setItemMeta(compassmeta);
        e.getPlayer().getInventory().setItem(4, compass);

        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta bookmeta = book.getItemMeta();
        bookmeta.setDisplayName(ChatColor.BLUE + "Pagalbos knygą " + ChatColor.GRAY + "(ᴅᴇšɪɴɪ ᴋʟᴀᴠɪšᴀ)");
        book.setItemMeta(bookmeta);
        Tablist.create(e.getPlayer(), "                                                                                              \n\n\n\n\n\n\n\n Verifikuojame jūsų paskyra.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "\n\n\n\n\n\n");
        e.getPlayer().getInventory().setItem(0, book);
        e.getPlayer().setResourcePack("https://drive.google.com/u/0/uc?id=19H9_kbIWuo5IdzC7-GzY0cj4ux4NvuQx&export=download","47d23754a28a0789c4482e8d799e975768b1103f");
        e.getPlayer().setHealth(20);
        e.getPlayer().setFoodLevel(20);

        if (e.getPlayer().getClientViewDistance() < 9) {
            e.getPlayer().sendMessage(Component.text(ChatColor.YELLOW + "ʀᴇᴋᴏᴍᴇɴᴅᴜᴏᴊᴀᴍᴇ žᴀɪsᴛ sᴇʀᴠᴇʀį sᴜ 10+ ʀᴇɴᴅᴇʀ ᴅɪsᴛᴀɴᴄᴇ"));
        }

        BukkitRunnable task2 = new BukkitRunnable() {
            @Override
            public void run() {
                Tablist.create(e.getPlayer(), ChatColor.BLUE + "" + ChatColor.BOLD + "             NOJUS NETWORK           \n\n" + ChatColor.WHITE + "       Privatus žaidimus.      ", ChatColor.RED + "      NOJUS NET TABLIST       ");
            }
        };

        //  Audience audience = (Audience) this.plugin.adventure().player(e.getPlayer());
       // BossBar hubBar = BossBar.bossBar(Component.text(ChatColor.YELLOW + "žᴀɪᴅᴇᴊᴀs: " + ChatColor.GREEN + e.getPlayer().getName()),0.5f, BossBar.Color.BLUE, BossBar.Overlay.PROGRESS);
        //audience.showBossBar(hubBar);
            task2.runTaskLater(Nojusnetcoretwo.getPlugin(), 20 * 10);
            e.getPlayer().teleport(new Location(e.getPlayer().getWorld(), 77.476787885, -52.0, -27.7626,(float) -92.999825,(float) -0.7500295));
        e.setJoinMessage(ChatColor.DARK_PURPLE + e.getPlayer().getName() + ChatColor.BLUE + " ᴘʀɪsɪᴊᴜɴɢᴇ ᴘʀɪᴇ sᴇʀᴠᴇʀɪᴏ");
        BukkitRunnable task = new BukkitRunnable() {
            @Override
            public void run() {
                ScoreboardUtility.createScoreboard(e.getPlayer());
               // e.getPlayer().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("Serveris: \uE003                    "));
            }
        };

        task.runTaskTimer(Nojusnetcoretwo.getPlugin(), 25, 25);
    }

}
