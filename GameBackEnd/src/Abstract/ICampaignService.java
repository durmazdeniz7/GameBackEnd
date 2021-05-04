package Abstract;

import Entities.Campaign;

public interface ICampaignService {
	void campaignAdd(Campaign campaign);

	void campaignDelete(Campaign campaign);

	void campaignUpdate(Campaign campaign);

}
