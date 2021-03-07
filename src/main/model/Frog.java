package main.model;

public class Frog {
	private int position = 0;
	private int number;
	
	public Frog(int number) {
		this.number = number;
	}

	public void jump() {
		int jumped =(int)(Math.random() * 3);
		position += jumped;
		System.out.println(" sapo "+number +" pulou = "+jumped +" e esta na " + position);
	}
	
	public int getPosition() {
		return this.position;
	}
}
