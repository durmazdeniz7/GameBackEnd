package Entities;

public class Sell {
	private int id;
	private String gameName;
	private double price;
	private Campaign campaignDiscount;
	private Gamer gamer;

	public Sell(Campaign campaign) {
	this.campaignDiscount=campaign;
	
	}

	public Sell(int id, String gameName, double price, Campaign campaign, Gamer gamer) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.campaignDiscount = campaign;
		this.gamer = gamer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price-campaignDiscount.getCampaignDiscount();
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Campaign getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(Campaign campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

}