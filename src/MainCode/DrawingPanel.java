package MainCode;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener{
	private DrawnComponent drawnComponent; 
	private int mouseX, mouseY; 
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
		
		mouseX = 0; 
		mouseY = 0; 
		state = "idle"; 
	}
	
	public void paint(Graphics g) {
//		super.paintComponent(g); 
		g.setColor(Color.black);
		g.fillRect(mouseX, mouseY, 1, 1);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		
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
