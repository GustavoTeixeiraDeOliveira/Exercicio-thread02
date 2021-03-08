package View;

import Controller.threadId;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int g = 1; g <= 5; g++){
			threadId  threadId  = new threadId();
			threadId.start();
		}

	}

}
