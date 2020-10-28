package javaapp1027;

public class ThreadCompare {

	public static void main(String[] args) {

		Thread th1 = new Thread() {
			public void run() {
				try {
					for (int i = 1; i <= 10; i++) {
						Thread.sleep(1000);
						System.out.printf("%d\n", i);
					}
				} catch (Exception e) {

				}
			}
		};
		th1.start();
		
		Thread th2 = new Thread() {
			public void run() {
				try {
					for (int i = 1; i <= 10; i++) {
						Thread.sleep(1000);
						System.out.printf("%d\n", i);
					}
				} catch (Exception e) {

				}
			}
		};
		th2.start();

	}

}
