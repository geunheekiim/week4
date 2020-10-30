package javaapp1030;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) {
		try {
			// 받는 쪽은 포트 번호와 함께 소켓을 생성
			DatagramSocket dsoc = new DatagramSocket(7777);
			// 바이트 배열로 받음
			while (true) {
				// 전송된 데이터를 저장할 배열을 생성
				byte[] b = new byte[65536];
				// 데이터 패킷을 생성
				DatagramPacket dp = new DatagramPacket(b, b.length);
				System.out.printf("서버 대기중...\n");
				
				//받기
				dsoc.receive(dp);
				//받은 내용을 문자열로 만들어서 출력
				String msg = new String(b);
				System.out.printf("%s\n", msg.trim());	//공백 제거를 위해 trim
			}

		} catch (Exception e) {
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		}
	}

}
