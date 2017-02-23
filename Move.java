import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public  class Move extends Applet implements KeyListener , Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Player player;
	private Cube cube;
	private Cube cube2;
	private Point point;
	private Score score;
	
	private boolean running ,moved = false;
	private Thread thread;
	
	final int WIDTH = 800, HEIGHT = 400;
	
	private int xCoor = 0, yCoor = 0;
	private int X=800,Y=0,Z=0, P=0;
	
	private Random random= new Random();
	private Random rand1= new Random();
	private Random rand2= new Random();
	
	int xc = rand1.nextInt(350);
	int	yc = rand2.nextInt(350);

	
	public void init(){
		this.resize(WIDTH, HEIGHT);
		addKeyListener(this);
		
		player = new Player();
		cube = new Cube();
		cube2 = new Cube();
		point = new Point();
		score = new Score();
		this.setBackground(Color.BLACK);
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	
	@SuppressWarnings("deprecation")
	public void paint( Graphics g){

		player.draw(g, xCoor, yCoor);
		cube.Draw(g,X ,Y );
		//cube2.Draw(g,X,Z);
		
		System.out.println("xCoor: "+xCoor);
		System.out.println("yCoor: "+yCoor);
		System.out.println("xCube: "+X);
		System.out.println("Ycube:"+Y);
		
		point.draw(g, xc, yc);
		
			
		if(X==-400){ 
			X=800;
			Y = random.nextInt(350);
			Z = random.nextInt(350);
		
		}
		
		if((xCoor>770)|(xCoor<0)|(yCoor<0)|(yCoor>370)){
			g.setColor(Color.BLUE);
			g.drawString("YOU LOSE ", 350, 200);
			thread.stop();
		}
		
		if((xCoor>X-30)&&(xCoor<X+400)&& ((yCoor>Y-30)&&(yCoor<Y+50))){
			g.setColor(Color.BLUE);
			g.drawString("YOU LOSE ", 350, 200);
			thread.stop();
		}
		
		if((((xCoor>xc-30) && (xCoor <xc+30))) && ((yCoor<yc+30) && (yCoor)>yc-30)){
			xc = rand1.nextInt(350);
			yc = rand2.nextInt(350);
			
			point.delete(g, xc, yc);
			P++;
			point.draw(g, xc, yc);
		}
			score.draw(g, P);
	
	}
	
	public void update(){
		if(moved){
			X--;
		}
	}
	
		
	
	public void keyPressed(KeyEvent e) {
	
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			xCoor+=10;
			//update();
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			xCoor-=10;
			//update();
		}
		if(e.getKeyCode() == KeyEvent.VK_UP){
			yCoor-=10;
			//update();
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			yCoor+=10;
			//update();
		}
		moved = true;
			
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		while(running){
			repaint();
			update();
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		
	}

}
	
	
