package com.curso.v2;

public class CheckResultsV1 {

	private static int counter = 0;

	public static void main(String[] args) {

		new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				CheckResultsV1.counter++;
				System.out.println("Thread counter: "+counter);

			}
		}).start();

		while (CheckResultsV1.counter < 100) { //HILO MAIN
			System.out.println("while counter: "+counter);
			System.out.println("Not reached yet");
		}
		System.out.println("Reached!");

	}

}