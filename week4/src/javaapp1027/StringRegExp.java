package javaapp1027;

import java.util.regex.Pattern;

public class StringRegExp {

	public static void main(String[] args) {
		//String 한글 = "^아";
		Pattern p = Pattern.compile("^\\d{3}-\\d{3,4}-\\d{4}$");
		
		//검사할 문자열 배열 생성
		String [] phones = {
			"010-1234-2398", "아담", "강진 축구", "프리스톤테일", "priston테일", "adamsoft", "trigrowsPictures"
		};
		
		//한글 존재 여부 확인
		for(String imsi : phones) {
			System.out.printf("%b\n", p.matcher(imsi).find());
		}

	}

}
