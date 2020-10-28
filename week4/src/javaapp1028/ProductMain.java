package javaapp1028;

public class ProductMain {

	public static void main(String[] args) {
		//공유 자원을 생성
		Product product = new Product();
		
		//생산자 스레드를 생성해서 실행
		Producer producer = new Producer(product);
		producer.start();
		
		//소비자 스레드를 생성해서 실행
		Consumer consumer = new Consumer(product);
		consumer.start();
		
		
	}

}
