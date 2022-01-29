import java.util.Scanner;
public class tempConverter {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Choose the type of Currency you would to convert:\n ");
		System.out.println("1. CAD to USD ");
		System.out.println("2. USD to CAD");
		int currency = myObj.nextInt();
		
		if(currency == 1) {
			Scanner myObj2 = new Scanner(System.in);
			System.out.println("Enter CAD value:\n");
			double a = myObj2.nextInt();
			double b = a*0.78;
			System.out.println("CAD to USD: " + b);
		}else if(currency == 2) {
			Scanner myObj3 = new Scanner(System.in);
			System.out.println("Enter USD value:\n");
			double a = myObj3.nextInt();
			double b = a*1.29;
			System.out.println("USD to CAD: " + b);
		}else {
			System.out.println("Choose a valid option");
		}
		

	}

}
