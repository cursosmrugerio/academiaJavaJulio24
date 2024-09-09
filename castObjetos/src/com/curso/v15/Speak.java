package com.curso.v15;

interface Truth{
	void tellItLikeItIs();
}

public class Speak {
	public static void main(String[] args) {
		
		Speak speakIt = new Tell();
		//speakIt.tellItLikeItIs();
		//(Truth)speakIt.tellItLikeItIs();
		//((Truth)speakIt).tellItLikeItIs();
		
		Tell tellit = new Tell();
		//tellit.tellItLikeItIs();
		//(Truth)tellit.tellItLikeItIs();
		((Truth)tellit).tellItLikeItIs();
	}
}

class Tell extends Speak implements Truth{

	@Override
	public void tellItLikeItIs() {
		System.out.println("Right on!");
	}
	
}