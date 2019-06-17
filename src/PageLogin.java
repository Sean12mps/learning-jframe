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
	section_content = new JPanel(new GridLayout(2,1)),
	section_footer = new JPanel(new FlowLayout()),
	field_group_email = new JPanel(new FlowLayout()),
	field_group_password = new JPanel(new FlowLayout());
	
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
		label_title.setFont( new Font( "Courier", Font.BOLD, 45 ) );
		label_email.setFont( new Font( "Courier", Font.BOLD,20 ) );
		label_password.setFont( new Font( "Courier", Font.BOLD,20 ) );
	}
	
	public void setupColors() {
		section_head.setBackground( Color.decode("#BFDCDE") );
		section_content.setBackground( Color.decode("#BFDCDE") );
		section_footer.setBackground( Color.decode("#BFDCDE") );
		field_group_email.setBackground( Color.decode("#BFDCDE") );
		field_group_password.setBackground( Color.decode("#BFDCDE") );
	}
	
	public void setupComponents() {

		section_head.add( label_title );

		label_email.setPreferredSize( new Dimension ( 120, 24 ) );
		field_email.setPreferredSize( new Dimension ( 120, 24 ) );
		label_password.setPreferredSize( new Dimension ( 120, 24 ) );
		field_password.setPreferredSize( new Dimension ( 120, 24 ) );


		field_group_email.add( label_email );
		field_group_email.add( field_email );
		field_group_password.add( label_password );
		field_group_password.add( field_password );
		
		section_content.add( field_group_email );
		section_content.add( field_group_password );
		
//		section_content.add(new JLabel());
//		section_content.add(label_email);
//		section_content.add(field_email);
//		section_content.add(new JLabel());
//		section_content.add(new JLabel());
//		section_content.add(label_password);
//		section_content.add(field_password);

		section_footer.add( button_register );
		section_footer.add(button_login);
		
		frame.add( section_head );
		frame.add( section_content );
		frame.add( section_footer );
		
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

		});
		
		button_register.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					user_go_to( "RegisterForm" );
				
				}
			
		});
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
		String userEmail = field_email.getText();
		char[] userPass = field_password.getPassword();
		
		if ( ! userEmail.isEmpty() && userPass.length != 0 ) {
			valid = true;
		}
		
		return valid;
		
	}
	
}
