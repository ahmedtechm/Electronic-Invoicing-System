package InvoicingSystem;

public class Shop {
	
	private	String shopName;
	private int telephone; 
	private	String fax;
	private	String email;
	private	String webSite;
	
	
	
	
	public String getName() {
		return shopName;
	}
	public void setName(String name) {
		this.shopName = name;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		webSite = webSite;
	}
	
	
	Item item = new Item();

	 

}
