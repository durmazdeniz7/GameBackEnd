package Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private double campaignDiscount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

	public Campaign() {
	}

	public Campaign(int id, String campaignName, double campaignDiscount) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}

}