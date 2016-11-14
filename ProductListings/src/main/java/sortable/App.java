package sortable;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
	private final static String listingsPath = "resources/listings.txt";//TODO move to a properties file
	private final static String productsPath = "resources/products.txt"; // TOOD move to a properties fiel.
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException
    {
    	HashMap<String, ListingBo> listings = new HashMap<String , ListingBo>();
    	HashMap<String, ProductBo> products = new HashMap<String, ProductBo>();
    	ObjectMapper mapper = new ObjectMapper();
    	Scanner sc = new Scanner(new File(productsPath));
    	HashMap<String, Integer> prodFamilies = new HashMap<String, Integer>();
    	HashMap<String, Integer> prodManus = new HashMap<String, Integer>();
    	while(sc.hasNextLine()){
    		ProductBo temp = mapper.readValue(sc.nextLine(),ProductBo.class);
    		products.put(temp.getProduct_name(), temp);
    		if(prodManus.containsKey(temp.getManufacturer()))
    			prodManus.put(temp.getManufacturer(), prodManus.get(temp.getManufacturer()) + 1);
    			
    		else
    			prodManus.put(temp.getManufacturer(), 1);
    		
    		
    		if(prodFamilies.containsKey(temp.getFamily()))
    			prodFamilies.put(temp.getFamily(), prodManus.get(temp.getManufacturer()) + 1);
    		else
    			prodFamilies.put(temp.getFamily(), 1);
    		
    		
    	}
    	sc.close();
    	sc = new Scanner(new File(listingsPath));
    	while(sc.hasNextLine()){
    		ListingBo temp = mapper.readValue(sc.nextLine(), ListingBo.class);
    		listings.put(temp.getTitle(), temp);
    	}
    	sc.close();
    	//Now accessible in constant time. So so far the it takes n + m time. 20000 = m and 700 = n right now...

    	for(String prod : prodManus.keySet() ){
    		System.out.println("Name : " + prod + " Count: " + prodManus.get(prod));
    	}
    	for(String prod : prodFamilies.keySet() ){
    		System.out.println("Name : " + prod + " Count: " + prodFamilies.get(prod));
    	}
    	
    	
    	//Now going to have to classify them.
    	
        		
    }
}
