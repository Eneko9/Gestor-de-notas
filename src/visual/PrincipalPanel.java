package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrincipalPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public PrincipalPanel() {
		// frame configuration
		this.setTitle("Grade Gestor -- by Eneko");
		this.setBounds(440, 160, 485, 430);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// adding elements to the frame
		JPanel panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
		
		
		
		
		this.setVisible(true);
	}

}
