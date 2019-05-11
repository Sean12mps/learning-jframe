import java.util.ArrayList;

public class PageManager {

	public ArrayList<String> pageIds = new ArrayList<String>();
	
	public ArrayList<Page> pageWindows = new ArrayList<Page>();
	
	public Session currentSession;

	public PageManager() {
		addPage( "login", new PageLogin() );
		addPage( "mainForm", new PageMainForm() );
	}
	
	public void addPage( String pageID, Page page ) {
		pageIds.add( pageID );
		pageWindows.add( page );
	}
	
	public Page getPage( String pageID ) {
		int index = pageIds.indexOf( pageID ); 
		return (Page) pageWindows.get( index );
	}
	
	public void reload() {
		Page previous_page = getPage(currentSession.getPreviousPage());
		previous_page.hide();
		
		Page current_page = getPage(currentSession.getCurrentPage());
		current_page.setup( this );
		
		current_page.show();
	}
	
	public void run() {
		reload();
	}
	
	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

}
