import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Month;
import java.time.Year;
import javax.swing.*;

public class RegisterForm extends Page{
	
	public String 
	window_title = "Cadbully Shop - Register Form";
	
	int 
	window_width = 800,
	window_height = 600;
	
	JPanel
	section_head = new JPanel(new FlowLayout()),
	section_content = new JPanel(new GridLayout( 7,2 )),
	section_footer = new JPanel(new FlowLayout());
	
	JLabel
	label_title = new JLabel("CREATE ACCOUNT"),
	label_name = new JLabel("Name"),
	label_email = new JLabel("Email"),
	label_password = new JLabel("Password"),
	label_confirm_pass = new JLabel("Confirm Password"),
	label_gender = new JLabel("Gender"),
	label_birthday = new JLabel("Birthday"),
	label_terms_and_cond = new JLabel("Terms and Condition");
	
	JButton
	button_back = new JButton("Back"),
	button_submit = new JButton("Submit");
	
	JTextField
	field_name = new JTextField(),
	field_email = new JTextField();
	
	JPasswordField
	field_password = new JPasswordField(),
	field_confirm_pass = new JPasswordField();
	
	JRadioButton
	radio_button_male = new JRadioButton("Male"),
	radio_button_female = new JRadioButton("Female");
	
	JComboBox < Month > combo_month = new JComboBox < Month > ();
	JComboBox < Year > combo_year = new JComboBox < Year > ();
	
	public RegisterForm() {
		
	}
	
	public void setupFrame() {
		frame = new JFrame( window_title );
		frame.setSize( window_width, window_height );
		frame.setLocationRelativeTo( null );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout( new GridLayout( 9,2 ) );
	}
	
	public void setupFonts() {
		label_title.setFont( new Font( "Courier", Font.BOLD, 45) );
		label_name.setFont( new Font( "Courier", Font.BOLD, 20) );
		label_email.setFont( new Font( "Courier", Font.BOLD, 20) );
		label_password.setFont( new Font( "Courier", Font.BOLD, 20) );
		label_confirm_pass.setFont( new Font( "Courier", Font.BOLD, 20 ) );
		label_gender.setFont( new Font( "Courier", Font.BOLD, 20 ) );
		label_birthday.setFont( new Font( "Courier", Font.BOLD, 20 ) );
		label_terms_and_cond.setFont( new Font( "Courier", Font.ITALIC, 20) );
	}
	
	public void setupColor() {
		section_head.setBackground( Color.decode("#BFDCDE") );
		section_content.setBackground( Color.decode("#BFDCDE") );
		section_footer.setBackground( Color.decode("#BFDCDE") );
	}
	
	public void setupComponents() {
		
		section_head.add( label_title );
		
		label_name.setPreferredSize( new Dimension (120, 24) );
		label_email.setPreferredSize( new Dimension (120, 24) );
		label_password.setPreferredSize( new Dimension (120, 24) );
		label_confirm_pass.setPreferredSize( new Dimension (120, 24) );
		label_gender.setPreferredSize( new Dimension (120, 24) );
		label_birthday.setPreferredSize( new Dimension (120, 24) );
		label_terms_and_cond.setPreferredSize( new Dimension (120, 24) );
		
		section_content.add( new JLabel() );
		
		section_content.add( label_title );
		section_content.add( label_name );
		section_content.add( label_email );
		section_content.add( label_password );
		section_content.add( label_confirm_pass );
		section_content.add( label_gender );
		section_content.add( label_birthday );
		section_content.add( label_terms_and_cond );
		
		section_content.add( field_name );
		section_content.add( field_email );
		section_content.add( field_password );
		section_content.add( field_confirm_pass );
		
		section_content.add( radio_button_male );
		section_content.add( radio_button_female );
		
		section_content.add( combo_month );
		section_content.add( combo_year );
		
		section_content.add( button_back );
		section_content.add( button_submit );
		
		frame.add( section_head );
		frame.add( section_content );
		frame.add( section_footer );
		
	}
	
	public void setupListeners() {
		
		button_submit.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		button_back.addActionListener( new ActionListener () {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
