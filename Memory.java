public class Memory{
	
	// Memory Class's Attributes
	private int frequency;
	private int memorySize;
	private String supportsCuda;

	// Class's constructor
	public Memory(int frequency, int memorySize, String supportsCuda){
		this.frequency = frequency;
		this.memorySize = memorySize;
		this.supportsCuda = supportsCuda;
	}
	
	// Set and Get methods for each Attribute
	public void setFrequency(int frequency){
		this.frequency = frequency;
	}

	public int getFrequency(){
		return this.frequency;
	}

	public void setMemorySize(int memorySize){
		this.memorySize = memorySize;
	}

	public int getMemorySize(){
		return this.memorySize;
	}

	public void setSupportCuda(String supportsCuda){
		this.supportsCuda = supportsCuda;
	}

	public String getSupportCuda(){
		return this.supportsCuda;
	}

}
