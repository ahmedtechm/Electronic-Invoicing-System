package InvoicingSystem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Invoice implements Serializable {

	private String customerFullName;
	private int phoneNumber;
	private int invoiceDate;
	private int numberOfItem;
	private float totalAmount;
	private float paidAmount;
	private float balance;
	
	Invoice invoice = new Invoice();

	
	public String getCustomerFullName() {
		return customerFullName;
	}
	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
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
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public float getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	
//	
//		  try{
//		  FileOutputStream file = new FileOutputStream("invoice.txt");
//		  ObjectOutputStream out = new ObjectOutputStream(file);
//		  out.writeObject(invoice);
//		  out.close();
//		  file.close();
//		  
//		  System.out.println("Serialized and saved");
//		  
//			}catch (Exception e){
//				e.printStackTrace();
//		}
//	

	
}
