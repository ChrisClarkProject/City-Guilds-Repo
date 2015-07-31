package trialAndTestPackage;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;

public class TrialAndTestPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TrialAndTestPanel() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton button = new JButton("New button");
		add(button);

	}
}
