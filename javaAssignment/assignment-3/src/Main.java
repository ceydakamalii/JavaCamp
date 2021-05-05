import Abstract.MemberCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MemberManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Member member1=new Member(1,"Ceyda","Kamalý",new Date(2000,07,12),"32953096748");
		Campaign campaign1=new Campaign(1,"50%",50);
		Game game1=new Game(1,"Snake",200);
		
		
		MemberManager manager1=new MemberManager(new MernisServiceAdapter());
		
		manager1.add(member1);
		manager1.update(member1);
		manager1.remove(member1);
		System.out.println("******************************************************************");
		CampaignManager campaignManager=new CampaignManager();
		
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		campaignManager.remove(campaign1);
		System.out.println("******************************************************************");
		GameManager manager2=new GameManager();
		
		manager2.add(game1);
		manager2.remove(game1);
		manager2.update(game1);
		manager2.saleWithoutCampaign(game1, member1);
		manager2.salesWithCampaign(game1, member1, campaign1);
		
		
	

	}

	

}
