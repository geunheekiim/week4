package javaapp1027;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatMain {

	public static void main(String[] args) {
		//2020년 10월 27일 화요일 오전 11시 24분 ??초 형식으로 출력
		Date today = new Date();
		
		//날짜 서식 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEE요일 a hh시 mm분 ss초");
		String msg = sdf.format(today);
		System.out.printf("%s", msg);
		
		//통화기호 천단위 구분기호를 추가해서 출력
		int money = 59780000;
		DecimalFormat df = new DecimalFormat("\u0024 #,##0");
		msg = df.format(money);
		System.out.printf("%s", msg);
	}

}
