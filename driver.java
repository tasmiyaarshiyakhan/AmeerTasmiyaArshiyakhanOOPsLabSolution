package service;

import java.util.Scanner;

import model.Employee;

public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      
		System.out.println("Please enter any of the following option");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter firstName");
	    String firstName=sc.nextLine();
	
	   System.out.println("Enter lastName");
	   String lastName=sc.nextLine();
	    
	   Employee employee = new Employee(firstName, lastName);
		
	    int option= sc.nextInt();

    CredentialService cs = new CredentialService();
     String generatedEmail;
     char[] generatedPassword;
   if(option==1) {
	 generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "Technical");
	 generatedPassword=cs.generatePassword();
	 cs.showCredentials(employee, generatedEmail, generatedPassword);
	 
 }else if(option==2) {
	 generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "admin");
	 generatedPassword=cs.generatePassword();
	 cs.showCredentials(employee, generatedEmail, generatedPassword);
	 
 }else if(option==3) {
	 generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "hr");
	 generatedPassword=cs.generatePassword();
	 cs.showCredentials(employee, generatedEmail, generatedPassword);
	 
	 
 }else if(option==4) {
	 generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "legal");
	 generatedPassword=cs.generatePassword();
	 cs.showCredentials(employee, generatedEmail, generatedPassword);
	 
 
 }else {
	 System.out.println("Enter valid option");
 

     	}

     
	}
   
} 
	