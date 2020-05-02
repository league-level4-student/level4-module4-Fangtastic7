package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	ArrayList<Polymorph> poly;
	Polymorph circle;
	Polymorph mouse;
	Polymorph image;
	Polymorph message;


	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.addMouseListener(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseMotionListener(this);
		poly = new ArrayList<Polymorph>();
		circle = new Circle(300, 300);
		mouse = new Mouse(10, 10 );
		image = new Image(5, 5);
		message = new Message(25, 25);
		/// bluePoly = new BluePolymorph(50, 50);
		poly.add(circle);
		poly.add(mouse);
	    poly.add(image);
	   poly.add(message);

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
		for (Polymorph morph : poly) {
			morph.draw(g);
		}
		// draw polymorph

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph morph : poly) {
			morph.update();
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		mouse.setx(arg0.getXOnScreen());
		mouse.sety(arg0.getYOnScreen());
		System.out.println(arg0.getXOnScreen());
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>=15 && e.getX()<=35 && e.getY()>=45 && e.getY()<=55) {
			JOptionPane.showMessageDialog(null, "Why you bully me?");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
