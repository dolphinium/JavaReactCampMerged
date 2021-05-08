package adapters;

import abstracts.GamerCheckService;
import entities.Gamer;
import mernisServiceReference.KPSPublic;

public class MernisServiceAdapter implements GamerCheckService {

    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        KPSPublic mernisService = new KPSPublic();

        boolean result = false;

        try {
            result = mernisService.getKPSPublicSoap().tcKimlikNoDogrula(
                    Long.parseLong(gamer.getNationalityId()),
                    gamer.getFirstName().toUpperCase(),
                    gamer.getLastName().toUpperCase(),
                    gamer.getYearOfBirth()
            );
        } catch (Exception ex) {
            System.out.println("Not a valid person.");

        }
        return result;
    }
}
