package add.contact;

import user.details.UserDetails;
import java.util.Scanner;

public class AddContact {
	public void addcontact() {
		Scanner sc = new Scanner(System.in);
		UserDetails obj = new UserDetails();
		System.out.print("enter the number of Contacts to be added = ");
	    	System.out.print("enter the First name = ");
	        obj.setFname(sc.next());
	        System.out.print("enter the Last name = ");
	        obj.setLname(sc.next());
	        System.out.print("enter the Address = ");
	        obj.setAddress(sc.next());
	        System.out.print("enter the city = ");
	        obj.setCity(sc.next());
	        System.out.print("enter the zip = ");
	        obj.setZip(sc.next());
	        System.out.print("enter the phonenumber = ");
	        obj.setPhonenumber(sc.next());
	        System.out.print("enter the Email = ");
	        obj.setEmail(sc.next());
	 
	    System.out.print("\n"+"\t ADDRESS BOOK"+"\n NAME = "+obj.getFirstname()+obj.getLastname());
	    System.out.print("\n ADDRESS = "+obj.getAddress()+", "+obj.getCity()+", "+obj.getZip());
	    System.out.println("\n CONTACT = "+obj.getPhonenumber()+"\n Email = "+obj.getEmail() );
	    sc.close();      
	}
}
