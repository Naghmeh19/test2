package Model;


import java.time.LocalDateTime;

public class Customer{

	private Long customerID;
	private String firstName;
	private Double credits;
	private String email;
	private String lastname;
	private LocalDateTime birthdate;
	private String gender;
	
	
	
	
	
	public Customer(long id,String email,String firstname, String lastname, String gender,LocalDateTime birthdate, Double credits) {
		
			setCustomerID(id);
			setEmail(email);
		    setFirstName(firstname);
		    setLastname(lastname);
		    setGender(gender);
		    setBirthdate(birthdate);
		    setCredit(credits);
	
	}

	public Long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getCredit() {
		return credits;
	}

	public void setCredit(double credit) {
		this.credits = credit;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastaname) {
		this.lastname = lastaname;
	}


	public LocalDateTime getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(LocalDateTime birthdate) {
		this.birthdate = birthdate;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [ ID= " + customerID + "\tEmail= "+ email+"\tFirstname ="+ firstName  + "\tLastname= "+ 
	lastname+ "\tGender= " + gender+  "\tBirthdate= " +birthdate +"\tCredits = "+ credits  +"]\n";
	}
	

	
	
}
