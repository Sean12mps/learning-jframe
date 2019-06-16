import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Month;
import java.time.Year;
import javax.swing.*;

import net.miginfocom.layout.Grid;

public class RegisterForm extends Page{

	public String 
	window_title = "Cadbully Shop - Register Form";
	
	int 
	window_width = 800,
	window_height = 600;
	
	JPanel
	section_head = new JPanel(new FlowLayout()),
	section_content = new JPanel(new GridLayout(4,2)),
	section_content1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 6, 12)),
	section_footer = new JPanel(new FlowLayout()),
	field_group_name = new JPanel(new FlowLayout()),
	field_group_email = new JPanel(new FlowLayout()),
	field_group_pass = new JPanel(new FlowLayout()),
	field_group_confPass = new JPanel(new FlowLayout()),
	field_group_gender = new JPanel(new FlowLayout()),
	field_group_birthday = new JPanel(new FlowLayout()),
	field_group_termsCond = new JPanel(new FlowLayout());
	
	JLabel
	label_createAcount = new JLabel("CREATE ACCOUNT"),
	label_name = new JLabel("Name"),
	label_email = new JLabel("Email"),
	label_password = new JLabel("Password"),
	label_confPass = new JLabel("Confirm Password"),
	label_gender = new JLabel("Gender"),
	label_birthday = new JLabel("Birthday"),
	label_termsCond = new JLabel("Terms and Condition");
	
	JTextField
	field_name = new JTextField(),
	field_email = new JTextField();
	
	JPasswordField
	field_pass = new JPasswordField(),
	field_confpass = new JPasswordField();
	
	JRadioButton
	radioButton_male = new JRadioButton(),
	radioButton_Female = new JRadioButton();
	
	JComboBox<Integer> comBox_day = new JComboBox<Integer>();
	JComboBox<Integer> comBox_month = new JComboBox<Integer>();
	JComboBox<Integer> comBox_year = new JComboBox<Integer>();
	
	JButton
	button_back = new JButton("Back"),
	button_submit = new JButton("Submit");
	
	public RegisterForm() {
		
	}
	
	public void setupFrame() {
		
		frame = new JFrame(window_title);
		frame.setSize(window_width,window_height);
		frame.setLocationRelativeTo( null );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(3,1) );
	}
	
	public void setupFont() {
		
		label_createAcount.setFont( new Font( "Segoe UI", Font.BOLD,45) );
		label_name.setFont( new Font( "Segoe UI", Font.BOLD,20) );
		label_email.setFont( new Font( "Segoe UI", Font.BOLD,20) );
		label_password.setFont( new Font( "Segoe UI", Font.BOLD,20) );
		label_confPass.setFont( new Font( "Segoe UI", Font.BOLD,20) );
		label_gender.setFont( new Font( "Segoe UI", Font.BOLD,20) );
		label_birthday.setFont( new Font( "Segoe UI", Font.BOLD,20) );
		label_termsCond.setFont( new Font( "Segoe UI", Font.BOLD,20) );
		
	}
	
	public void setupColors() {
		
		section_head.setBackground( Color.decode("#BFDCDE") );
		section_content.setBackground( Color.decode("#BFDCDE") );
		section_content1.setBackground( Color.decode("#BFDCDE") );
		section_footer.setBackground( Color.decode("#BFDCDE") );
		
	}
	
	public void setupComponents() {
		
		section_head.add( label_createAcount );
		
		label_name.setPreferredSize( new Dimension ( 120, 24 ) );
		field_name.setPreferredSize( new Dimension ( 120, 24 ) );
		label_email.setPreferredSize( new Dimension ( 120, 24 ) );
		field_email.setPreferredSize( new Dimension ( 120, 24 ) );
		label_password.setPreferredSize( new Dimension ( 120, 24 ) );
		field_pass.setPreferredSize( new Dimension ( 120, 24 ) );
		label_confPass.setPreferredSize( new Dimension ( 120, 24 ) );
		label_gender.setPreferredSize( new Dimension ( 120, 24 ) );
		label_birthday.setPreferredSize( new Dimension ( 120, 24 ) );
		label_termsCond.setPreferredSize( new Dimension ( 120, 24 ) );
		
		field_group_name.add( label_name );
		field_group_email.add( label_email );
		field_group_pass.add( label_password );
		field_group_confPass.add( label_confPass );
		field_group_gender.add( label_gender );
		field_group_birthday.add( label_birthday );
		field_group_termsCond.add( label_termsCond );
		
		section_content.add( field_group_name );
		section_content.add( field_group_email );
		section_content.add( field_group_pass );
		section_content.add( field_group_confPass );
		
		section_content1.add( field_group_gender );
		section_content1.add( field_group_birthday );
		section_content1.add( field_group_termsCond );
		
		section_content.add( section_content1 );
		
		section_footer.add( button_back );
		section_footer.add( button_submit );
		
		frame.add( section_head );
		frame.add( section_content );
		frame.add( section_footer );
		
	}
	
	public void setupListeners() {
		
		button_back.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				user_go_to( "login" );
				
			}

		} );
		
	 }
	
}