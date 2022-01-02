package MainCode;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Start {
	
	public static void main(String[] args) {
		initializeWindow(); 
	}
	
	private static void initializeWindow() {
		JFrame drawingFrame = new DrawingFrame(); 
		DrawingPanel drawingPanel = new DrawingPanel(); 
		drawingFrame.add(drawingPanel); 
	}

}
