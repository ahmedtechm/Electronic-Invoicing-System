package InvoicingSystem;

import java.util.Scanner;

public class ShopMainClass {

	public static void main(String[] args) {
		
	//	Item item = new Item();
	//	Invoice invoice= new Invoice();

		Scanner scanner = new Scanner(System.in);
        
		boolean exit = false;
        while (!exit) {
            System.out.println("1- Shop Settings");
            System.out.println("2- Manage Shop Items");
            System.out.println("3- Create New Invoice");
            System.out.println("4- Report: Statistics");
            System.out.println("5- Report: All Invoices");
            System.out.println("6- Search (1) Invoice");
            System.out.println("7- Program Statistics");
            System.out.println("8- Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                  
                    break;
                case 3:
                   
                    break;
                case 4:
                    
                    break;
                case 5:
                   
                    break;
                case 6:
                  
                    break;
                case 7:
                 
                    break;
                case 8:
                    System.out.print("Are you sure you want to exit? (yes/no): ");
                    String confirm = scanner.next();
                    if (confirm.equalsIgnoreCase("yes")) {
                        exit = true;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid number.");
            }
        }
    }
}





