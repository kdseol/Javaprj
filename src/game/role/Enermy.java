package game.role;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Enermy {
		private int ex;
		private int ey;
		private Image eImg;
	
	
	
	public Enermy() {
		ex=320;
		ey=50;
		Toolkit tk = Toolkit.getDefaultToolkit();
		eImg = tk.getImage("res/enemy.png");

	}
	public void draw(Graphics g, RoleCanvas roleCanvas) {
		
		g.drawImage(eImg, ex, ey, roleCanvas);
	}
}

//Ramdom rand = new Random();
//x = rand.nextInt(400)-20;
//y = -200;
//
//move(rand.nextInt(360),rand,nextInt(50)+200);