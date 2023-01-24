package InvoicingSystem;

import java.util.Scanner;

public class ShopMainClass {

	public static void main(String[] args) {
		
	//	Item itemobj = new Item();
	//	Invoice invoiceobj= new Invoice();

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
	                    System.out.println("1. Load Data (Items and invoices)");
	                    System.out.println("2. Set Shop Name");
	                    System.out.println("3. Set Invoice Header");
	                    System.out.println("4. Go Back");
	                    System.out.print("Enter your choice: ");
	                    int subChoice = scanner.nextInt();
	                    switch (subChoice) {
	                        case 1:
	                        	 // Load Data (Items and invoices)
	                            System.out.println("Loading data...");
	                            
	                            
	                            
	                            break;
	                           
	                        case 2:
	                            // Set Shop Name
	                            System.out.print("Enter shop name: ");
	                            String shopName = scanner.next();
	                            System.out.println("Shop name saved : " + shopName);
	                            break;
	                        case 3:
	                        	 // Set Invoice Header
	                            System.out.print("Enter new invoice header: ");
	                            Integer telephone = scanner.nextInt();
	                            System.out.print("Enter new invoice header: ");
	                            String fax = scanner.next();
	                            System.out.print("Enter new invoice header: ");
	                            String email = scanner.next();
	                            System.out.print("Enter new invoice header: ");
	                            String webSite = scanner.next();
	                            System.out.println("Invoice header updated to: " + telephone);
	                            System.out.println("Invoice header updated to: " + fax);
	                            System.out.println("Invoice header updated to: " + email);
	                            System.out.println("Invoice header updated to: " + webSite);
	                            break;
	                        case 4:
	                            break;
	                        default:
	                            System.out.println("Invalid choice. Please enter a valid number.");
	                    }
	                    break;
	                case 2:
	                    System.out.println("1. Add Items");
	                    System.out.println("2. Delete Items");
	                    System.out.println("3. Change Item Price");
	                    System.out.println("4. Report All Items");
	                    System.out.println("5. Go Back");
	                    System.out.print("Enter your choice: ");
	                    subChoice = scanner.nextInt();
	                    switch (subChoice) {
	                        case 1:
	                        	// Add Items
	                            System.out.print("Enter item name: ");
	                            String itemName = scanner.next();
	                            System.out.print("Enter item price: ");
	                            float itemPrice = scanner.nextFloat();
	                            System.out.println(itemName + " added to items list with price: " + itemPrice);
	                            break;
	                        case 2:
	                        	 // Delete Items
	                            System.out.print("Enter item name: ");
	                            itemName = scanner.next();
	                            System.out.println(itemName + " has been deleted from the items list.");
	                            break;
	                        case 3:
	                            // Change Item Price
	                            break;
	                        case 4:
	                            // Report All Items
	                            break;
	                        case 5:
	                            break;
	                        default:
	                            System.out.println("Invalid choice. Please enter a valid number.");
	                    }
	                    break;
	                case 3:
	                    // Create New Invoice
	                    break;
	                case 4:
	                    // Report: Statistics
	                    break;
	                case 5:
	                    // Report: All Invoices
	                    break;
	                case 6:
	                    // Search (1) Invoice
	                    break;
	                case 7:
	                    // Program Statistics
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





