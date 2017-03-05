import java.awt.Color;
import java.awt.Graphics;

public class Point {
	final int WIDTH = 30, HEIGHT = 30;
	
	public void draw(Graphics g, int xCoor, int yCoor){
		g.setColor(Color.BLACK);
		g.drawOval(xCoor, yCoor, WIDTH, HEIGHT);
		g.setColor(Color.YELLOW);
		g.fillOval(xCoor, yCoor, WIDTH, HEIGHT);
	}
	
	public void delete(Graphics g, int xCoor, int yCoor){
		g.clearRect(xCoor, yCoor, WIDTH, HEIGHT);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 400);
	}

}
