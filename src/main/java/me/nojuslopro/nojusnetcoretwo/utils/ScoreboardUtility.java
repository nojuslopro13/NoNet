package me.nojuslopro.nojusnetcoretwo.utils;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.PlaceholderHook;
import me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class ScoreboardUtility {
    public static void createScoreboard(Player player) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
        Objective objective = board.registerNewObjective("test", "dummy", ChatColor.BLUE + "NOJUS NET");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        String TPS = "%server_tps_1_colored%";
        TPS = PlaceholderAPI.setPlaceholders(player, TPS);
        String rank = ChatColor.translateAlternateColorCodes('&', "&c %luckperms_prefix%");
        rank = PlaceholderAPI.setPlaceholders(player, rank);
        Score zaidejas = objective.getScore(ChatColor.BLUE + "" + ChatColor.BOLD + "ᴢᴀɪᴅᴇᴊᴀs");
        Score slapyvardis = objective.getScore(" " + ChatColor.BLUE + "sʟᴀᴘʏᴠᴀʀᴅɪs: " + player.getName());
        Score rangas = objective.getScore(" " + ChatColor.BLUE + "ʀᴀɴᴋ: " + rank);

        Score serveris = objective.getScore(ChatColor.BLUE + "" + ChatColor.BOLD + "sᴇʀᴠᴇʀɪs");
        Score tps = objective.getScore(ChatColor.BLUE + " " +"ᴛᴘs: " + TPS);
        Score connected = objective.getScore(ChatColor.BLUE + " " + "ᴘʀɪsɪᴊᴜɴɢᴜsɪᴜ: " + Bukkit.getOnlinePlayers().size() + "/20");


        Score space = objective.getScore("      ");
        Score space2 = objective.getScore("");

        space.setScore(7);
        zaidejas.setScore(6);
        slapyvardis.setScore(5);
        rangas.setScore(4);
        serveris.setScore(3);
        tps.setScore(2);
        connected.setScore(1);
        space2.setScore(0);

        player.setScoreboard(board);
    }
}
