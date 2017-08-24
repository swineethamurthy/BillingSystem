package billingSystem;
import java.util.*;

public class PurchaseDetails {
	
		
		HashMap<String,Float> purchaseQuantityMap = new HashMap<String,Float>();
		public void addPurchaseQuantity(String item,Float purchaseQuantity) 
		{
			purchaseQuantityMap.put(item, purchaseQuantity);
		}
		public HashMap getPurchaseQuantityMap()
		{
			return purchaseQuantityMap;
		}

}
