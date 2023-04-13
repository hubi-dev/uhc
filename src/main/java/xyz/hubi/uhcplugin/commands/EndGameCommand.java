package xyz.hubi.uhcplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.hubi.uhcplugin.utils.ChatHelper;
import xyz.hubi.uhcplugin.data.GameManager;
import xyz.hubi.uhcplugin.data.UserManager;

import java.io.File;

public class EndGameCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.isOp()) {
                GameManager.setGame(false);
                UserManager.inGame.clear();
                Bukkit.broadcastMessage(ChatHelper.fix("&8[&a&l<X>&8] &7Gra zakonczona"));
                for (Player player2 : Bukkit.getOnlinePlayers()) {
                    if (player2.getWorld().getName().equals("Gierka")) {
                        player2.teleport(GameManager.spawn);
                    }
                }

            }
        }
        return true;
    }


}
