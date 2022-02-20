import java.util.*;

// The main class to run the program
public class Main{
	public static void main(String[] args){
			// Attributes' value are hard-coded to keep the program simple, and more focused on playing with inheritance
			Hardware gpu1 = new Hardware(1506, 6144, "yes", 210, "PC10353060", "Zotac", "Nvidia GTX 1060 OC");
			
			// Print out functions for outputs 
			System.out.println("Brand            : " + gpu1.getBrand());
			System.out.println("Model            : " + gpu1.getModel());
			System.out.println("Price            : " + gpu1.getPrice() + " USD MSRP");
			System.out.println("Product ID       : " + gpu1.getIdProduct());
			System.out.println("Memory Frequency : " + gpu1.getFrequency() + " Mhz");
			System.out.println("Memory Size      : " + gpu1.getMemorySize() + " MB");
			System.out.println("Support Cuda     : " + gpu1.getSupportCuda());


			
	}
}
