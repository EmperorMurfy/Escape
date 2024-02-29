// Graphics Panel
// Written by: Mason Zhu
// Date: June 8th, 2023
// This project is a basic level for a improved Text Adventure game with graphics
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.net.URL;
import javax.swing.ImageIcon;


public class GraphicsPanel extends JPanel implements KeyListener{
	
	
	private Rectangle player;
	
	//Map Walls & Elements
	private Rectangle wallOne;
	private Rectangle wallTwo;
	private Rectangle wallThree;
	private Rectangle wallFour;
	private Rectangle wallFive;
	private Rectangle wallSix;
	private Rectangle wallSeven;
	private Rectangle wallEight;
	private Rectangle wallNine;
	private Rectangle wallTen;
	private Rectangle wallEleven;
	private Rectangle wallTwelve;
	private Rectangle wallThirteen;
	private Rectangle jailcellDoor;
	private Rectangle levelOne;
	
	//Areas
	
	private Rectangle weaponRoom;
	private Rectangle jailCell;
	private Rectangle warning;
	private Rectangle camera;
	
	//Key
	private Rectangle key;
	private int keyX = (int) Math.floor(Math.random() *(80 - 0 + 1) + 0);
	private int keyY = (int) Math.floor(Math.random() *(80 - 0 + 1) + 0);
	
	//Other Variables
	private int door = 0;
	private int avoid = 0;
	
	//Story Line
	private String storylineOne = "You've been caught, you awake in a room, it appears to be an old dinky cell.";
    private String storylineTwo = "The door is CLOSED, move around the jail cell to find the key!";
    private String storylineThree = "Press E to avoid the camera's sight to not get caught!";
    private String storylineFour = "Bingo! Weapons room! You find guns, knives, protective gear";
    private String storylineFive = "You equip the necessary gear. Time to head out further";
    private String storylineSix = "LEVEL ONE COMPLETE. Level Two is current UNDER DEVELOPMENT";
			
	
	private Timer t;

	// method: GraphicsPanel Constructor
	// description: This 'method' runs when a new instance of this class in instantiated.  It sets default values  
	// that are necessary to run this project.  You do not need to edit this method.
	public GraphicsPanel(){
		setPreferredSize(new Dimension(500, 600));
        this.setFocusable(true);			// for keylistener
		this.addKeyListener(this);
		//Dimensions & Coordinates of Items
		player = new Rectangle(0 , 365, 15, 15);
		
		wallOne = new Rectangle(100 , 100, 160, 238);
		wallTwo = new Rectangle (0 , 238, 72, 178);
		wallThree = new Rectangle (0, 416, 160, 85);
		wallFour = new Rectangle (0, 416, 160, 10);
		wallFive = new Rectangle (0, 228, 160, 10);
		wallSix = new Rectangle (0, 0, 280, 90);
		wallSeven = new Rectangle (220, 150, 10, 400);
		wallEight = new Rectangle (220, 150, 400, 10);
		wallNine = new Rectangle (368, 0, 160, 90);
		wallTen = new Rectangle (0, 326, 160, 1);
		wallEleven = new Rectangle (0, 324, 160, 2);
		wallTwelve = new Rectangle (160, 490, 60, 10);
		wallThirteen = new Rectangle (280, 0, 90, 30);
		weaponRoom = new Rectangle (280, 0, 90, 90);
		jailCell = new Rectangle (74, 327 , 85, 88);
		jailcellDoor = new Rectangle(160, 327, 15, 100);
		key = new Rectangle (75 + keyX, 327 + keyY, 5, 5);
		camera = new Rectangle (220, 90, 10, 40);
		warning = new Rectangle (190, 90, 30, 60);
		levelOne = new Rectangle (490, 90, 10, 60);
		
	
		
        t = new Timer(25, new ClockListener(this));   
        t.start();
        wallOne.x=0;
		wallOne.y=0;

	}
	
	public void clock(){
		
		this.repaint();
	}
	
	// method: paintComponent
	// description: This method is called when the Panel is painted.  It contains code that draws shapes onto the panel.
	// parameters: Graphics g - this object is used to draw shapes onto the JPanel.
	// return: void
	public void paintComponent(Graphics g){

		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.gray);
		g2.fillRect(0, 0, 500, 600);
		ImageIcon image;

        // this code loads an image so that you can later paint it onto your component.

        // this would load a picture named x.png that should be saved in a folder

        // named images, which should be located in your src folder.

        // these images were downloaded from imageicon.com.  you can download other 

        // images from this website to use instead of these.

        ClassLoader cldr = this.getClass().getClassLoader();

        String imagePath = "images/level1.JPG"; // whatever picture you use, needs to be in the folder

        URL imageURL = cldr.getResource(imagePath);

        image = new ImageIcon(imageURL);


        image.paintIcon(this, g, 0, 0); // draws the image at the x 0 and y 0
		
	//Player
    	g2.setColor(Color.RED);
		g2.fillOval(player.x, player.y, player.width, player.height);
	
	
		
		//Wall Clipping Prevention Mechanism
		if(player.intersects(wallOne)){
			player.x+=10;
		}
		
		if(player.intersects(wallTwo)){
			player.x+=10;
		}

		if(player.intersects(wallThree)){
			player.x+=10;
			player.y-=10;
		}
		
		if(player.intersects(wallFour)){
			player.x-=10;
			player.y-=10;
		}
		
		if(player.intersects(wallFive)){
			player.x-=10;
			player.y+=10;
		}
		
		if(player.intersects(wallSix)){
			player.y+=10;
		}
		

		if(player.intersects(wallSeven)){
			player.x-=10;
		}
		
		if(player.intersects(wallEight)) {
			player.y-=10;
		}
		
		if(player.intersects(wallNine)) {
			player.y+=10;
		}
		
		if(player.intersects(wallTen)) {
			player.y+=10;
		}
		
		if(player.intersects(wallEleven)) {
			player.y-=20;
		}
		
		if(player.intersects(wallTwelve)) {
			player.y-=10;
		}
		
		if(player.intersects(wallThirteen)) {
			player.y+=10;
		}
		
		//Story Interaction System
		if(player.intersects(jailCell)) {
			g2.setColor(Color.WHITE);
			g2.setFont(new Font("Sans Serif", 2, 13));
			g2.drawString(storylineOne, 5, 540);
			g2.drawString(storylineTwo, 5, 565);
			
		}
		if(player.intersects(jailcellDoor) && door == 0) {
			player.x-=10;
		}
			
		if(player.intersects(key)) {
			g2.setColor(Color.WHITE);
			g2.setFont(new Font("Sans Serif", 1, 14));
			g2.drawString("Key Found! ROOM UNLOCKED. Proceed.", 120, 520);
			door = 1;
		}
		
		if(player.intersects(warning)) {
			g2.setColor(Color.WHITE);
			g2.setFont(new Font("Sans Serif", 2, 14));
			g2.drawString("SECURITY CAMERA!", 1, 525);
			g2.drawString(storylineThree, 1, 550);
		}
		
		if(player.intersects(camera) && avoid == 0) {
			g2.setColor(Color.WHITE);
			g2.setFont(new Font("Sans Serif", 2, 14));
			player.x = 100;
			player.y = 365;
			door = 0;
		}
	
		if(player.intersects(weaponRoom)) {
			//Display Story
			g2.setColor(Color.WHITE);
			g2.setFont(new Font("Sans Serif", 2, 14));
			g2.drawString(storylineFour, 5, 525);
			g2.drawString(storylineFive, 5, 550);
		}
		
		if(player.intersects(levelOne)) {
			g2.setColor(Color.WHITE);
			g2.setFont(new Font("Sans Serif", 2, 12));
			g2.drawString(storylineSix, 5, 525);
			player.x-=10;
		}

		


		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	//Control System

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
			// move right
			case KeyEvent.VK_D:
				player.x+=8;
				break;
			//move left
			case KeyEvent.VK_A:
				player.x-=8;
				break;
			//move down
			case KeyEvent.VK_S:
				player.y+=8;
				break;
			//move up
			case KeyEvent.VK_W:
				player.y-=8;
				break;	
			//E Command - Avoid - Warning Story Section
			case KeyEvent.VK_E:
				avoid = 1;
				break;
				
		}
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
