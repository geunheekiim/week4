package javaapp1030;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// 서버 소켓과 클라이언트와의 통신에 사용할 소켓 변수 생성
		ServerSocket ss = null;
		Socket socket = null;

		try {
			// 서버 소켓 생성
			ss = new ServerSocket(9001);
			System.out.printf("서버 대기 중...");

			// 클라이언트의 요청을 무한 대기
			while (true) {
				// 클라이언트의 접속 대기
				socket = ss.accept();
				// 상대방 주소를 출력
				System.out.printf("접속자:%s\n",socket.toString());
				
				//상대방이 전송한 데이터 읽기
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg = br.readLine();
				System.out.printf("메시지:%s\n", msg);
				
				br.close();
				socket.close();
				
			}

		} catch (Exception e) {
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
