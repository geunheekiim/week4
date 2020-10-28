package javaapp1027;

//자신의 스레드 이름을 1초마다 5번 출력하는 스레드 클래스 생성
class ThreadTemp extends Thread{
	
	@Override
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);
				System.out.printf("%s\n", getName());
			}
		}catch (Exception e){
			System.out.printf("%s\n", e.getMessage());
		}
	}
}

public class DaemonAndPriority {

	public static void main(String[] args) {
		ThreadTemp temp = new ThreadTemp();
		temp.start();
		try {
			Thread.sleep(3000);
			System.out.printf("메인 스레드 종료\n");
		}catch (Exception e) {}
		
	}

}
