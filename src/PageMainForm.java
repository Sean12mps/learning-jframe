import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PageMainForm extends Page {
	
	String
	window_title = "Cadbully Shop - Main Form";
	 
	int 
	window_width = 800,
	window_height = 600; 
	
	JPanel
	section_head = new JPanel(new FlowLayout()),
	section_content = new JPanel(new FlowLayout()),
	section_footer = new JPanel(new FlowLayout());
	
	JLabel 
	label_title = new JLabel( "Ini admin" ),
	label_email = new JLabel( "Email" ),
	label_password = new JLabel( "Password" );
	
	JButton 
	button_logout = new JButton( "Log Out" ),
	button_register = new JButton( "Register" );
	
	JTextField 
	field_email = new JTextField();
	
	JPasswordField 
	field_password = new JPasswordField();
	
	JDesktopPane
	store_desktop_pane = new JDesktopPane();
	
	JMenuBar
	menubar = new JMenuBar();
	
	JMenu
	menu = new JMenu("Store");
	
	JMenuItem
	item_ourproduct = new JMenuItem("Our products"),
	item_Cart = new JMenuItem(),
	item_Hampers = new JMenuItem(),
	item_about = new JMenuItem();
	
	public PageMainForm() {
		setupFrame();
		
		setupFonts();
		
		setupColors();
		
		setupComponents();
		
		setupListeners();
	}
	
	public void setupFrame() {
		frame = new JFrame( window_title );
		frame.setSize( window_width, window_height );
		frame.setLocationRelativeTo( null );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.getContentPane().setLayout( new GridLayout( 3, 1 ) );
	}
	
	public void setupFonts() {
		label_title.setFont( new Font( "Sans Serif", Font.BOLD, 25 ) );
		label_email.setFont( new Font( "arial", Font.ITALIC,25 ) );
	}
	
	public void setupColors() {
		section_head.setBackground( Color.WHITE );
		section_content.setBackground( Color.WHITE );
		section_footer.setBackground( Color.WHITE );
	}
	
	public void setupComponents() {

		section_head.add(label_title);
		section_head.add(button_logout);
		
		frame.add(section_head);
		
	}
	
	public void setupListeners() {
		
		button_logout.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				user_go_to( "login" );
				
			}

		} );
		
	}
	
	public void displayWindowNotice( String type ) {
		
		switch ( type ) {
		
			case "invalid_fields":
				break;

		}
		
	}
	
}
