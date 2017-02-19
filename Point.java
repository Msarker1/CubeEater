import java.awt.Color;
import java.awt.Graphics;

public class Point {
	final int WIDTH = 30, HEIGHT = 30;
	
	public void draw(Graphics g, int xCoor, int yCoor){
		g.setColor(Color.BLACK);
		g.drawRect(xCoor, yCoor, WIDTH, HEIGHT);
		g.setColor(Color.YELLOW);
		g.fillRect(xCoor, yCoor, WIDTH, HEIGHT);
	}
}
