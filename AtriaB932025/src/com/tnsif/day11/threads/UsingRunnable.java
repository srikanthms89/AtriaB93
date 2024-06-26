package com.tnsif.day11.threads;

public class UsingRunnable implements Runnable {

	Thread t;
	int h, l;
	String msg;

	public UsingRunnable(int l, int h,String msg) {
		this.h = h;
		this.l = l;
		this.msg = msg;
		t = new Thread(this, "Child Thread");
		t.start();
	}

	@Override
	public void run() {
		for (int i = l;i<=h;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Error " + e.getMessage());
			}
			System.out.println(msg + i);
		}
	}
}

/*public class RunnableLambdaTest {
public static void main(String[] args) {
   Runnable r1 = new Runnable() {
      @Override
      public void run() { // anonymous class
         System.out.println("Runnable with Anonymous Class");
      }
   };
   Runnable r2 = () -> {   // lambda expression
      System.out.println("Runnable with Lambda Expression");
   };
   new Thread(r1).start();
   new Thread(r2).start();
}
}
*/