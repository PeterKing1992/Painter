package MainCode;

import javax.swing.JFrame;

public class DrawingFrame extends JFrame{
	public DrawingFrame() {
		initialize(); 
	}
	public void initialize() {
		setTitle("Painter"); 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setSize(1280, 800); 
		setVisible(true); 
	}
}
