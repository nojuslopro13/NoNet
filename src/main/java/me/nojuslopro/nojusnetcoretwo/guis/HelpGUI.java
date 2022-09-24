package me.nojuslopro.nojusnetcoretwo.guis;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class HelpGUI {
    public static void createBookGui(Player player) {
        ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta bookmeta = (BookMeta) book.getItemMeta();
        bookmeta.setAuthor("Pagalbininkas");
        bookmeta.setTitle(ChatColor.RED + "PAGALBA!");

        bookmeta.addPages(Component.text("Neužbaigta pagalbos menu, patikrinkite vėliau."));

        book.setItemMeta(bookmeta);
        player.openBook(book);
    }
}
