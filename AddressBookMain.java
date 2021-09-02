

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
		while (choice != 0) {
			
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
				break;
			case 2:
				//ask to user update your data 
				System.out.println("Enter the name of person to Update");
				String name = scanner.next();
				System.out.println("Enter what to update(city/state/phone/zip):");
				String update = scanner.next();
				//calling the method
				addressBookService.updatePerson(name);
				addressBookService.print();
			    break;
			case 3:
				System.out.println("Enter name of person to Delete");
				String n = scanner.next();
				addressBookService.DeletePerson(n);
				addressBookService.print();
				break;
			}
		
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
	String zipCode;
	double phoneNo;
	String emailId;
	
	public AddressBookModel(String firstName, String lastName, double phoneNo, String email, String state, String city,
			String zip) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.emailId = email;
		this.state = state;
		this.city = city;
		this.zipCode = zip;
	}
	
	
	
	
	//toString method return the string value
	@Override
	public String toString() {
		return "AddressBookModel [firstName=" + firstName + ", lastName=" + lastName + ","
				+ " address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ","
				+ " phoneNo=" + phoneNo + ", emailId=" + emailId + "]";
	}


	public AddressBookModel() {
		super();

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
	public String getZipCode() {
		return zipCode;
	}


	//set method 
	public void setZipCode(String zipCode) {
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
		String zipCode = scanner.next();
		
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
		
		addressBookModels.add(addressBookModel);
	
		
	}
	
	//method update person
	public void updatePerson(String name) {
		//for loop
		 for( int search = 0 ; search < addressBookModels.size() ; search++ ) {
			 	//update the detail 
	            if( addressBookModels.get(search).getFirstName().equalsIgnoreCase(name)) {
	            	AddressBookModel person = addressBookModels.get(search);
	                System.out.println("Hi  "+person.getFirstName()+" Please edit your details");
	                System.out.println("Hi Person "+person.getFirstName()+" Please edit your address");
	                scanner.next();
	                String address = scanner.nextLine();
	                person.setAddress(address);
	                System.out.println("Hi  "+person.getFirstName()+" Please edit your city");
	                String city = scanner.next();
	                person.setCity(city);
	                System.out.println("Hi "+person.getFirstName()+" Please edit your state");
	                String state = scanner.next();
	                person.setState(state);
	                System.out.println("Hi "+person.getFirstName()+" Please edit your phone number");
	                long phone = scanner.nextLong();
	                person.setPhoneNo(phone);
	                System.out.println("Hi "+person.getFirstName()+" Please edit your zip");
	                scanner.nextLine();
	                String zip = scanner.nextLine();
	                person.setZipCode(zip);
	                System.out.println("Hi "+person.getFirstName()+" Successfully you have updated your details. ");
	            }
	        }
	}
	
	
	static public AddressBookModel getContact(String name) {
		for (AddressBookModel cont : addressBookModels) {
			if (cont.getFirstName().equals(name)) {
				return cont;
			} else {
				System.out.println("Invalid name");
			}

		}
		return null;
	}
	
	
	
	public void DeletePerson(String name) // Delete Person
	{
		
		
		addressBookModels.remove(getContact(name));
		
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
Welcome to Address Book Program
1.Add Person\n2.Update Person\n3.Delete Person
Enter Your Choice
1
Enter the First name 
abhi
Enter the Last Name
df
Enter the City Name
gg
Enter the state Name
gd
Enter the Phone Number
55
Enter your Zip code
gd
Enter Your Email Id
dg
AddressBookModel [firstName=abhi, lastName=df, address=null, city=gg, state=gd, zipCode=gd, phoneNo=55.0, emailId=dg]
1.Add Person\n2.Update Person\n3.Delete Person
Enter Your Choice
1
Enter the First name 
ds
Enter the Last Name
dg
Enter the City Name
dg
Enter the state Name
d
Enter the Phone Number
66
Enter your Zip code
dg
Enter Your Email Id
dg
AddressBookModel [firstName=abhi, lastName=df, address=null, city=gg, state=gd, zipCode=gd, phoneNo=55.0, emailId=dg]
AddressBookModel [firstName=ds, lastName=dg, address=null, city=dg, state=d, zipCode=dg, phoneNo=66.0, emailId=dg]
1.Add Person\n2.Update Person\n3.Delete Person
Enter Your Choice
3
Enter name of person to Delete
abhi
AddressBookModel [firstName=ds, lastName=dg, address=null, city=dg, state=d, zipCode=dg, phoneNo=66.0, emailId=dg]
1.Add Person\n2.Update Person\n3.Delete Person
Enter Your Choice

 */


