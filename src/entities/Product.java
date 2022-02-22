package entities;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	// Modo 02 - Reference Method com Metodo Estatico
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	// Modo 03 - Reference Method com Metodo N�o Estatico
	public  String noStaticUpperCaseName() {
		return name.toUpperCase();
	}
}
