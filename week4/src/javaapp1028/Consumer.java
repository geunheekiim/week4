package javaapp1028;

public class Consumer extends Thread {
	private Product product;
	public Consumer(Product product) {
		this.product = product;
	}
	
	//스레드로 수행할 메소드
	public void run() {
		for(int i=0; i<26; i=i+1) {
			char ch = product.get();
			System.out.printf("%c 를 소비\n", ch);
		}
	}
}
