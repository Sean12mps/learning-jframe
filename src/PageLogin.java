import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PageLogin extends Page {
	
	public String
	window_title = "Cadbully Shop - Login",
	window_notice__title_invalid_fields = "Form Error!",
	window_notice__invalid_fields = "User name / Password is false.";
	 
	int 
	window_width = 800,
	window_height = 600; 
	
	JPanel
	section_head = new JPanel(new FlowLayout()),
	section_content = new JPanel(new GridLayout(2,2)),
	section_footer = new JPanel(new FlowLayout());
	
	JLabel 
	label_title = new JLabel( "Sign In" ),
	label_email = new JLabel( "Email" ),
	label_password = new JLabel( "Password" );
	
	JButton 
	button_login = new JButton( "Login" ),
	button_register = new JButton( "Register" );
	
	JTextField 
	field_email = new JTextField();
	
	JPasswordField 
	field_password = new JPasswordField();
	
	public PageLogin() {
		
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
		section_head.setBackground( Color.BLUE );
		section_content.setBackground( Color.RED );
		section_footer.setBackground( Color.CYAN );
	}
	
	public void setupComponents() {

		section_head.add(label_title);

		section_content.add(label_email);
		section_content.add(field_email);
		section_content.add(label_password);
		section_content.add(field_password);

		section_footer.add(button_register);
		section_footer.add(button_login);
		
		frame.add(section_head);
		frame.add(section_content);
		frame.add(section_footer);
		
	}
	
	public void setupListeners() {
		
		button_login.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				// Check if fields are filled.
				if ( ! isValidRequiredFields() ) {
					displayWindowNotice( "invalid_fields" );
				} else {
					getCurrentSession().login();
					user_go_to( "mainForm" );
				}
				
			}

		} );
		
	}
	
	public void displayWindowNotice( String type ) {
		
		switch ( type ) {
		
			case "invalid_fields":
				JOptionPane.showMessageDialog( frame, 
					window_notice__invalid_fields, 
					window_notice__title_invalid_fields, 
					JOptionPane.WARNING_MESSAGE
				);
				break;

		}
		
	}
	
	public boolean isValidRequiredFields() {
		
		boolean valid = false;
		String userName = field_email.getText();
		char[] userPass = field_password.getPassword();
		
		if ( ! userName.isEmpty() && userPass.length != 0 ) {
			valid = true;
		}
		
		return valid;
		
	}
	
}
