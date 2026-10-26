package Finals;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GUI extends JFrame {

	private JComboBox<String> role;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JCheckBox showPassword;
	private JButton btnLogin, btnCreate;

	public GUI() {

		setSize(300, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Login");

		Border emptyBorder = BorderFactory.createEmptyBorder(10,20,10,20);
		
		role = new JComboBox<>(new String[] { "Admin", "Staff" });

		usernameField = new JTextField(10);
		passwordField = new JPasswordField(10);
		showPassword = new JCheckBox("Show Password");
		btnLogin = new JButton("Login");
		btnCreate = new JButton("Create Account");

		JPanel informationPanel = new JPanel(new GridBagLayout());
		informationPanel.setBorder(emptyBorder);
		informationPanel.add(new JLabel("Username:"));
		informationPanel.add(usernameField);
		informationPanel.add(new JLabel("Password:"));
		informationPanel.add(passwordField);
		informationPanel.add(showPassword);

		add(new JLabel("Login"), BorderLayout.NORTH);
		add(informationPanel, BorderLayout.CENTER);

		
		showPassword.addActionListener(e -> showPassword());

	}

	private void showPassword() {
		if (showPassword.isSelected())
			passwordField.setEchoChar((char) 0);
		else
			passwordField.setEchoChar('*');
	}

}
