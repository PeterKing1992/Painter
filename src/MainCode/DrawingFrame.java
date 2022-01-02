package MainCode;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class DrawingFrame extends JFrame{
	private JToolBar toolBar; 
	private JButton test; 
	private JComboBox<String> brushDropdown;
	
	public DrawingFrame() {
		initialize(); 
		toolBarSetup(); 
	}
	
	public void initialize() {
		setTitle("Painter"); 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setSize(1280, 800); 
		setVisible(true); 
	}
	
	public void toolBarSetup() {
		toolBar = new JToolBar(); 
		test = new JButton("Test"); 
		String[] brushSizes= {"1x1px", "2x2px", "4x4px", "8x8px", "16x16px"}; 
		brushDropdown = new JComboBox<String>(brushSizes); 
		brushDropdown.setVisible(true); 
		brushDropdown.setBounds(test.WIDTH, 0, 70, toolBar.HEIGHT);
		
//		brushDropdown.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent event) {
//				
//			}
//		});
		
		toolBar.add(test); 
		toolBar.add(brushDropdown); 
		
		this.add(toolBar, BorderLayout.NORTH); 
		
	}
}
