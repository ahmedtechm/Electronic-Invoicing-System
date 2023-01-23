package InvoicingSystem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Invoice implements Serializable {
	
	int invoiceDate;
	int numberOfItem;
	double totalAmount;
	double paidAmount;
	double balance;
	

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice();
        
		
		Scanner scan = new Scanner(System.in);
        
		System.out.println("Enter Invoice Date");
        invoice.invoiceDate = scan.nextInt();
        
        System.out.println("Enter Number Of Item");
        invoice.numberOfItem = scan.nextInt();
        
        System.out.println("Enter Total Amoun");
        invoice.totalAmount = scan.nextDouble();
        
        System.out.println("Enter Paid Amount");
        invoice.paidAmount = scan.nextDouble();
        
        System.out.println("Enter Balance");
        invoice.balance = scan.nextDouble();
        
        try{
            FileOutputStream file = new FileOutputStream("invoice.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(invoice);
            out.close();
            file.close();
            
            System.out.println("Serialized and saved");
            
        	}catch (Exception e){
        		e.printStackTrace();
        }
        
	}

}
