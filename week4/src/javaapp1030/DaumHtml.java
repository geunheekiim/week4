package javaapp1030;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class DaumHtml {

	public static void main(String[] args) {
		try {
			//접속할 곳의 주소
			InetAddress daum = InetAddress.getByName("www.daum.net");
			//접속할 곳의 포트번호
			int port = 80;
			//소켓 생성
			Socket socket = new Socket(daum, port);
			
			//문자열 전송
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println("GET http://www.daum.net");
			pw.flush();
			
			//문자열 읽기
			BufferedReader br = new BufferedReader (new InputStreamReader(socket.getInputStream()));
			StringBuilder sb = new StringBuilder();
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line + "\n");
			}
			//읽으며 쌓은 데이터를 문자열
			String html = sb.toString();
			System.out.printf("%s", html);
			
			//스트림 닫기
			pw.close();
			//소켓 닫기
			socket.close();
			
		}catch(Exception e) {
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
