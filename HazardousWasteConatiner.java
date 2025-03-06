package labassignment3_ChainofResponsibilityPattern;

public class HazardousWasteConatiner implements WasteHandler	//handler class
{
	 private WasteHandler nextcontainer;

	    @Override
	    public void setNextContainer(WasteHandler nextHandler) 
	    {
	        this.nextcontainer = nextcontainer;
	    }

	    @Override
	    public void handleWaste(WasteContainer container) 
	    {
	        if (container.getType().equals("hazardous") ) 
	        {
	            System.out.println("Handling hazardous waste disposal.");	// handle hazardous waste disposal
	        } 
	        else if (nextcontainer != null) 
	        {
	        	nextcontainer.handleWaste(container);
	        }
	    }
}
