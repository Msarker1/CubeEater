import java.awt.Color;
import java.awt.Graphics;


public class Oval {

	final int WIDTH = 30 , HEIGHT = 30;
	
	public void draw(Graphics g, int xCoor, int yCoor){
		g.setColor(Color.GRAY);
		g.fillOval(xCoor, yCoor, WIDTH, HEIGHT);
		
	}
}
