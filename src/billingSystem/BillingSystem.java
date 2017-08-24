package billingSystem;

public class BillingSystem {
	
	PriceList pricingDetails = new PriceList();
	PurchaseDetails purchaseDetails = new PurchaseDetails();
	PrintReceipt printReceipt = new PrintReceipt();
	
public  static void main(String[] args) {
		BillingSystem billPurchases = new BillingSystem();
		billPurchases.addPricingDetails();
		billPurchases.addPurchaseDetails();
		billPurchases.printReceipt();
		}
	
	public void addPricingDetails() 
	{
		pricingDetails.addItemPrice("Apple", 100f);
		pricingDetails.addItemPrice("Orange", 80f);
		pricingDetails.addItemPrice("Banana",30f);
		pricingDetails.addItemPrice("Kiwi",120f);
	}
	
	public void addPurchaseDetails() 
	{
		purchaseDetails.addPurchaseQuantity("Apple", 2f);
		purchaseDetails.addPurchaseQuantity("Orange", 1.5f);
		purchaseDetails.addPurchaseQuantity("Banana",0.5f);
		purchaseDetails.addPurchaseQuantity("Kiwi",0.75f);
	}
	
	public void printReceipt()
	{
		printReceipt.printReceipt(pricingDetails.getPriceMap(), purchaseDetails.getPurchaseQuantityMap());
	}

}
