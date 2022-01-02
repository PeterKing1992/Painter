package MainCode;

import java.awt.Color;

public class DrawnComponent {
	private Color[][] colorArray; 
	public DrawnComponent(int height, int width) {
		this.colorArray = new Color[height][width]; 
		resetColor(); 
	}
	
	public void resetColor() {
		for(int i = 0; i < colorArray.length; i++) {
			for(int j = 0; j < colorArray[0].length; j++) {
				colorArray[i][j] = Color.white; 
			}
		}
	}

}
