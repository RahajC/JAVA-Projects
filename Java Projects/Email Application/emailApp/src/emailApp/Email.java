package emailApp;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	//Determine the department
	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\nEnter Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) { return "sales";}
		else if(depChoice == 2) { return "dev"; }
		else if(depChoice == 3) { return "acct"; }
		else { return " "; }
		
	}
	
	//Generate a random String for a password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ012345678912345";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	//Set methods to change the password, set mailbox capacity, and define alternate email address{
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity  = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	
	//Get methods to display name, email, mailbox capacity
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: "  + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "ab";
	}

	

}
