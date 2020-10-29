package javaapp1029;

import java.text.SimpleDateFormat;

public class ToDay {

	public static void main(String[] args) {
		//오늘 날짜 추출하기
		
		
		java.util.Date date = new java.util.Date();
		
		//2020-10-29 형태의 문자열 만들기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		System.out.printf("%s\n", today);
		
		java.sql.Date t = new java.sql.Date(System.currentTimeMillis());
		System.out.printf("%s\n", t);
		
		
		
	}

}
