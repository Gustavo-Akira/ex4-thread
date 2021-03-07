package main;

import main.model.Race;

public class Main {

	public int position = 0;
	
	public static void main(String[] args) {
		int maxLenght = 20;
		Race race = new Race();
		race.maxLenght= maxLenght;
		race.racing();
	}

}
