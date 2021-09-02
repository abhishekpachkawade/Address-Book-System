
//Start with Displaying Welcome to Address Book Program in AddressBookMain class on Master Branch
//Ability to create a Contacts in Address Book with first and last names, address, city, state, zip, 
//phone number and email

package com.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {
		//print statement 
		System.out.println("Welcome to Address Book Program");

	}

}

class AddressBookModel {
	
	//variable
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zipCode;
	double phoneNo;
	String emailId;
	
	
	//toString method return the string value
	@Override
	public String toString() {
		return "AddressBookModel [firstName=" + firstName + ", lastName=" + lastName + ","
				+ " address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ","
				+ " phoneNo=" + phoneNo + ", emailId=" + emailId + "]";
	}


	//get method 
	public String getFirstName() {
		return firstName;
	}


	//set method
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	//get method 
	public String getLastName() {
		return lastName;
	}


	//set method 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	//get method 
	public String getAddress() {
		return address;
	}


	//set method 
	public void setAddress(String address) {
		this.address = address;
	}


	//get method 
	public String getCity() {
		return city;
	}


	//set method 
	public void setCity(String city) {
		this.city = city;
	}


	//get method 
	public String getState() {
		return state;
	}


	//set method 
	public void setState(String state) {
		this.state = state;
	}


	//get method 
	public int getZipCode() {
		return zipCode;
	}


	//set method 
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	//get method 
	public double getPhoneNo() {
		return phoneNo;
	}


	//set method 
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}


	//get method 
	public String getEmailId() {
		return emailId;
	}


	//set method 
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	
}


