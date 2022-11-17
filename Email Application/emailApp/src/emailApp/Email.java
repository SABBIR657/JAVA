package emailApp;

import java.util.Scanner;

public class Email {
  private String firstName;
  private String LastName;
  private String password;
  private  String department;
  private String email;
  private  int mailboxCapacity;
  private int defaultPasswordLength;
  private String alternateEmail;
  private String companySuffix = "aeycompany.com";
  
  //constructor to recive the first name and last name
  
  public Email(String firstName, String LastName) {
	  this.firstName = firstName;
	  this.LastName = LastName;
	//  System.out.println("Email Created" + this.firstName + this.LastName);
	  
	  //call a method asking for the department - return department 
	  
	  this.department = setDepartment();
	 // System.out.println("Department : "+this.department);
	  
	  //call a method that will return a random password
	  this.password = randomPassword(8);
	//  System.out.println("your password: "+password);
	  
	  //combine element to generate an email
	  
	  email = firstName.toLowerCase() + "." + LastName.toLowerCase() + "@" + department +"." + companySuffix;
	 // System.out.println("your Email is: " + email);
  }
  
  //ask for the department
  
  private String setDepartment() {
	  System.out.print("New worker:" +firstName+".Department code:\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department code: ");
	  Scanner in = new Scanner(System.in);
	 int depchoice = in.nextInt();
	 if(depchoice == 1) {
		 return "sales";
	 }
	 
	 else if(depchoice == 2) {
		 return "dev";
	 }
	 
	 else if(depchoice == 3) {
		 return "acct";
	 }
	 else {
		return "";	}
  }
  
  //generate a random password
  
  private  String randomPassword(int length) {
	  String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	  char[] password = new char[length];
	  for(int i=0; i<length; i++)
	  {
		int rand = (int)(Math.random()* passwordSet.length());
		password[i] = passwordSet.charAt(rand);
	  }
	  return new String(password);
  }
  
  //set the mailbox capacity 
  
  public void setMailboxCapacity(int capacity) {
	  this.mailboxCapacity = capacity;
  }
  
  // set the alternate email
  
  public void setAlternativeEmail(String alEmail) {
	  this.alternateEmail = alEmail;
  }
  
  //changet the password 
  
  public void changePassword(String password) {
	  this.password = password;
  }
  
  public int getMailboxCapacity(){
	  return mailboxCapacity;
  }
  
  public String getAlternativeEmail() {
	  return alternateEmail;
  }
  
  public String getPassword() {
	  return password;
  }
  
  public String showInfo() {
	  return "Display NAme: " + firstName +" "+LastName +
			  "\nCompany Email: "+email +
			  "\nMailbox Capacity: "+mailboxCapacity + "mb";
  }
  
   
   
}
