package javaapp1030;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiver {

	public static void main(String[] args) {
		try {
			//멀티캐스트 소켓 생성
			MulticastSocket ms = new MulticastSocket(10000);
			//멀티캐스트 주소 생성
			InetAddress ia = InetAddress.getByName("224.128.1.5");
			//멀티캐스트 그룹에 참여하기
			ms.joinGroup(ia);
			
			while(true) {
				byte [] b = new byte[1024];
				DatagramPacket dp = new DatagramPacket(b, b.length);
				//패킷 받
				ms.receive(dp);
				
				String msg = new String(b);
				System.out.printf("%s\n", msg.trim());
			}
			
			
		} catch (Exception e) {
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
