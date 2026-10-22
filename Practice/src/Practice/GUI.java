package Practice;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class GUI extends JFrame{
	
	public GUI() {
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setTitle("Practice GUI");
		
		var pane = new JDesktopPane();
		pane.add(new Internal());
		
		add(pane);
	}
}