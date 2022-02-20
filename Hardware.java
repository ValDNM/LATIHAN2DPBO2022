public class Hardware extends Product{

		// Hardware Class's Attributes
		private String brand;
		private String model;
		
		// Class's constructor
		public Hardware(int frequency, int memorySize, String supportsCuda, int price, String idProduct, String brand, String model){
			// Using Product class as a super in which are the subclass of memory
			super(frequency, memorySize, supportsCuda, price, idProduct);
			this.brand = brand;
			this.model = model;
		}
		
		// Set and Get methods for each Attribute and Inheritance
		public void setBrand(String brand){
			this.brand = brand;
		}

		public String getBrand(){
			return this.brand;
		}

		public void setModel(String model){
			this.model = model;
		}

		public String getModel(){
			return this.model;
		}

}
