package Concrete;

import Abstracts.ICampaign;
import entities.Campaign;

public class CampaignManager implements ICampaign {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " " + "kampanyası eklendi.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " " + "kampanya bilgileri güncellendi.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " " + "kampanyası silindi.");

	}

}
