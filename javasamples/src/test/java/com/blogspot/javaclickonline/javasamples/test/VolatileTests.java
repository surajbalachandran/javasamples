package com.blogspot.javaclickonline.javasamples.test;


public class VolatileTests {

	private static volatile boolean isDone = false;

	public static void main(String[] args) throws Exception {

		System.out.println("Starting thread...");
		
		
		Thread t = new Thread(new Runnable() {
			
			public void run() {

				while(!isDone) {
					
				}
			}
		});
		
		t.start();
		
		Thread.currentThread().sleep(2000);
		
		isDone = true;
		System.out.println("done!");
	}
}
