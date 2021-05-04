package Concrete;

import Abstract.BaseGamerManager;
import Adapters.GamerCheckServiceMernis;
import Entities.Gamer;

public class GamerManager extends BaseGamerManager {
	GamerCheckServiceMernis checkService;
	
	public GamerManager(GamerCheckServiceMernis checkService) {

	this.checkService=checkService;
	}

	@Override
	public void save(Gamer gamer) {
		if (checkService.CheckIfRealPerson(gamer)) {
			System.out.println("Saved to db : " + gamer.getFirstName());

		} else {
			System.out.println("Kullanýcý Bilgisi Doðru Deðil");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		if (checkService.CheckIfRealPerson(gamer)) {
			System.out.println("Delete to db : " + gamer.getFirstName());

		} else {
			System.out.println("Kullanýcý Bilgisi Doðru Deðil");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if (checkService.CheckIfRealPerson(gamer)) {
			System.out.println("Update to db : " + gamer.getFirstName());

		} else {
			System.out.println("Kullanýcý Bilgisi Doðru Deðil");
		}
	}

}
