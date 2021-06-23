package address.Book;


import add.contact.AddContact;
import user.details.UserDetails;

public class AddressBook {
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
        
        AddContact obj1 = new AddContact();
        obj1.addcontact();
        // adding the another contact using Scanner
  }
}
