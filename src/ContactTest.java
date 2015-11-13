
import java.util.Scanner;

/**
 *
 * @author woytek
 */
public class ContactTest {

    public static final String String = null;

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Contact testContact = new Contact();
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        
        System.out.print( "Enter the last name: " );
        input = keyboard.nextLine();
        testContact.setLastName( input );
        
        System.out.print( "Enter the first name: " );
        input = keyboard.nextLine();
        testContact.setFirstName(input);
        
        System.out.print( "Enter the middle name: " );
        input = keyboard.nextLine();
        testContact.setMiddleName(input);
        
        System.out.print( "Enter your Title (Dr, proffessor, Mr, Mrs): " );
        input = keyboard.nextLine();
        testContact.setPrefix(input);
        
        System.out.print( "Enter occupation: " );
        input = keyboard.nextLine();
        testContact.setOccupation(input);
        
        System.out.print( "Enter phone number: " );
        input = keyboard.nextLine();
        testContact.setPhoneNumber(input);
        
        System.out.print( "Enter email: " );
        input = keyboard.nextLine();
        testContact.setEmail(input);
        
        System.out.print( "Enter adress number (4 numbers): " );
        input = keyboard.nextLine();
        testContact.setStreetNumber(input);
        
        System.out.print( "Enter street name: " );
        input = keyboard.nextLine();
        testContact.setStreetName(input);
        
        System.out.print( "Enter city name: " );
        input = keyboard.nextLine();
        testContact.setCity(input);
        
        System.out.print( "Enter state initial: " );
        input = keyboard.nextLine();
        testContact.setStateAB(input);
        
        System.out.print( "Enter zip code: " );
        input = keyboard.nextLine();
        testContact.setZipCode(input);
        
        
        
        System.out.println( "\n\nPrefix: " + testContact.getPrefix() + 
        					"\nFirst Name: " + testContact.getFirstName() 
        					+ "\nLast name: " + testContact.getMiddleName()
        					+ "\nMiddle Name: " + testContact.getLastName()
        					+ "\nOccupation: " + testContact.getOccupation()
        					+ "\nPhone Number: " + testContact.getPhoneNumber()
        					+"\nEmail: " + testContact.getEmail()
        					+"\nAddress: " + testContact.getStreetNumber()
        					+ " " + testContact.getStreetName()+ " " + testContact.getCity()
        					+ " " + testContact.getStateAB() + " " + testContact.getZipCode()
        					);
    }
    
    /**
     * 
     * @author Ryley
     *
     */
    public static class Contact {
        Contact() {
        }
        
        /**
         * 
         * @param n
         */
        public void setLastName( String n ) {
            
        	// I allow the character ' because the might be in one's last name (example O'Riley)
        	Scanner key = new Scanner(System.in);
        	nameIsValid(n);
        	
        	if (nameIsValid(n)){
                while((nameIsValid( n) == true)){
        		System.out.println( "Invalid characters in last name" );
                System.out.println( "Correctly:");
                n = key.nextLine();
                lName = n;
                }
            } else {
                lName = n;
            }
        }
        
        /**
         * 
         * @return 1Name
         */
        public String getLastName() {
            return lName;
        }
        public void setFirstName( String n ) {
        	Scanner key = new Scanner(System.in);
        	
        	nameIsValid(n);
        	
        	if (nameIsValid(n)){
                while((nameIsValid( n) == true)){
        		System.out.println( "Invalid characters in last name" );
                System.out.println( "Correctly:");
                n = key.nextLine();
                fName = n;
                }
            } else {
        	fName = n;
            }
        }
       
        /**
         * 
         * @return fName
         */
        public String getFirstName() {
            return fName;
        }
        public void setMiddleName( String n ) {
        	Scanner key = new Scanner(System.in);
        	nameIsValid(n);
        	
        	if (nameIsValid(n)){
                while((nameIsValid( n) == true)){
        		System.out.println( "Invalid characters in last name" );
                System.out.println( "Correctly:");
                n = key.nextLine();
                mName = n;
                }
            } else {
        	mName = n;
            }
        }
       
        /**
         * 
         * @return mName
         */
        public String getMiddleName() {
            return mName;
        }
        
        /**
         * 
         * @param n
         */
        public void setPrefix(String n){
        	Scanner key = new Scanner(System.in);
        	
        	nameIsValid(n);
        	
        	if (nameIsValid(n)){
                while((nameIsValid( n) == true)){
                	System.out.println( "Invalid characters in last name" );
                	System.out.println( "Correctly:");
                	n = key.nextLine();
                	prefix = n;
                }
              } else {
        	prefix = n;
            }
        }
        
        /**
         * 
         * @return prefix
         */
        public String getPrefix(){
        	return prefix;
        }
        
        /**
         * 
         * @param n
         */
        public void setOccupation(String n){
        	Scanner key = new Scanner(System.in);
        	
        	nameIsValid(n);
        	
        	if (nameIsValid(n)){
                while((nameIsValid( n) == true)){
                	System.out.println( "Invalid characters in last name" );
                	System.out.println( "Correctly:");
                	n = key.nextLine();
                	occupation = n;
                }
            } else {
        	occupation = n;
            }
        }
        
        /**
         * 
         * @return occupation
         */
        public String getOccupation(){
        	return occupation;
        }
        
        /**
         * 
         * @param n
         */
        public void setCity(String n){
        	Scanner key = new Scanner(System.in);
        	
        	nameIsValid(n);
        	
        	if (nameIsValid(n)){
                while((nameIsValid( n) == true)){
        		System.out.println( "Invalid characters in last name" );
                System.out.println( "Correctly:");
                n = key.nextLine();
                city = n;
                }
            } else {
            	city = n;
            }

        }
        /**
         * 
         * @return city
         */
        public String getCity(){
        	return city;
        }
        
        /**
         * 
         * @param n
         */
        public void setStreetName(String n){
        	Scanner key = new Scanner(System.in);
        	nameIsValid(n);
        	
        	if (nameIsValid(n)){
                while((nameIsValid( n) == true)){
        		System.out.println( "Invalid characters in last name" );
                System.out.println( "Correctly:");
                n = key.nextLine();
                street1 = n;
                }
            } else {
            	street1 = n;
            }
        }
        
        /**
         * 
         * @return street1
         */
        public String getStreetName(){
        	return street1;
        }
        
        /**
         * 
         * @param n
         */
        public void setStateAB(String n){
        	Scanner key = new Scanner(System.in);
        	nameIsValid(n);
        	
        	if( !n.matches("^[a-zA-Z]{2}") ) { 	
            	while(!n.matches("^[a-zA-Z]{2}") == false){
            		System.out.println( "Invalid characters in last name" );
            		System.out.println( "Correctly:");
            		n = key.nextLine();
            		state = n;
            		}
            } else {
            	state = n;
            }
        }
        
        /**
         * 
         * @return state
         */
        public String getStateAB(){
        	return state;
        }
        
        /**
         * 
         * @param n
         */
        public void setStreetNumber(String n){
        	Scanner key = new Scanner(System.in);
        	
            if( !n.matches("^[0-9]{4}") ) { 	
            	while(!n.matches("^[0-9]{4}") == false){
            		System.out.println( "Invalid characters in last name" );
                    System.out.println( "Correctly:");
                    n = key.nextLine();
                    street2 = n;
            		}
        	} else {
        		street2 = n;
        	}
        }
        
        /**
         * 
         * @return street2
         */
        public String getStreetNumber(){
        	return street2;
        }
        
        /**
         * 
         * @param n
         */
        public void setPhoneNumber(String n) {
        	Scanner key = new Scanner(System.in);
        	
        	if( !n.matches("^[0-9]{13}") == false) { 
        		while(!n.matches("^[0-9 -] {10}") == false){
            		System.out.println( "Invalid characters in last name" );
                    System.out.println( "Correctly:");
                    n = key.nextLine();
                    phone = n;    
        		}
        	} else {
                    	phone = n;
                    }
        }
        
        /**
         * 
         * @return phone
         */
        public String getPhoneNumber(){
        	return phone;
        }
        
        /**
         * 
         * @param n
         */
        public void setZipCode(String n){
        	Scanner key = new Scanner(System.in);
        	
        	if( !n.matches("^[0-9]{5}") == true ) { 	
        		while(!n.matches("^[0-9]{5}") == false){
        			System.out.println( "Invalid characters in last name" );
        			System.out.println( "Correctly:");
        			n = key.nextLine();
        			zip = n;
        		}
    	} else {
    		zip = n;
        }
        }
       
        /**
         * 
         * @return zip
         */
       public String getZipCode(){
        	return zip;
        }
        
       /**
        * 
        * @param n
        */
        public void setEmail(String n){
        	Scanner key = new Scanner(System.in);
        	
        	if( !n.matches("^[a-zA-Z @ .]+$ ") ==  false ) { 	
            	while ( !n.matches("^[a-zA-Z @ .]") == false){
            		System.out.println( "Invalid characters in last name" );
                    System.out.println( "Correctly:");
                    n = key.nextLine();
                    email = n;
            	}
        	} else {
        		email = n;
        	}
        }
        
        /**
         * 
         * @return email
         */
        public String getEmail(){
        	return email;
        }
        
        /**
         * 
         * @param n
         * @return true/false
         */
        public static  boolean nameIsValid(String n){
        	if(!n.matches("^[a-zA-z]+$")) {
        		return true;
        	}else{
        		return false;
        	}
        
       
        
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
        private String street1, street2, city, state, zip;
        private String occupation;
        
        
        
    }
    
}

