package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Polymorph{
	int n= 0;
	
	Circle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillRect(x, y, 10, 10);
	}
	public void update() {
		//._.
		x= ((int)(x+Math.cos(n)*100.0));
		y = ((int)(y+Math.sin(n)*100.0));
		n++;
	}
}
