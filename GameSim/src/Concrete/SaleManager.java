package Concrete;

import java.rmi.RemoteException;

import Abstracts.IUserCheckServise;
import entities.Campaign;
import entities.User;
import entities.Game;

public class SaleManager  {
	IUserCheckServise checkservice;
	
	public SaleManager(IUserCheckServise checkservice) {
		super();
		this.checkservice = checkservice;
	}

	public void gameSale(User user,Campaign campaign,Game game) throws RemoteException {
		if(checkservice.CheckIfRealPerson(user)) {
		String discountedPrice = user.getFirstName() + " " + user.getLastName() + " " + game.getName() + " " + "oyununu"
				+ " " + "%" + campaign.getDiscount() + " " + "indirimle" + " "
				+ (game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100)) + " "
				+ "TL fiyatýna satýn aldý.";
		System.out.println(discountedPrice);
		}
		
	}

}
