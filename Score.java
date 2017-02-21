import java.awt.Color;
import java.awt.Graphics;

public class Score {
	final int WIDTH = 700,HEIGHT = 10;
	public void draw(Graphics g,int score){
		g.setColor(Color.GREEN);
		g.drawString("Score: " +score, WIDTH, HEIGHT);
		
	}
}
