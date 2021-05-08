package concrete;

import abstracts.SalesService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class PrintManager implements SalesService {

    public void printGames(Game[] game) {
        for (Game games : game) {
            System.out.println(games.getDetail());
            System.out.println("*****************************************************************************************");
        }
    }

    @Override
    public void sell(Game game, Gamer gamer, Campaign campaign) {
        System.out.println(game.getName() + " has been sold to gamer: " + gamer.getFirstName() + " " + gamer.getLastName() +
                "\nPrice: " + game.getPrice() + "\nDiscounted price: " + (game.getPrice() - (game.getPrice() * campaign.getDiscountRate())));
    }
}
