package xyz.hubi.uhcplugin.data;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class GameManager {

    public static Game game = new Game(1);
    public static boolean isGame = game.isGame();
    public static World world = Bukkit.getWorld("world");
    public static Location spawn = new Location(world, 0, 100, 0);
    public static void setGame(final boolean isGame) {
        GameManager.isGame = isGame;
    }


}
