package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void campaignAdd(Campaign campaign) {
System.out.println(campaign.getCampaignName() +" eklendi");		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +" silindi");		
		
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +" güncelendi");		
		
	}

	
	

}
