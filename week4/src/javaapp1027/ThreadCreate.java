package javaapp1027;

//Thread클래스로부터 상속받는 클래스 생성
class ThreadEx extends Thread {
	// 스레드로 수행할 메소드를 재정의 : public void run()
	@Override
	public void run() {
		// 1부터 5까지 0.5초씩 쉬면서 출력
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(500);
				System.out.printf("%d\n", i);

			}
		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
	}
}

//Runnable 인터페이스를 구현한 클래스를 생성
class RunnableImpl implements Runnable{

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(500);
				System.out.printf("%d\n", i);

			}
		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
	}
	
}

public class ThreadCreate {

	public static void main(String[] args) {
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		Thread th2 = new Thread(new RunnableImpl());
		th2.start();
		
		//Runnable 인터페이스를 구현한 클래스의 인스턴스를 anonymous로 만들기
		Thread th3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 11; i <= 15; i++) {
						Thread.sleep(500);
						System.out.printf("%d\n", i);

					}
				} catch (Exception e) {
					System.out.printf("%s\n", e.getMessage());
					e.printStackTrace();
				}
			}
			
		});
		th3.start();
	}

}
