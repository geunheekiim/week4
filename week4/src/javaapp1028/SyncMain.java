package javaapp1028;

public class SyncMain {

	public static void main(String[] args) {
		//Runnable 인터페이스를 implements 한 ShareData를 이용해서 스레드 생성 후 시
		Thread th1 = new Thread(ShareData.sharedInstance());
		th1.start();
		Thread th2 = new Thread(ShareData.sharedInstance());
		th2.start();
		
		try {
			//앞의 스레드 작업을 전부 종료하고 수행하도록 하기 위해서
			//30초의 딜레이를 설정
			Thread.sleep(30000);
			System.out.printf("result:%d\n", ShareData.sharedInstance().getResult());
		}catch (Exception e) {}
	}

}
