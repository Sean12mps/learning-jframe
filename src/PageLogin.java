import java.awt.FlowLayout;

import javax.swing.JFrame;

public class PageLogin extends Page {
	
	public PageLogin() {
		
		frame = new JFrame( "Login" );
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		frame.getContentPane().setLayout( new FlowLayout() );

		frame.pack();
		
	}

}
