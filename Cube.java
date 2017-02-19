import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

public class Cube {
	
	final int WIDTH= 400, HEIGHT = 50;
	
	public void Draw(Graphics g, int xCoor, int yCoor){
		g.setColor(Color.red);
		g.drawRect(xCoor, yCoor, WIDTH, HEIGHT);
		g.fillRect(xCoor, yCoor, WIDTH, HEIGHT);
	}
	
	public void Delete(Graphics g,int xCoor, int yCoor){
		g.clearRect(xCoor, yCoor, WIDTH, HEIGHT);
		
	}
}