package javaapp1028;

import java.util.concurrent.Semaphore;

public class SemaphoreThread extends Thread {
	private Semaphore semaphore;
	
	//여러 개의 스레드 인스턴스가 공유해야 하므로
	//외부에서 생성해서 주입을 받아야 합니다.
	public SemaphoreThread(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	
	public void run() {
		try {
			//리소스 소비를 알려줌
			semaphore.acquire();
			//5초 대기 후 스레드 자신의 이름 출력
			Thread.sleep(5000);
			System.out.printf("스레드 이름:%s\n", getName());
			//리소스 자원 해제
			semaphore.release();
		}catch (Exception e) {}
	}
}
