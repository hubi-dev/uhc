package xyz.hubi.uhcplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.hubi.uhcplugin.data.GameManager;
import xyz.hubi.uhcplugin.data.UserManager;

public class LeaveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            UserManager.inGame.remove(sender.getName());
            ((Player) sender).teleport(GameManager.spawn);
        }
        return true;
    }
}
