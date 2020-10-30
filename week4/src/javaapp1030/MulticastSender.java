package javaapp1030;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastSender {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			MulticastSocket ms = new MulticastSocket();
			//닉네임 생성
			System.out.printf("별명 입력:");
			String nickname = sc.nextLine();
			//보낼 곳의 IP와 port 생성
			InetAddress ia = InetAddress.getByName("224.128.1.5");
			int port = 10000;
			
			while(true) {
				System.out.printf("메시지 입력:");
				String msg = sc.nextLine();
				
				if(msg.trim().equals("종료")) {
					msg = nickname + "님이 퇴장하셨습니다.";
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, port);
					ms.send(dp);
					break;
				}else {
					msg = nickname + ":" + msg;
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, port);
					ms.send(dp);
				}
				
			}
			sc.close();
			ms.close();
			
			
		} catch (Exception e) {
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		}
	}

}
