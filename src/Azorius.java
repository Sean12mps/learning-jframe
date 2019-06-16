public class Azorius {
	
	static User currentUser = new User();
	
	static Session currentSession = new Session(currentUser);
	
	static PageManager windowPages = new PageManager();
	

	public static void main(String[] args) {
		
		windowPages.setCurrentSession(currentSession);
		
		windowPages.run();
		
		Connect connect = new Connect();
		
	}

}
