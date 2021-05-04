package Concrete;

import Entities.Campaign;
import Entities.Gamer;
import Entities.Sell;

public class SellManager {
	private Gamer gamer;
	private Campaign campaign;

	public SellManager(Gamer gamer,Campaign campaign) {
		this.gamer = gamer;
		this.campaign=campaign;
	}

public void toSell(Sell sell) {
		System.out.println(gamer.getFirstName() + " isimli kullanýcýya " + sell.getGameName() + "Oyun "
				+ campaign.getCampaignName() + " ile " + sell.getPrice() + "Fiyatýna satýldý");
	}
}
