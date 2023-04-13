package xyz.hubi.uhcplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.hubi.uhcplugin.utils.ChatHelper;
import xyz.hubi.uhcplugin.data.Game;
import xyz.hubi.uhcplugin.data.GameManager;
import xyz.hubi.uhcplugin.data.UserManager;

public class ArenaJoinCommand implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (GameManager.isGame) {
                UserManager.addToGame(player);
                player.sendMessage(ChatHelper.fix("&8[&a&l<Y>&8] &7Dolaczyles do gry &6"));
                ChatHelper.sendActionBarToAll("&8>> &6" + sender.getName() + "&7 dolączył do gry! " + "&7(&6" + "/&650&7)");
            } else {
                player.sendMessage(ChatHelper.fix("&8[&c&l<X>&8] &7Nie ma obecnie gry!"));

            }


        return true;
    }
}
