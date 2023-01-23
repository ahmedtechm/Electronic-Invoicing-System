package InvoicingSystem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Item implements Serializable {
	
	int itemID;
	String itemName;
	double itemPrice;
	int itemQuantity;
	double qtyAmountPrice;
	

	public static void main(String[] args) {
		
		Item item = new Item();
        
		
		Scanner scan = new Scanner(System.in);
        
		System.out.println("Enter item ID Number");
		item.itemID = scan.nextInt();
        
        System.out.println("Enter item Name ");
        item.itemName = scan.nextLine();
        
        System.out.println("Enter item Price");
        item.itemPrice = scan.nextDouble();
        
        System.out.println("Enter item Quantity");
        item.itemQuantity = scan.nextInt();
        
        System.out.println("Enter qty Amount Price");
        item.qtyAmountPrice = scan.nextDouble();
		
        
        try{
            FileOutputStream file = new FileOutputStream("item.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(item);
            out.close();
            file.close();
            
            System.out.println("Serialized and saved");
            
        	}catch (Exception e){
        		e.printStackTrace();
        }
	}

}
