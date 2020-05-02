package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Image extends Polymorph{
	BufferedImage image;
	Image(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("waldo.jpg"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		image.getScaledInstance(5, 5, 5);
		g.drawImage(image, 100, 100, null);
	}

}
