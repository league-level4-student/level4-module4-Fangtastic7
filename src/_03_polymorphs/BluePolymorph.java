package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{
	protected int width;
	protected int height;
	BluePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, 50, 50);
		 width = 10;
		 height = 10;
	}
	int getwidth() {
		return this.getwidth();
	}
	public void setwidth(int width) {
		this.width=width;
	}
	int getheight() {
		return this.height;
	}
	public void setheight(int height) {
		this.height = height;
	}
}
