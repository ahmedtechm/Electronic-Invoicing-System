package InvoicingSystem;

import java.io.Serializable;



public class Item implements Serializable {
	
	private int itemID;
	private String itemName;
	private double itemPrice;
	private int itemQuantity;
	private double qtyAmountPrice;
	

	//public static void main(String[] args) {
		
		Item item = new Item();
		
		public int getItemID() {
			return itemID;
		}


		public void setItemID(int itemID) {
			this.itemID = itemID;
		}


		public String getItemName() {
			return itemName;
		}


		public void setItemName(String itemName) {
			this.itemName = itemName;
		}


		public double getItemPrice() {
			return itemPrice;
		}


		public void setItemPrice(double itemPrice) {
			this.itemPrice = itemPrice;
		}


		public int getItemQuantity() {
			return itemQuantity;
		}


		public void setItemQuantity(int itemQuantity) {
			this.itemQuantity = itemQuantity;
		}


		public double getQtyAmountPrice() {
			return qtyAmountPrice;
		}


		public void setQtyAmountPrice(double qtyAmountPrice) {
			this.qtyAmountPrice = qtyAmountPrice;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Item item = new Item();
//        
//		
//		Scanner scan = new Scanner(System.in);
//        
//		System.out.println("Enter item ID Number");
//		item.itemID = scan.nextInt();
//        
//        System.out.println("Enter item Name ");
//        item.itemName = scan.nextLine();
//        
//        System.out.println("Enter item Price");
//        item.itemPrice = scan.nextDouble();
//        
//        System.out.println("Enter item Quantity");
//        item.itemQuantity = scan.nextInt();
//        
//        System.out.println("Enter qty Amount Price");
//        item.qtyAmountPrice = scan.nextDouble();
//		
//        
//        try{
//            FileOutputStream file = new FileOutputStream("item.txt");
//            ObjectOutputStream out = new ObjectOutputStream(file);
//            out.writeObject(item);
//            out.close();
//            file.close();
//            
//            System.out.println("Serialized and saved");
//            
//        	}catch (Exception e){
//        		e.printStackTrace();
//        }
	//}
}
