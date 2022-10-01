package Adepter;

import java.rmi.RemoteException;

import Abstracts.IUserCheckServise;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserCheckServise implements IUserCheckServise{

	public boolean CheckIfRealPerson(User user) throws RemoteException {
			
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(user.getIdentityNo(), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getDateOfBirth());
	}

}
