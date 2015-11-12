
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author woytek
 */
public class ContactTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contact testContact = new Contact();
        String input = null;
        Scanner keyboard = new Scanner(System.in);
       
        System.out.print( "Enter the last name: " );
        input = keyboard.nextLine();
        testContact.setLastName( input );
        
        System.out.println( "Last name: " + testContact.getLastName() );
        input = null;
        
        
        System.out.print( "Enter the first name: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );
        
        System.out.println( "First name: " + testContact.getFirstName() );
        input = null;

        
        System.out.print( "Enter the middle name: " );
        input = keyboard.nextLine();
        testContact.setMiddleName( input );
        
        System.out.println( "Middle name: " + testContact.getMiddleName() );
        input = null;
        
        
        System.out.print( "Enter the prefix: " );
        input = keyboard.nextLine();
        testContact.setPrefix( input );
        
        System.out.println( "Prefix: " + testContact.getPrefix() );
        input = null;
        
        
        System.out.print( "Enter the phone number in the format 'XXX-XXX-XXXX': " );
        input = keyboard.nextLine();
        testContact.setPhone( input );
        
        System.out.println( "Phone number: " + testContact.getPhone() );
        input = null;
        
        
        System.out.print( "Enter the email: " );
        input = keyboard.nextLine();
        testContact.setEmail( input );
        
        System.out.println( "Email: " + testContact.getEmail() );
        input = null;
        
        System.out.print( "Enter the street: " );
        input = keyboard.nextLine();
        testContact.setStreet( input );
        
        System.out.println( "Street: " + testContact.getStreet() );
        input = null;
        
        
        System.out.print( "Enter the city: " );
        input = keyboard.nextLine();
        testContact.setCity( input );
        
        System.out.println( "City: " + testContact.getCity() );
        input = null;
        
        
        System.out.print( "Enter the state ABBRIVATION: " );
        input = keyboard.nextLine();
        testContact.setState( input );
        
        System.out.println( "State: " + testContact.getState() );
        input = null;
        
        
        System.out.print( "Enter the zip (4-10 characters): " );
        input = keyboard.nextLine();
        testContact.setZip( input );
        
        System.out.println( "Zip: " + testContact.getZip() );
        input = null;
        
        
        System.out.print( "Enter the occupation: " );
        input = keyboard.nextLine();
        testContact.setOccupation( input );
        
        System.out.println( "Occupation: " + testContact.getOccupation() );
        input = null;
    }
    
    public static class Contact {
        Contact() {
        }
        
        public void setLastName( String n ) {
            
            if( !n.matches("^[A-Za-z'-]+$") ) { //Regular Expression
                System.out.println( "Invalid characters in last name" );
            } else {
                lName = n;
            }
        }
        public String getLastName() {
            return lName;
        }
        
        public void setFirstName( String r ) {
            
            if( !r.matches("^[A-Za-z'-]+$") ) { //Regular Expression
                System.out.println( "Invalid characters in first name" );
            } else {
                fName = r;
            }
        }
        public String getFirstName() {
            return fName;
        }
        
        public void setMiddleName( String s ) {
            
            if( !s.matches("^[A-Za-z'-]+$") ) { //Regular Expression
                System.out.println( "Invalid characters in middle name" );
            } else {
                mName = s;
            }
        }
        public String getMiddleName() {
            return mName;
        }
        
        public void setPrefix( String q ) {
        	
        	if( !q.matches("^[A-Za-z.]+$") ) { //Regular Expression
                System.out.println( "Invalid characters in prefix" );
            } else {
                prefix = q;
            }        	
        }
        public String getPrefix() {
        	return prefix;
        }
        
        public void  setPhone( String cash ) {
        	
        	if( !cash.matches("^[0-9]{3}-[0-9]{3}-[0-9]{4}$")) {
        		System.out.println( "Invalid characters in phone number" );
        	} else {
        		phone = cash;
        	}
        }
        public String getPhone() {
        	return phone;
        }
        
        public void  setEmail( String money ) {
        	
        	if( !money.matches("^[A-Za-z.@_'-]+$")) {
        		System.out.println( "Invalid characters in email" );
        	} else {
        		email = money;
        	}
        }
        public String getEmail() {
        	return email;
        }
        
        public void  setStreet( String elephants ) {
        	
        	if( !elephants.matches("^[A-Za-z0-9 ]+$")) {
        		System.out.println( "Invalid characters in street address" );
        	} else {
        		street = elephants;
        	}
        }
        public String getStreet() {
        	return street;
        }
        
        public void  setCity( String kittens ) {
        	
        	if( !kittens.matches("^[A-Za-z]+$")) {
        		System.out.println( "Invalid characters in city name" );
        	} else {
        		city = kittens;
        	}
        }
        public String getCity() {
        	return city;
        }
        
        public void  setState( String dogs ) {
        	
        	if( !dogs.matches("^[A-Za-z]{2}$")) {
        		System.out.println( "Invalid characters in state abbrivation" );
        	} else {
        		state = dogs;
        	}
        }
        
        public String getState() {
        	return state;
        }
        
        public void  setZip( String animal ) {
        	
        	if( !animal.matches("^[A-Za-z0-9 ]{4,10}$")) {
        		System.out.println( "Invalid characters in zip code" );
        	} else {
        		zip = animal;
        	}
        }
        
        public String getZip() {
        	return zip;
        }
        
        public void  setOccupation( String ice ) {
        	
        	if( !ice.matches("^[A-Za-z0-9]+$")) {
        		System.out.println( "Invalid characters in occupation" );
        	} else {
        		occupation = ice;
        	}
        }
        
        public String getOccupation() {
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
        
        // example phone number reges: "^[0-9]{3}-[0-9]{3}-[0-9]{4}$"
        
        private String lName,fName, mName;
        private String prefix;
        private String phone;
        private String email;
        private String street, city, state, zip;
        private String occupation;
        
        // Repository and fork
        // Finish implintation of class so it works properly
        // Regex
        // Have input validation and methods for all of the private following
        
    }
    
}
