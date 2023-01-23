package InvoicingSystem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Invoice implements Serializable {

	
	private int invoiceDate;
	private int numberOfItem;
	private double totalAmount;
	private double paidAmount;
	private double balance;
	

	public static void main(String[] args) {
		
		public int getInvoiceDate() {
			return invoiceDate;
		}


		public void setInvoiceDate(int invoiceDate) {
			this.invoiceDate = invoiceDate;
		}


		public int getNumberOfItem() {
			return numberOfItem;
		}


		public void setNumberOfItem(int numberOfItem) {
			this.numberOfItem = numberOfItem;
		}


		public double getTotalAmount() {
			return totalAmount;
		}


		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}


		public double getPaidAmount() {
			return paidAmount;
		}


		public void setPaidAmount(double paidAmount) {
			this.paidAmount = paidAmount;
		}


		public double getBalance() {
			return balance;
		}


		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		
		
		
		
		
		
//		Invoice invoice = new Invoice();
//        
//		
//		Scanner scan = new Scanner(System.in);
//        
//		System.out.println("Enter Invoice Date");
//        invoice.invoiceDate = scan.nextInt();
//        
//        System.out.println("Enter Number Of Item");
//        invoice.numberOfItem = scan.nextInt();
//        
//        System.out.println("Enter Total Amoun");
//        invoice.totalAmount = scan.nextDouble();
//        
//        System.out.println("Enter Paid Amount");
//        invoice.paidAmount = scan.nextDouble();
//        
//        System.out.println("Enter Balance");
//        invoice.balance = scan.nextDouble();
//        
//        try{
//            FileOutputStream file = new FileOutputStream("invoice.txt");
//            ObjectOutputStream out = new ObjectOutputStream(file);
//            out.writeObject(invoice);
//            out.close();
//            file.close();
//            
//            System.out.println("Serialized and saved");
//            
//        	}catch (Exception e){
//        		e.printStackTrace();
//        }
        
	}

}
