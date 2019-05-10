public class CurrentUser {
	
	private String user_name;
	public String current_page_ID = "login";
	private boolean logged_in = false;
	
	public CurrentUser( String name ) {
		user_name = name;
	}
	
	public void log_in() {
		logged_in = true;
	}
	
	public void log_out() {
		logged_in = false;
	}
	
	public boolean is_logged_in() {
		return logged_in;
	}
	
	public void set_current_page( String page_id ) {
		current_page_ID = page_id;
	}
	
	public String get_current_page_ID() {
		return current_page_ID;
	}

}
