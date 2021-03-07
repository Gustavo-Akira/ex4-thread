package main.model;

import main.thread.FrogThread;

public class Race {
	public int maxLenght;
	public int position = 0;
	public void racing() {
		FrogThread thread = new FrogThread(1,maxLenght,this);
		FrogThread thread2 = new FrogThread(2,maxLenght,this);
		FrogThread thread3 = new FrogThread(3,maxLenght,this);
		FrogThread thread4 = new FrogThread(4,maxLenght,this);
		FrogThread thread5 = new FrogThread(5,maxLenght,this);
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
