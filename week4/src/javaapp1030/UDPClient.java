package javaapp1030;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		try {
			//입력 받기 위한 스캐너 생성
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.printf("보낼 메시지 입력:");
				String msg = sc.nextLine();
				
				//데이터를 보내는 소켓을 생성
				DatagramSocket dsoc = new DatagramSocket();
				
				//보낼 곳의 주소와 포트를 설정
				InetAddress ia = InetAddress.getByName("192.168.10.86");
				int port = 7777;
				
				
				//보낼 패킷을 생성
				DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length , ia, port);
				//보내기
				dsoc.send(dp);
				dsoc.close();
				System.out.println("전송 완료");
				
				
			}
			
		} catch (Exception e) {
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		}
	}

}
