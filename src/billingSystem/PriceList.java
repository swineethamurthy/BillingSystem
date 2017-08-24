package billingSystem;
import java.util.*;


public class PriceList {
	
	HashMap<String,Float> priceMap = new HashMap<String,Float>();
	public void addItemPrice(String item,Float unitPrice) 
	{
		priceMap.put(item, unitPrice);
	}
	
	public HashMap getPriceMap()
	{
		return priceMap;
	}


}
