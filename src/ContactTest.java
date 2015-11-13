
import java.util.Scanner;

/**
 *
 * @author woytek
 * @ Isabelle Schroeder
 */
public class ContactTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contact testContact = new Contact();
        String input = null;
        Double num = null;
        Scanner keyboard = new Scanner(System.in);
       
        System.out.print( "Enter the last name: " );
        input = keyboard.nextLine();
        testContact.setLastName( input );
        
        System.out.print( "Enter the first name: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );        
        
        System.out.print( "Enter the middle name: " );
        input = keyboard.nextLine();
        testContact.setMiddleName( input );
        
        System.out.print( "Enter prefix: " );
        input = keyboard.nextLine();
        testContact.setPrefix( input );
        
        System.out.print( "Enter phone number: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );
        
        System.out.print( "Enter email: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );
        
        System.out.print( "Enter street: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );
        
        System.out.print( "Enter city: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );
        
        System.out.print( "Enter state: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );
        
        System.out.print( "Enter ZIP code: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );
        
        System.out.print( "Enter occupation: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );
        
        System.out.println( "Last name: " + testContact.getLastName() );
        System.out.println( "First name: " + testContact.getFirstName() );
        System.out.println( "Middle name: " + testContact.getMiddleName() );
        System.out.println( "Prefix: " + testContact.getPrefix() );
        System.out.println( "Phone number: " + testContact.getPhone() );
        System.out.println( "Email: " + testContact.getEmail() );
        System.out.println( "Street: " + testContact.getStreet() );
        System.out.println( "City: " + testContact.getCity() );
        System.out.println( "State: " + testContact.getState() ); 
        System.out.println( "ZIP: " + testContact.getZip() );
        System.out.println( "Occupation: " + testContact.getOccupation() );
        
    }
    
    public static class Contact {
        Contact() {
        }
        public void setLastName( String n ) {
         
        	
        	if( !n.matches("^[A-Za-z]+$") ) {
                System.out.println( "Invalid characters in last name" );
            } else {
                lName = n;
            }
        }
        public String getLastName() {
            return lName;
        }
        
        
        public void setFirstName( String n ) {
            fName = n;
        }
        public String getFirstName() {
            return fName;
        }
        
        
        public void setMiddleName( String n ) {
            mName = n;
        }
        public String getMiddleName() {
            return mName;
        }
        
        
        public void setPrefix( String n ){
        	prefix = n;
        }
        public String getPrefix(){
        	return prefix;
        }
        
        
        public void setPhone( String n ){
        	phone = n;
        }
        public String getPhone(){
        	return phone;
        }
        
        
        public void setEmail( String n ){
        email = n;
        }
        public String getEmail(){
        	return email;
        }
        
        
        public void setStreet( String n ){
        	street = n;
        }
        public String getStreet(){
        	return street;
        }
        
        
        public void setCity( String n ){
        	city = n;
        }
        public String getCity(){
        	return city;
        }
        
        
        public void setState( String n ){
        	state = n;
        }
        public String getState(){
        	return state;
        }
        
        
        public void setZip( String n ){
        	zip = n;
        }
        public String getZip(){
        	return zip;
        }
        
        
        public void setOccupation( String n ){
        	occupation = n;
        }
        public String getOccupation(){
        	return occupation;
        }
        /*
         * Name (first, last, middle)
         * Prefix
         * Phone number
         * email
         * address (street, city, state, zip)
         * occupation
        */
        
        private String lName,fName, mName;
        private String prefix;
        private String phone;
        private String email;
        private String street, city, state, zip;
        private String occupation;
        
        
    }
    
}
