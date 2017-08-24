package billingSystem;
import java.util.*;

public class PrintReceipt {
	
	public void printReceipt(HashMap pricingDetails,HashMap purchaseDetails) 
	{
		 System.out.println("Fruit\t\tQuantity\tAmount");
		 Set<String> unitPricing = pricingDetails.keySet();
		 Set<String> purchaseDtls = purchaseDetails.keySet();
		 float billAmt;
		 float unitPrice;
		 float purchasedQuantity;
		 float totalCost = 0;
	      for(String key:unitPricing) {
	    	 unitPrice = Float.parseFloat(pricingDetails.get(key).toString());
	    	 purchasedQuantity = Float.parseFloat(purchaseDetails.get(key).toString());
	    	 billAmt = unitPrice *purchasedQuantity;
    		 System.out.println(key + "\t\t" + purchasedQuantity + "\t\t" + billAmt);
	         totalCost += billAmt;
	      }
	    System.out.println("\n\t\tTotal \t\t" + totalCost);
	}
	

}
