import adapters.MernisServiceAdapter;
import concrete.GamerManager;
import concrete.PrintManager;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

    public static void main(String[] args) {

        Game minecraft = new Game(1, "Minecraft", "Minecraft is a sandbox video game developed by Mojang." +
                "\n" + "The game was created by Markus \"Notch\" Persson in the Java programming language. ", 90, "Sandbox video game");
        Game gta5 = new Game(2, "Grand Theft Auto V", "Grand Theft Auto V is a 2013 action-adventure game developed by Rockstar North and published by Rockstar Games.", 120, "Action-adventure");
        Game supermario = new Game(3, "Super Mario Bros.", "Super Mario Bros. is a platform game developed and published by Nintendo", 250, "Platform game");


        Gamer gamer = new Gamer(
                1,
                123,
                "Yunus Emre",
                "KORKMAZ",
                1999,
                "12345678901");

        Campaign campaign1 = new Campaign(1,
                "Black Friday",
                0.10);

        GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());

        gamerManager.register(gamer);

        PrintManager printManager = new PrintManager();

        Game[] games = {minecraft, gta5, supermario};

        printManager.printGames(games);

        printManager.sell(minecraft, gamer, campaign1);

    }
}
