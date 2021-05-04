package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class GamerCheckServiceMernis implements GamerCheckService {
	@SuppressWarnings("deprecation")

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {

		boolean result = false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return result= client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
