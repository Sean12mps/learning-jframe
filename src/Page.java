import javax.swing.JFrame;

abstract class Page {

	public JFrame frame;
	public PageManager pageManager;
	public Session currentSession;

	public void setup( PageManager manager ) {
		pageManager = manager;
		currentSession = pageManager.getCurrentSession();
	}

	public void show() {
		frame.setVisible(true);
	}

	public void hide() {
		frame.setVisible(false);
	}

	public JFrame getFrame() {
		 return frame;
	}
	
	public void user_go_to( String page_id ) {
		currentSession.setCurrentPage( page_id );
		pageManager.reload();
	}

	public Session getCurrentSession() {
		return currentSession;
	}

}
