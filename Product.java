public class Product extends Memory{

	// Product Class's Attributes
	private int price;
	private String idProduct;
	
	// Class's constructor
	public Product(int frequency, int memorySize, String supportsCuda, int price, String idProduct){
		// Using Memory as a super, setting Product class as a subclass of it
		super(frequency, memorySize, supportsCuda);
		this.price = price;
		this.idProduct = idProduct;
	}
	
	// Set and Get methods for each attribute
	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return this.price;
	}

	public void setIdProduct(String idProduct){
		this.idProduct = idProduct;
	}

	public String getIdProduct(){
		return this.idProduct;
	}

}
