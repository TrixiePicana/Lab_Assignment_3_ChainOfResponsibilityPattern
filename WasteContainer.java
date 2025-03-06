package labassignment3_ChainofResponsibilityPattern;

public class WasteContainer 
{
	 private String type;
	 private int capacity;
	 private int currentLoad;
	 
	 public WasteContainer(String type, int capacity) 
	 {
	        this.type = type;
	        this.capacity = capacity;
	        this.currentLoad = 0;
	 }
	 
	 public String getType()	//Getter method to Retrieve type of waste container
	 {
		 return type;
	 }

	 public int getCapacity()	//Getter method to Retrieve the capacity per Waste Container type
	 {
		 return capacity;
	 }

	 public int getCurrentLoad( )	//Getter method to Retrieve the current load of Conatiner
	 {    
		 return currentLoad;
	 }
	 
	 public void addWaste(int amount) 
	 {
	        if (currentLoad + amount <= capacity) 
	        {
	            currentLoad += amount;
	        } 
	        else 
	        {
	            System.out.println("Container is full!");
	        }
	 }
	 
	 public boolean isFull() 
	 {
	        return currentLoad >= capacity;
	 }
}
