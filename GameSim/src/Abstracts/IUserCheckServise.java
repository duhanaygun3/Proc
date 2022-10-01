package Abstracts;

import java.rmi.RemoteException;

import entities.User;

public interface IUserCheckServise {
	boolean CheckIfRealPerson(User user) throws RemoteException;

}
