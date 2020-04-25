package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
   protected int x;
   protected int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   
    
   	 
    }
    public void setx(int x) {
    	this.x = x;
    }
    int getx() {
    	return this.x;
    }
    public void sety(int y) {
    	this.y=y;
    }
    int gety() {
    	return this.y;
    }
    public abstract void draw(Graphics g);
}
