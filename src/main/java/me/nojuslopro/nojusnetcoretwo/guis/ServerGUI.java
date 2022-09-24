package me.nojuslopro.nojusnetcoretwo.guis;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ServerGUI {
    public static Inventory createGui(Player player) {
        Inventory gui = Bukkit.createInventory(null, 27, Component.text("Servers"));

        ItemStack emerald = new ItemStack(Material.EMERALD);
        ItemMeta emeraldMeta = emerald.getItemMeta();
        emeraldMeta.setDisplayName(ChatColor.RED + "Anarchy");
        emerald.setItemMeta(emeraldMeta);

        ItemStack diamond_sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta diamond_sword_meta = diamond_sword.getItemMeta();
        diamond_sword_meta.setDisplayName(ChatColor.AQUA + "Competitive Games");
        diamond_sword_meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        diamond_sword.setItemMeta(diamond_sword_meta);


        gui.setItem(11, emerald);
        gui.setItem(15, diamond_sword);
        return gui;
    }

}
