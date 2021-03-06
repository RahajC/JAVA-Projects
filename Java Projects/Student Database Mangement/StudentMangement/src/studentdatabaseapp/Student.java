package studentdatabaseapp;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor: prompts user to enter student's name and year 
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - for Sophmore\n3 - Junior\n4 - Senior\nEnter Student Class Level: ");
		this.gradeYear = in.nextInt();
		System.out.println(firstName + " " + lastName + " " + gradeYear);
		
		setStudentID();
	}
	
	//Generate ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
	  do {
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner in  = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else { 
			break; 
			}
	  } while (1 != 0);
	}
	
	//View balance and pay tuition
	
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	//Show status 
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nGrade Level: " +"\nStudent ID: " + studentID  + gradeYear + "\nCourses Enrolled:" + courses + "\nBalance: $" + tuitionBalance;
	}

}
