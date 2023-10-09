import java.util.*;

public class Menu_Card {

	public static void main(String[] args) {
		
		double total_bill = 0;
		int choice;
		int quantity;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("*************************");
			System.out.println("Enter 1 for Idli");
			System.out.println("Enter 2 for Misal pav");
			System.out.println("Enter 3 for Vadapav");
			System.out.println("Enter 4 for Poha");
			System.out.println("Enter 5 fot Dosa");
			System.out.println("Enter 6 for Upma");
			System.out.println("Enter 7 for Kachori");
			System.out.println("Enter 8 for Samosa");
			System.out.println("Enter 9 for Uthappa");
			System.out.println("Enter 10 for Puri Bhaji");
			System.out.println("Enter 0 to print bill");
			
			System.out.println("*************************");
			
			System.out.println("Enter your choice");
			
			choice = sc.nextInt();
			
			switch (choice) {
					
			case 1:
				System.out.println("Enter the quantity of Idli plates: ");
				quantity = sc.nextInt();
				total_bill += quantity * 40;
				
						break;
			case 2:
				System.out.println("Enter the quantity of MISAL PAV plates: ");
				quantity = sc.nextInt();
				total_bill += quantity * 70;
				break;
			case 3:
				System.out.println("Enter the quantity of VADAPAV plates: ");
				quantity = sc.nextInt();
				total_bill += quantity * 15;
				break;
			case 4:
				System.out.println("Enter the quantity of POHA plates:");
				quantity = sc.nextInt();
				total_bill += quantity * 30;
				break;
			case 5:
				System.out.println("Enter the quantity of PLATE DOSA plates");
				quantity = sc.nextInt();
				total_bill += quantity * 50;
				break;
			case 6:
				System.out.println("Enter the quantity of UPMA plates: ");
				quantity = sc.nextInt();
				total_bill += quantity * 40;
				break;
			case 7:
				System.out.println("Enter the quantity of KACHORI plates: ");
				quantity = sc.nextInt();
				total_bill += quantity * 15;
				break;
			case 8:
				System.out.println("Enter the quantity of SAMOSA plates: ");
				quantity = sc.nextInt();
				total_bill += quantity * 15;
				break;
			case 9:
				System.out.println("Enter the quantity of PLATE UTHAPPA plates: ");
				quantity = sc.nextInt();
				total_bill += quantity * 50;
				break;
			case 10:
				System.out.println("Enter the quantity of PURI BHAJI plates: ");
				quantity = sc.nextInt();
				total_bill += quantity * 70;
				break;
			
			case 0:
				System.out.println("your total bill is " + total_bill);
				System.out.println("THANK YOU...");
				break;
			default:
				System.out.println("Wrong choice... ");
				break;
				
			}
			
		} while (choice!=0);
		
		
	}

		

	}


