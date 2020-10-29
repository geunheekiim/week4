package javaapp1029;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class ByteBuffer {

	public static void main(String[] args) {
		try {
			//절대 경로를 이용해서 파일에 기록할 수 있도록
			//PrintStream 생성
			PrintStream p = new PrintStream("/Users/a202.03/Documents/buffer.dat");
			//기록할 내용 만들기
			String msg = "버퍼를 이용한 바이트 출력";
			p.print(msg.getBytes());
			p.close();
			
			System.out.printf("기록 성공\n");
			
			//파일에서 버퍼를 이용해서 읽어오기
			BufferedInputStream bis = new BufferedInputStream( new FileInputStream("/Users/a202.03/Documents/buffer.dat") );
			//데이터를 저장하기 위한 바이트 배열
			byte [] r = new byte[bis.available()];
			//읽기
			bis.read(r);
			//문자열로 변환하여 출력
			String str = new String(r);
			System.out.printf("%s\n", str);
			bis.close();
			
			
		}catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
