package javaapp1030;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			while(true) {
				InetAddress ia = InetAddress.getByName("192.168.10.17");
				int port = 9001;
				
				//소켓 생성
				Socket socket = new Socket(ia, port);
				
				//전송할 내용 입력받기
				System.out.printf("메시지:");
				String msg = sc.nextLine();
				
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println(msg);
				pw.flush();
				
				
				pw.close();
				socket.close();
				
			}
			
		} catch (Exception e) {
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
