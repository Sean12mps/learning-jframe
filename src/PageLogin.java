import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PageLogin extends Page {
	
	JPanel panel1, panel2, panel3;
	JLabel labelTitle, emailLable, passLabel;
	JTextField emailTextField;
	JPasswordField passTextField;
	JButton login, register;
	
	public PageLogin() {
		
		frame = new JFrame( "Login" );
		
		frame.setTitle("Cadbully Shop");
		
		frame.setSize(360,260);
		
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		frame.getContentPane().setLayout( new GridLayout(3,1));
		
		panel1 = new JPanel(new FlowLayout());
		labelTitle = new JLabel("Sign In");
		labelTitle.setFont(new Font("Sans Serif", Font.BOLD, 25));
		
		panel1.setBackground(Color.BLUE);
		panel1.add(labelTitle);
		
		panel2 = new JPanel(new GridLayout(2,2));
		emailLable = new JLabel("Email");
		
		panel2.add(emailLable);
		panel2.setBackground(Color.RED);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("arial", Font.ITALIC,25));;
		
		panel2.add(emailTextField);
		
		passLabel = new JLabel("Password");
		panel2.add(passLabel);
		
		passTextField = new JPasswordField();
		panel2.add(passTextField);
		
		panel3 = new JPanel(new FlowLayout());
		register = new JButton("Register");
		panel3.add(register);
		panel3.setBackground(Color.CYAN);
		
		login = new JButton("Login");
		panel3.add(login);
		
		login.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
//				dispose();
				String userName = emailTextField.getText();
				char[] userPass = passTextField.getPassword();
				boolean valid = false;
				
				if (!userName.isEmpty()) {
					valid = true;
				}
				
				if (userPass.length != 0) {
					valid = true;
				}
				
		
				}

		});
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
	}
}
