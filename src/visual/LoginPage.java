package visual;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import CFont.CustomFont;

public class LoginPage extends JFrame{

	static CustomFont cf = new CustomFont();
	
	private static final long serialVersionUID = 1L;

	public LoginPage() {
		frameConfiguration(this);
		initComponents(this);
		
		this.setVisible(true);
	}
	public static void frameConfiguration(LoginPage lp) {
		lp.setTitle("Grade Gestor -- Login page");
		lp.setBounds(490, 210, 385, 330);
		lp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void initComponents(LoginPage lp) {
		lp.setLayout(null);
		
		JLabel loginIcon = new JLabel(new ImageIcon("src/images/examen.png"));
		loginIcon.setBounds(135, 20, 70, 70);
		lp.add(loginIcon);
		
		JLabel loginLabel = new JLabel("Grade      Gestor");
		loginLabel.setBounds(75, 20, 270, 70);
		loginLabel.setFont(cf.MyFont(1, 24));
		lp.add(loginLabel);
		
		JLabel authorLabel = new JLabel("By Eneko Eguiguren");
		authorLabel.setBounds(115, 40, 270, 70);
		lp.add(authorLabel);
		
		
		JTextField usernameTxt = new JTextField(30);
		usernameTxt.setBounds(150, 100, 150, 30);
		lp.add(usernameTxt);
		
		JPasswordField passwordTxt = new JPasswordField(30);
		passwordTxt.setBounds(150, 160, 150, 30);
		lp.add(passwordTxt);
		
		JLabel usernameLabel = new JLabel("Username: ");
		usernameLabel.setBounds(50, 100, 150, 30);
		lp.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(50, 160, 150, 30);
		lp.add(passwordLabel);
		
		JButton login = new JButton("Log In");
		login.setBounds(130, 225, 100, 30);
		lp.add(login);
	}
	
}
