import javax.swing.JFrame;

abstract class Page {

	public static JFrame frame;

	public void show() {
		frame.setVisible(true);
	}

	public JFrame getFrame() {
		 return frame;
	}

}
