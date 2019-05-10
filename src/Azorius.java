public class Azorius {

	static PageManager window_pages = new PageManager();
	static CurrentUser user = new CurrentUser( "" );

	public static void main(String[] args) {
		window_pages.run( user );
	}

}
