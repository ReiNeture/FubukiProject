package ako.main.info;

public class ProductsInfo {
	
	String name;
	String info;
	int price;
	
	public ProductsInfo(String name, String info, int price) {
		this.name = name;
		this.info = info;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getInfo() {
		return info;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
