import java.awt.Color;
import java.awt.Graphics;


public class Player{

	final int WIDTH = 30 , HEIGHT = 30;
	
	public void draw(Graphics g, int xCoor, int yCoor){
		g.setColor(Color.GRAY);
		g.fillRect(xCoor, yCoor, WIDTH, HEIGHT);
		
	}
}
