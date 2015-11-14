
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Jack Protivnak
 */
public class ContactTest {

    /**
     * This program is designed to ask a user to enter their
     * contact information and it will then repeat the information
     * back to them. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contact testContact = new Contact(); // Creating a new object to access the class "Contact"
        String input = null; // Creating new object input and setting it to null
        Scanner keyboard = new Scanner(System.in); // Notifying system keyboard will be used for input
       
        // Prompting user to enter last name
        System.out.print( "Enter the last name: " );
        input = keyboard.nextLine();
        testContact.setLastName( input );
        
        // Repeating the information back to user
        System.out.println( "Last name: " + testContact.getLastName() );
        input = null;
        
        // Prompting user to enter first name
        System.out.print( "Enter the first name: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );
        
        // Repeating the information back to user
        System.out.println( "First name: " + testContact.getFirstName() );
        input = null;

        // Prompting user to enter middle name
        System.out.print( "Enter the middle name: " );
        input = keyboard.nextLine();
        testContact.setMiddleName( input );
        
        // Repeating the information back to user
        System.out.println( "Middle name: " + testContact.getMiddleName() );
        input = null;
        
        // Prompting user to enter their prefix
        System.out.print( "Enter the prefix: " );
        input = keyboard.nextLine();
        testContact.setPrefix( input );
        
        // Repeating the information back to user
        System.out.println( "Prefix: " + testContact.getPrefix() );
        input = null;
        
        // Prompting user to enter their phone number
        System.out.print( "Enter the phone number in the format 'XXX-XXX-XXXX': " );
        input = keyboard.nextLine();
        testContact.setPhone( input );
        
        // Repeating the information back to user
        System.out.println( "Phone number: " + testContact.getPhone() );
        input = null;
        
        // Prompting user to enter their email
        System.out.print( "Enter the email: " );
        input = keyboard.nextLine();
        testContact.setEmail( input );
        
        // Repeating the information back to user
        System.out.println( "Email: " + testContact.getEmail() );
        input = null;
        
        // Prompting user to enter their street
        System.out.print( "Enter the street: " );
        input = keyboard.nextLine();
        testContact.setStreet( input );
        
        // Repeating the information back to user
        System.out.println( "Street: " + testContact.getStreet() );
        input = null;
        
        // Prompting user to enter their city of residence
        System.out.print( "Enter the city: " );
        input = keyboard.nextLine();
        testContact.setCity( input );
        
        // Repeating the information back to user
        System.out.println( "City: " + testContact.getCity() );
        input = null;
        
        // Prompting user to enter the abbreviation for their state of residence
        System.out.print( "Enter the state ABBRIVATION: " );
        input = keyboard.nextLine();
        testContact.setState( input );
        
        // Repeating the information back to user
        System.out.println( "State: " + testContact.getState() );
        input = null;
        
        // Prompting user to enter their zip code
        System.out.print( "Enter the zip (4-10 characters): " );
        input = keyboard.nextLine();
        testContact.setZip( input );
        
        // Repeating the information back to user
        System.out.println( "Zip: " + testContact.getZip() );
        input = null;
        
        // Prompting user to enter their occupation
        System.out.print( "Enter the occupation: " );
        input = keyboard.nextLine();
        testContact.setOccupation( input );
        
        // Repeating the information back to user
        System.out.println( "Occupation: " + testContact.getOccupation() );
        input = null;
    }
    
    /**
     * @author Jack Protivnak
     * This class will be fed information from the user input and will then
     * run it through an input validation within a method to test its characters. It will 
     * then tell the user if they entered an invalid character or it will continue.
     * It also contains methods for returning the data.
     */
    
    public static class Contact {
    	/**
    	 * Constructor defined.
    	 */
        Contact() {
        }
        
        /**
         * This method is designed to check the characters in the 
         * last name the user entered and tell them if its acceptable
         * or invalid characters were entered.
         */
        public void setLastName( String n ) {
            
            if( !n.matches("^[A-Za-z'-]+$") ) { //Regular Expression
                System.out.println( "Invalid characters in last name" );
            } else {
                lName = n;
            }
        }
        /**
         * Method to return the user's last name.
         */
        public String getLastName() {
            return lName;
        }
        
        /**
         * This method is designed to check the characters in the 
         * first name the user entered and tell them if its acceptable
         * or invalid characters were entered.
         */
        public void setFirstName( String r ) {
            
            if( !r.matches("^[A-Za-z'-]+$") ) { //Regular Expression
                System.out.println( "Invalid characters in first name" );
            } else {
                fName = r;
            }
        }
        /**
         * Method to return the user's first name.
         */
        public String getFirstName() {
            return fName;
        }
        
        /**
         * This method is designed to check the characters in the 
         * middle name the user entered and tell them if its acceptable
         * or invalid characters were entered.
         */
        public void setMiddleName( String s ) {
            
            if( !s.matches("^[A-Za-z'-]+$") ) { //Regular Expression
                System.out.println( "Invalid characters in middle name" );
            } else {
                mName = s;
            }
        }
        /**
         * Method to return the user's middle name.
         */
        public String getMiddleName() {
            return mName;
        }
        
        /**
         * This method is designed to check the characters in the 
         * prefix the user entered and tell them if its acceptable
         * or invalid characters were entered.
         */
        public void setPrefix( String q ) {
        	
        	if( !q.matches("^[A-Za-z.]+$") ) { //Regular Expression
                System.out.println( "Invalid characters in prefix" );
            } else {
                prefix = q;
            }        	
        }
        /**
         * Method to return the user's prefix.
         */
        public String getPrefix() {
        	return prefix;
        }
        
        /**
         * This method is designed to check the characters in the 
         * phone number the user entered and tell them if its acceptable
         * or invalid characters were entered.
         */
        public void  setPhone( String cash ) {
        	
        	if( !cash.matches("^[0-9]{3}-[0-9]{3}-[0-9]{4}$")) {
        		System.out.println( "Invalid characters in phone number" );
        	} else {
        		phone = cash;
        	}
        }
        /**
         * Method to return the user's phone number.
         */
        public String getPhone() {
        	return phone;
        }
        
        /**
         * This method is designed to check the characters in the 
         * email the user entered and tell them if its acceptable
         * or invalid characters were entered.
         */
        public void  setEmail( String money ) {
        	
        	if( !money.matches("^[A-Za-z-_.]+@[A-Za-z-]+.[A-Za-z]+$")) {
        		System.out.println( "Invalid characters in email" );
        	} else {
        		email = money;
        	}
        }
        /**
         * Method to return the user's email.
         */
        public String getEmail() {
        	return email;
        }
        
        /**
         * This method is designed to check the characters in the 
         * street the user entered and tell them if its acceptable
         * or invalid characters were entered.
         */
        public void  setStreet( String elephants ) {
        	
        	if( !elephants.matches("^[A-Za-z0-9 ]+$")) {
        		System.out.println( "Invalid characters in street address" );
        	} else {
        		street = elephants;
        	}
        }
        /**
         * Method to return the user's street.
         */
        public String getStreet() {
        	return street;
        }
        
        /**
         * This method is designed to check the characters in the 
         * city the user entered and tell them if its acceptable
         * or invalid characters were entered.
         */
        public void  setCity( String kittens ) {
        	
        	if( !kittens.matches("^[A-Za-z]+$")) {
        		System.out.println( "Invalid characters in city name" );
        	} else {
        		city = kittens;
        	}
        }
        /**
         * Method to return the user's city.
         */
        public String getCity() {
        	return city;
        }
        
        /**
         * This method is designed to check the characters in the 
         * state the user entered and tell them if its acceptable
         * or invalid characters were entered.
         */
        public void  setState( String dogs ) {
        	
        	if( !dogs.matches("^[A-Za-z]{2}$")) {
        		System.out.println( "Invalid characters in state abbrivation" );
        	} else {
        		state = dogs;
        	}
        }
        /**
         * Method to return the user's state.
         */
        public String getState() {
        	return state;
        }
        
        /**
         * This method is designed to check the characters in the 
         * zip code the user entered and tell them if its acceptable
         * or invalid characters were entered.
         */
        public void  setZip( String animal ) {
        	
        	if( !animal.matches("^[A-Za-z0-9- ]{4,10}$")) {
        		System.out.println( "Invalid characters in zip code" );
        	} else {
        		zip = animal;
        	}
        }
        /**
         * Method to return the user's zip code.
         */
        public String getZip() {
        	return zip;
        }
        
        /**
         * This method is designed to check the characters in the 
         * occupation the user entered and tell them if its acceptable
         * or invalid characters were entered.
         */
        public void  setOccupation( String ice ) {
        	
        	if( !ice.matches("^[A-Za-z0-9]+$")) {
        		System.out.println( "Invalid characters in occupation" );
        	} else {
        		occupation = ice;
        	}
        }
        /**
         * Method to return the user's occupation.
         */
        public String getOccupation() {
        	return occupation;
        }
       
        
        private String lName,fName, mName; // Declaring variables as strings and making them private
        private String prefix; // Declaring variables as strings and making them private
        private String phone; // Declaring variables as strings and making them private
        private String email; // Declaring variables as strings and making them private
        private String street, city, state, zip; // Declaring variables as strings and making them private
        private String occupation; // Declaring variables as strings and making them private
        
    }
    
}
