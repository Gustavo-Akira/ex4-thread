package main.thread;

import main.model.Frog;
import main.model.Race;

public class FrogThread extends Thread{
	private int number;
	private int maxLenght;
	private Race race;
	public FrogThread(int number,int maxLenght, Race race) {
		this.maxLenght = maxLenght;
		this.race = race;
		this.number = number;
	} 
	
	@Override
	public void run() {
		Frog frog = new Frog(this.number);
		while(frog.getPosition() < maxLenght) {
			frog.jump();
		}
		race.position = race.position+1;
		System.out.println("sapo "+ number + " chegou em "+race.position+"°");
	}
}
