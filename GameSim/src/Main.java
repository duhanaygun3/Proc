import java.rmi.RemoteException;

import Adepter.UserCheckServise;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		User user1=new User(1,"Duhan Serkan","Aygün",59026058038L,2002);
		
		Game game1=new Game(12,"Mario",35);
		
		Campaign campaign1=new Campaign(2,"Yılbaşı İndirimi",15);
		
		UserManager usermanager=new UserManager(new UserCheckServise());
		usermanager.saveUser(user1);
		
		GameManager gamemanager=new GameManager();
		gamemanager.add(game1);
		
		CampaignManager campaignmanager=new CampaignManager();
		campaignmanager.add(campaign1);
		
		SaleManager salemanager=new SaleManager(new UserCheckServise());
		salemanager.gameSale(user1, campaign1, game1);
		
		
		
		
		
		
		

	}

}
