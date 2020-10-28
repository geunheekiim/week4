package javaapp1027;

import java.util.regex.Pattern;

public class EmailReg {

	public static void main(String[] args) {
		String [] emails = {
				"geunheekiim@gmail.com",
				"qwertg.gmail.com"
		};
		
		//위의 데이터의 이메일이 맞는지 체크하기
		
		//자바의 이메일 정규식
		Pattern p = Pattern.compile("^(.+)@(.+)$");
		
		for(String imsi : emails) {
			System.out.printf("%b\n", p.matcher(imsi).find());
		}
		
	}

}
 