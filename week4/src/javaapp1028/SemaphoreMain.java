package javaapp1028;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {
		
		//동시에 3개까지 수행할 수 있는 세마포어를 생성
		Semaphore semaphore = new Semaphore(3);
		
		
		SemaphoreThread th1 = new SemaphoreThread(semaphore);
		SemaphoreThread th2 = new SemaphoreThread(semaphore);
		SemaphoreThread th3 = new SemaphoreThread(semaphore);
		SemaphoreThread th4 = new SemaphoreThread(semaphore);
		SemaphoreThread th5 = new SemaphoreThread(semaphore);
		SemaphoreThread th6 = new SemaphoreThread(semaphore);
		SemaphoreThread th7 = new SemaphoreThread(semaphore);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		
		
	}

}
