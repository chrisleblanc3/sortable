package sortable;
import java.util.Date;

public class ProductBo {
	

	private String product_name;
	private String manufacturer; //Could change this to an Enum?? TODO
	private String model;
	private String family; // Could possibly change this to an Enum? TODO
	private Date announced_date;

	public Date getAnnounced_date() {
		return announced_date;
	}


	public void setAnnounced_date(Date announced_date) {
		this.announced_date = announced_date;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getFamily() {
		return family;
	}


	public void setFamily(String family) {
		this.family = family;
	}




	
	public String toString(){
		return this.product_name + "   " + this.manufacturer + "   " + this.model + "  " + this.family + "  " + this.announced_date;
	}
	
}
