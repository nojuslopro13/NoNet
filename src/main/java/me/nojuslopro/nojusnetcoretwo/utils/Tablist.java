package me.nojuslopro.nojusnetcoretwo.utils;

import org.bukkit.entity.Player;

public class Tablist {
    public static void create(Player player, String TablistHeader, String TabListFooter) {
        if (TablistHeader != null) {
            player.setPlayerListHeader(TablistHeader);
            player.setPlayerListFooter(TabListFooter);
        }
    }
}
