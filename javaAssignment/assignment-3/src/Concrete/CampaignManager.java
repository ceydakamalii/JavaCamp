package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Member;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getName()+" campaign added.");
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
		System.out.println(campaign.getName()+" campaign update.");
		
	}

	@Override
	public void remove(Campaign campaign) {
		
		System.out.println(campaign.getName()+" campaign removed.");
		
	}

}
