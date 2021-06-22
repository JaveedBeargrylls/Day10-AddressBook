package address.Book;

import user.details.UserDetails;

public class AddressBook {
    public static void main(String[] args){
        UserDetails obj = new UserDetails();
        obj.setName("Javeed"," Dudekula");
        obj.setAddress("#1-123","Chittoor, A.P","517002");
        obj.setPersonal("9100188627","javeedmohammed466@gmail.com");
        System.out.print("\n"+"\t ADDRESS BOOK"+"\n NAME = "+obj.getFirstname()+obj.getLastname());
        System.out.print("\n ADDRESS = "+obj.getAddress()+", "+obj.getCity()+", "+obj.getZip());
        System.out.println("\n CONTACT = "+obj.getPhonenumber()+"\n Email = "+obj.getEmail() );
    }
}