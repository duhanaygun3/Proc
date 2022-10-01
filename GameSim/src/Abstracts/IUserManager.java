package Abstracts;
import java.rmi.RemoteException;

import entities.User;

public interface IUserManager {
	public void saveUser (User user) throws RemoteException;
	
	public void removeUser(User user);
	
	public void update(User user);
	

}
