import java.util.ArrayList;

public class PageManager {

	ArrayList<String> pageIds = new ArrayList<String>();
	ArrayList<Object> pageWindows = new ArrayList<Object>();
	
	public PageManager() {
		addPage( "login", new PageLogin() );
	}
	
	public Page getPage( String pageID ) {
		int index = pageIds.indexOf( pageID ); 
		return (Page) pageWindows.get( index );
	}
	
	public void addPage( String pageID, Object page ) {
		pageIds.add( pageID );
		pageWindows.add( page );
	}
	
	public void showPage( String pageID ) {
		Page page = getPage( pageID );
		page.show();
	}

}
