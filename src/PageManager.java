import java.util.ArrayList;

public class PageManager {

	ArrayList<String> pageIds = new ArrayList<String>();
	ArrayList<Page> pageWindows = new ArrayList<Page>();
	public String current_page_ID;
	public CurrentUser current_user;
	
	public PageManager() {
		addPage( "login", new PageLogin() );
		addPage( "mainForm", new PageMainForm() );
	}
	
	public Page getPage( String pageID ) {
		int index = pageIds.indexOf( pageID ); 
		return (Page) pageWindows.get( index );
	}
	
	public void addPage( String pageID, Page page ) {
		pageIds.add( pageID );
		pageWindows.add( page );
	}
	
	public void reload() {
		Page previous_page = getPage( current_page_ID );
		previous_page.hide();
		
		Page current_page = getPage( current_user.get_current_page_ID() );
		current_page_ID = current_user.get_current_page_ID();
		current_page.setup( this );
	}
	
	public CurrentUser getUser() {
		return current_user;
	}
	
	public void run( CurrentUser user ) {
		current_user = user;
		current_page_ID = current_user.get_current_page_ID();
		reload();
	}

}
