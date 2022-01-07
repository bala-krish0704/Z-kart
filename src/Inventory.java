
public class Inventory {
	private String category;
	private String brand;
	private String model;
	private String price;
	private String stock;

	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}

	public String getband() {
		return brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public String getmodel() {
		return model;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	public String getprice() {
		return price;
	}

	public void setprice(String price) {
		this.price = price;
	}
	public String getstock() {
		return stock;
	}

	public void setstock(String stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Inventory [category=" + category + ", brand=" + brand + ", model=" + model + ", price=" + price + ", stock="+ stock +"]";
	}

	public Inventory(String category, String brand, String model, String price,String stock) {
		super();
		this.category = category;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.stock = stock;
	}

}
