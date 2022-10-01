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
			System.out.println("Kullanýcý kaydedildi:"+" "+user.getFirstName());
		}
		else {
			System.out.println("Geçerli kiþi deðildir");
		}
		
		

	}

	@Override
	public void update(User user) {
		System.out.println("Biglielr baþarýlý bir þekilde güncellendi: "+user.getFirstName());
		

	}

	@Override
	public void removeUser(User user) {
		
		System.out.println("Kullanýcý silindi: "+user.getFirstName());
		
	}

}
