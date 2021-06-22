package address.Book;

import user.details.UserDetails;

import java.util.Scanner;
public class AddressBook {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
    	
    	//	User defined in Program
        UserDetails obj = new UserDetails();
        obj.setFname("Javeed");
        obj.setLname(" Dudekula");
        obj.setAddress("#1-123");
        obj.setCity("Chittor");
        obj.setZip("517002");
        obj.setPhonenumber("9100188627");
        obj.setEmail("javeedmohammed466@gmail.com");
        System.out.print("\n"+"\t ADDRESS BOOK"+"\n NAME = "+obj.getFirstname()+obj.getLastname());
        System.out.print("\n ADDRESS = "+obj.getAddress()+", "+obj.getCity()+", "+obj.getZip());
        System.out.println("\n CONTACT = "+obj.getPhonenumber()+"\n Email = "+obj.getEmail() );
        
        // adding the another contact using Scanner
        
        
        System.out.print("enter the number of Contacts to be added = ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
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
        }
        sc.close();      
    }
}
