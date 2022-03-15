package lect05_inner_classes;

public class ThreadManager {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {

			public void run() {
				for(int i=0;i<10;i++) {
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Step: " + i);
				}
				
			}
			
		});
		thread1.start();
	}

}
