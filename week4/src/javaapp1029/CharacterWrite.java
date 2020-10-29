package javaapp1029;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CharacterWrite {

	public static void main(String[] args) {
		//오늘 날짜로 텍스트 파일을 만들어서 현재 디렉토리에 파일을 생성한 날짜와 시간까지 기록
		
		try {
			//현재 날짜 및 시간을 갖는 인스턴스를 생성
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String today = sdf.format(date);
			
			//기록할 파일 생성
			FileWriter fw = new FileWriter("./" + today + ".txt" , true);
			
			//날짜와 시간을 모두 문자열로 생성
			//작업 내용과 작업 시간을 파일에 기록하는 것을 '로그를 기록한다'라고 합니다.
			//로그를 기록할 때 가장 일반적인 단위가 1일 입니다.
			sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			String time = sdf.format(date);
			
			PrintWriter pw = new PrintWriter(fw);
			
			//기록
			pw.printf("%s\n", time);
			pw.flush();
			
			pw.close();
			fw.close();
			
		}catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.getStackTrace();
		}
		
		
	}

}
