package com.salah.main;

public abstract class GameObject {
	
	protected int x, y;
	protected ID id;
	protected int velX, velY; // velocity
	
	public GameObject(int x, int y, ID id) { //creating constructor for player
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setX() {
		this.x = x ;	
	}
	public void setY() {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setId(ID id) {
		this.id = id;
	}
	public ID getId() {
		return id;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}
	public void setVelY(int velY) {
		this.velY = velY;
	}
	public int getVelX() {
		return velX;
	}
	public int getVelY() {
		return velY;
	}
	
}
