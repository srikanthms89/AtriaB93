package com.tnsif.day11.threads;

public class ThreadDemo 
{
	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(10, "First");
		ChildThread t2 = new ChildThread(10, "Second");

		t1.start();
		 t1.run(); // single threaded application
		t2.start();

		System.out.println("-----------------------End of Main--------------------------");
	}
}
