

//Ability to add a new Contact to Address Book

package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;


public class AddressBookMain {

	public static void main(String[] args) {
		//print statement 
		System.out.println("Welcome to Address Book Program");
		//local variable
		int choice = 1;
		//create scanner object
		Scanner scanner = new Scanner(System.in);
		AddressBookService addressBookService = new AddressBookService();
		//ask to user to perform specific task 
		System.out.println("1.Add Person\\n2.Update Person\\n3.Delete Person");
		System.out.println("Enter Your Choice");
		choice = scanner.nextInt();
		
		//switch case perform operation according to user choice 
		switch(choice) {
		//case 1 perform operation to add person
		case 1:
			//calling method 
			addressBookService.createPerson();
			addressBookService.print();
		}
		
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



class AddressBookService{
	//Declaring ArrayList
	static ArrayList<AddressBookModel> addressBookModels = new ArrayList<>();
	//create scanner object
	public static Scanner scanner = new Scanner(System.in);
	
	//add contact to addressBook
	public void createPerson() {
		//create object of AddressBookModel class
		AddressBookModel addressBookModel = new AddressBookModel();
		
		//ask to user enter the value and scan value 
		System.out.println("Enter the First name ");
		String firstName = scanner.next();
		
		//ask to user enter the value and scan value 
		System.out.println("Enter the Last Name");
		String lastName = scanner.next();
		
		//ask to user enter the value and scan value 
		System.out.println("Enter the City Name");
		String cityName =scanner.next();
		
		//ask to user enter the value and scan value 
		System.out.println("Enter the state Name");
		String stateName = scanner.next();
		
		//ask to user enter the value and scan value 
		System.out.println("Enter the Phone Number");
		double phoneNo = scanner.nextDouble();
		
		//ask to user enter the value and scan value 
		System.out.println("Enter your Zip code");
		int zipCode = scanner.nextInt();
		
		//ask to user enter the value and scan value 
		System.out.println("Enter Your Email Id");
		String emailId = scanner.next();
		
		//calling set method 
		addressBookModel.setFirstName(firstName);
		addressBookModel.setLastName(lastName);
		addressBookModel.setCity(cityName);
		addressBookModel.setState(stateName);
		addressBookModel.setPhoneNo(phoneNo);
		addressBookModel.setZipCode(zipCode);
		addressBookModel.setEmailId(emailId);
		
		
	
		
	}
	
	
	//method to print the value
	public void print() {
		//for loop item is a type of object and addressBookModels is a object 
		for(Object item : addressBookModels) {
			//print statement 
			System.out.println(item);
			
		}
		
		
	}
}





/*
 * OUTPUT
 * Welcome to Address Book Program
1.Add Person\n2.Update Person\n3.Delete Person
Enter Your Choice
1
Enter the First name 
Ram
Enter the Last Name

Enter the City Name
ayodhaya 
Enter the state Name
fsd
Enter the Phone Number
554
Enter your Zip code
4224
Enter Your Email Id
asfa

 */


