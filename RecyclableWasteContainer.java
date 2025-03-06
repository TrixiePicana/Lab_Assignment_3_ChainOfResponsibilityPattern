package labassignment3_ChainofResponsibilityPattern;

public class RecyclableWasteContainer implements WasteHandler	//handler class
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
        if (container.getType().equals("recyclable") ) 
        {
            System.out.println("Handling recyclable waste disposal.");	//handle recyclable waste disposal
        } 
        
        else if (nextcontainer != null) 
        {
        	nextcontainer.handleWaste(container);
        }
    }
}
