package concrete;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {
    private GamerCheckService checkService;

    public GamerManager(GamerCheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void register(Gamer gamer) {

        if (checkService.checkIfRealPerson(gamer))
            System.out.println(gamer.getFirstName() + " has been registered to the system successfully.");
        else
            System.out.println("Not a valid person! Please try again!");


    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("The gamer's informations has been updated.");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("The gamer has been deleted from the system.");
    }

}