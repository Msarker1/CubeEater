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

	private Oval oval;
	private Cube cube;
	private boolean running ,moved = false;
	private Thread thread;
	final int WIDTH = 800, HEIGHT = 400;
	private int xCoor = 0, yCoor = 0;
	private int X=800,Y=0,Z=0, P=0;
	
	private Random random= new Random();
	private Random rand1= new Random();
	private Random rand2= new Random();
	int xc = rand1.nextInt(350);
	int yc = rand2.nextInt(350);
	int temp = random.nextInt(400)+100;
	Cube cube2;
	Point point;
	
	public void init(){
		this.resize(WIDTH, HEIGHT);
		
		addKeyListener(this);
		oval = new Oval();
		cube = new Cube();
		cube2 = new Cube();
		point = new Point();

	}
	
	public void paint( Graphics g){
	
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		oval.draw(g, xCoor, yCoor);
		cube.Draw(g,X ,Y );
		cube2.Draw(g,X,Z);
		point.draw(g, 340, 10);
		System.out.println(xCoor);
		System.out.println(yCoor);
		if(X==-400){  
		X=800;
		Y = random.nextInt(350);
		
		Z = random.nextInt(350);
		
		}
		if((xCoor == 340) && (yCoor == 10)){
			point.draw(g, 360, 150);
			P++;
		}
	}
	
	public void update(){
			
		if(moved){
			X--;
		}
		
	}
	
	public void udp(){
		int xc = rand1.nextInt(350);
		int yc = rand2.nextInt(350);
	}
	
	
	public void start(){
		running = true;
		thread = new Thread(this);
		thread.start();
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
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		
	}

}
	
	
