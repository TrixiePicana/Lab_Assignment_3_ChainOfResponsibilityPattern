package labassignment3_ChainofResponsibilityPattern;

public interface WasteHandler 
{
	 void setNextContainer(WasteHandler nextcontainer);
	 void handleWaste(WasteContainer container);
}
