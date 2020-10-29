package javaapp1029;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteFile {

	public static void main(String[] args) {

		try {
			//파일에 바이트 단위로 기록하기 위한 스트림을 생성
			FileOutputStream fos = new FileOutputStream("./byte.txt", true);
			
			//기록할 내용 생성
			String msg = "파일에 기록합니다.";
			byte [] b = msg.getBytes();
			
			//기록
			fos.write(b);
			fos.flush();
			
			//스트림 닫기
			fos.close();
			
			//현재 디렉토리의 byte.txt 파일의 내용을 읽어오기
			FileInputStream fis = new FileInputStream("./byte.txt");
			//fis 전체를 저장할 수 있는 배열을 생성
			byte [] r = new byte [fis.available()];
			fis.read(r);
			//바이트 배열을 문자열로 변환
			String msg2 = new String(r);
			System.out.printf("%s\n", msg2);
			
			fis.close();
			
			
		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
