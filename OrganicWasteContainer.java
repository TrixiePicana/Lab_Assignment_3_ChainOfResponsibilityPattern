package labassignment3_ChainofResponsibilityPattern;

public class OrganicWasteContainer implements WasteHandler	//handler class
{
	private WasteHandler nextcontainer;

    @Override
    public void setNextContainer(WasteHandler nextcontainer) 
    {
        this.nextcontainer = nextcontainer;
    }

    @Override
    public void handleWaste(WasteContainer container) 
    {
        if (container.getType().equals("organic") ) 
        {
        	System.out.println("Handling organic waste disposal."); //handle organic waste disposal
        } 
        
        else if (nextcontainer != null) 
        {
        	nextcontainer.handleWaste(container);
        }
    }
}
