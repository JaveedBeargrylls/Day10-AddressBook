package user.details;


//creation of class named AddressBook
public class UserDetails {
 private String firstname, lastname, address, city, phonenumber, zip, email;
 // getters and setters
 // setter for name
 public void setName(String FirstName, String LastName)
 {
     this.firstname = FirstName;
     this.lastname = LastName;
 }
 // getter for name
 public String getFirstname()
 {
     return firstname;
 }
 public String getLastname()
 {
     return lastname;
 }
 //setter for address
 public void setAddress(String address1,String city1, String zip1)
 {
     this.address = address1;
     this.city = city1;
     this.zip = zip1;
 }
 // getter for address
 public String getAddress()
 {
     return address;
 }
 public String getCity()
 {
     return city;
 }
 public String getZip()
 {
     return zip;
 }
 // Setter for Personal
 public void setPersonal(String phnNumb, String email1)
 {
     this.phonenumber = phnNumb;
     this.email = email1;
 }
 // getter for personal
 public String getPhonenumber()
 {
     return phonenumber;
 }
 public String getEmail()
 {
     return email;
 }

}