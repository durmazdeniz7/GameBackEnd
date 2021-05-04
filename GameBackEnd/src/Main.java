import java.util.Date;
import java.util.Set;

import Adapters.GamerCheckServiceMernis;
import Concrete.GamerManager;
import Concrete.SellManager;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Sell;

public class Main {

	public static void main(String[] args) {

		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Ercan Deniz");
		gamer.setLastName("Durmaz");
		gamer.setNationalityId("");
		gamer.setDateOfBirth(new Date(1997, 3, 15));
		GamerManager gamerManager = new GamerManager(new GamerCheckServiceMernis());
		gamerManager.save(gamer);
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("Yeni Oyuncu Kampanyasý");
		campaign.setCampaignDiscount(10);

		Sell sell = new Sell(campaign);

		sell.setId(1);
		sell.setGameName("Pubg");
		sell.setGamer(gamer);
		sell.setPrice(100);

		SellManager sellManager = new SellManager(gamer, campaign);
		sellManager.toSell(sell);

	}

}
