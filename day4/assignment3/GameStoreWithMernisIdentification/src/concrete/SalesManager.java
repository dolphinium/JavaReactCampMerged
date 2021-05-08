package concrete;

import abstracts.SalesService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SalesManager implements SalesService {
    @Override
    public void sell(Game game, Gamer gamer, Campaign campaign) {
        System.out.println(game.getName() + " has been sold to gamer: " + gamer.getFirstName() + " " + gamer.getLastName() +
                "\nPrice: " + game.getPrice()+" TRY" + "\nDiscounted price: " + (game.getPrice() - (game.getPrice() * campaign.getDiscountRate()))+" TRY");
    }

}