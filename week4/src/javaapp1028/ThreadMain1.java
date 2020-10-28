package javaapp1028;

class ThreadEx extends Thread {
	@Override
	public void run() {
		//5초 동안 1초에 한번씩 스레드 라는 문자열을 출력
		try {
			//예외가 발생할 가능성이 있는 구문
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);
				System.out.printf("스레드\n");
			}
		}catch (Exception e){
			//예외가 발생한 경우 처리할 구문
			
			//예외 메시지 출력
			System.out.printf("예외:%s\n", e.getMessage());
			//예외 추적 코드를 콘솔에 출력
			e.printStackTrace();
		}finally {
			//무조건 수행하는 구문
			System.out.printf("사용했던 자원 정리");
		}
	}
}

public class ThreadMain1 {

	public static void main(String[] args) {
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		//3초 후에 스레드 종료
		try {
			Thread.sleep(3000);
			th1.interrupt();
		}catch (Exception e) {
			//예외 메시지 출력
			System.out.printf("예외:%s\n", e.getMessage());
			//예외 추적 코드를 콘솔에 출력
			e.printStackTrace();
		}
		

	}

}
