package johan24.HelloSpigot;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloSpigot extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("Hello")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&1H&2e&3l&4l&5o&6!"));
            return true;
        }
        return false;
    }
}
