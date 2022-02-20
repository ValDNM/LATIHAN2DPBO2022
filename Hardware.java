public class Hardware extends Product{


		private String brand;
		private String model;

		public Hardware(int frequency, int memorySize, String supportsCuda, int price, String idProduct, String brand, String model){
			super(frequency, memorySize, supportsCuda, price, idProduct);
			this.brand = brand;
			this.model = model;
		}

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