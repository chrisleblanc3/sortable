package sortable;

import java.util.ArrayList;

public class ResultBo {

	private String product_name;
	private ArrayList<ListingBo> listings;
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public ArrayList<ListingBo> getListings() {
		return listings;
	}
	public void setListings(ArrayList<ListingBo> listings) {
		this.listings = listings;
	}
	
}
