package MainCode;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener{
	private DrawnComponent drawnComponent; 
	private int mouseX, mouseY; 
	private int prevMouseX, prevMouseY; 
	private String state; 
	
	public DrawingPanel() {
		initialize(); 
	}
	
	public void initialize() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));
		this.setVisible(true); 
		drawnComponent = new DrawnComponent(800, 1280); 
		
		addMouseListener(this); 
		addMouseMotionListener(this); 
		
		mouseX = -1; 
		mouseY = -1; 
		prevMouseX = -1; 
		prevMouseY = -1; 
		
		state = "idle"; 
	}
	
	
	
	public void paint(Graphics g) {
		if(prevMouseX != -1) {
			g.setColor(Color.black);
			g.drawLine(prevMouseX, prevMouseY, mouseX, mouseY); 
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(mouseX != -1) {
			prevMouseX = this.mouseX; 
			prevMouseY = this.mouseY; 
		}
		this.mouseX = e.getX(); 
		this.mouseY = e.getY(); 
//		this.state = "draw"; 
		this.paint(getGraphics());
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		prevMouseX = -1; 
		prevMouseY = -1; 
		this.mouseX = -1; 
		this.mouseY = -1; 
		System.out.println("Mouse Reset");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
