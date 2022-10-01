package entities;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private long identityNo;
	
	private int dateOfBirth;
	
	
	
	public User(int id, String firstName, String lastName, long identityNo,  int dateOfBirth) {
		
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNo = identityNo;
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getIdentityNo() {
		return identityNo;
	}
	public void setIdentityNo(long identityNo) {
		this.identityNo = identityNo;
	}
	
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	

}
