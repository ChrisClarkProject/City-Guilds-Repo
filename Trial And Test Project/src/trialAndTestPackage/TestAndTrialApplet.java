package trialAndTestPackage;

import javax.swing.JApplet;

public class TestAndTrialApplet extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the applet.
	 */
	public TestAndTrialApplet() {
			TrialAndTestPanel panel = new TrialAndTestPanel();
			setContentPane(panel);
	}
	public void init(){
	setSize(600,400);
	}
}
