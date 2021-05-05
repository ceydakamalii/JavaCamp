package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class GameManager implements GameService{
	public void add(Game game) {
		System.out.println(game.getName()+" added");
	}
	public void update(Game game) {
		System.out.println(game.getName()+" updated");
	}
	public void remove(Game game) {
		System.out.println(game.getName()+" removed");
	}
	public void saleWithoutCampaign(Game game,Member member) {
		System.out.println(member.getFirstName() + " bought the " + game.getName() + " game for : " + game.getPrice() );
	}
	public void salesWithCampaign(Game game,Member member,Campaign campaign) {
		System.out.println(member.getFirstName() + " bought the " + game.getName() + " game for  " + (game.getPrice()-(game.getPrice()*campaign.getDiscount())/100)
        + " TL with  " + campaign.getName() +" campaign");

}}


