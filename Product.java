public class Product extends Memory{


	private int price;
	private String idProduct;

	public Product(int frequency, int memorySize, String supportsCuda, int price, String idProduct){
		super(frequency, memorySize, supportsCuda);
		this.price = price;
		this.idProduct = idProduct;
	}

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