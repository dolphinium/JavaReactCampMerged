package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SalesService {
    void sell(Game game, Gamer gamer, Campaign campaign);

}