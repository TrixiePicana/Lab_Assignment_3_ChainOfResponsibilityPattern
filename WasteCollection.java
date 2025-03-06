package labassignment3_ChainofResponsibilityPattern;

public class WasteCollection //Client and Context Class
{
    public static void main(String[] args) 
    {
        WasteHandler organicHandler = new OrganicWasteContainer(); //1st handler
        WasteHandler recyclableHandler = new RecyclableWasteContainer();
        WasteHandler hazardousHandler = new HazardousWasteConatiner();

        organicHandler.setNextContainer(recyclableHandler);
        recyclableHandler.setNextContainer(hazardousHandler);

        // Create waste containers
        WasteContainer organicContainer = new WasteContainer("organic", 50);
        WasteContainer recyclableContainer = new WasteContainer("recyclable", 30);
        WasteContainer hazardousContainer = new WasteContainer("hazardous", 20);

        // Add waste to containers
        organicContainer.addWaste(50);
        recyclableContainer.addWaste(30);
        hazardousContainer.addWaste(20);

        // Trigger waste collection
        if (organicContainer.isFull() ) 
        {
            organicHandler.handleWaste(organicContainer);
        }
        if (recyclableContainer.isFull() ) 
        {
            organicHandler.handleWaste(recyclableContainer);
        }
        if (hazardousContainer.isFull() ) 
        {
            organicHandler.handleWaste(hazardousContainer);
        }
    }
}