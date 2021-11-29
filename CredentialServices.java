package service;

import java.util.Random;

import model.Employee;


public class CredentialService {
	
	
	public char[]generatePassword(){
		
		String capitalLetters="A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
		String smallLetters="a,b,c,d,e,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
		String specialCharacters="!@#$%^&*/-+=";
        String numbers="1234567890";
		
        
        String values = capitalLetters+smallLetters+numbers+specialCharacters;
        Random random = new Random();
        
		char[] password = new char[8];
		
		for (int i=0;i<password.length;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}		
	
		return password;
	
}
public String generateEmailAddress(String firstName,String lastName, String department) {
		
		String email=firstName+lastName+"@"+department+".abc.com";
		
		return email;
	}
public void showCredentials(Employee employee,String email,char[] password) {
	System.out.println("Dear"    +   employee.getFirstName()  +   employee.getLastName()   +  "Your generated credentials are as follows:");
	System.out.println("Email--->" +email);
	
	char[] password2 = password;
	System.out.println(String.format("Password--->%s", password));
	System.out.println("password");
}

}