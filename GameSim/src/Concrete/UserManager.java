package Concrete;
import java.rmi.RemoteException;

import Abstracts.IUserCheckServise;
import Abstracts.IUserManager;
import entities.User;

public class UserManager implements IUserManager {
	IUserCheckServise usercheckservise;

	public UserManager(IUserCheckServise usercheckservise) {
		super();
		this.usercheckservise = usercheckservise;
	}

	@Override
	public void saveUser(User user) throws RemoteException {
		if(usercheckservise.CheckIfRealPerson(user)) {
			System.out.println("Kullan�c� kaydedildi:"+" "+user.getFirstName());
		}
		else {
			System.out.println("Ge�erli ki�i de�ildir");
		}
		
		

	}

	@Override
	public void update(User user) {
		System.out.println("Biglielr ba�ar�l� bir �ekilde g�ncellendi: "+user.getFirstName());
		

	}

	@Override
	public void removeUser(User user) {
		
		System.out.println("Kullan�c� silindi: "+user.getFirstName());
		
	}

}
