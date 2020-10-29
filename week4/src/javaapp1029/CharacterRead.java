package javaapp1029;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharacterRead {

	public static void main(String[] args) {
		try {
			// 파일을 문자열 단위로 읽을 수 있는 인스턴스를 생성
			BufferedReader br = new BufferedReader(
					new FileReader("/Users/a202.03/git/week2/week2/src/javaapp1012/Star.java"));
			StringBuilder sb = new StringBuilder();
			while (true) {
				// 못 읽으면 null 을 리턴
				String line = br.readLine();
				// 읽은게 없으면 종료
				if (line == null) {
					break;
				}
				//읽은 내용을 sb에 추가
				sb.append(line + "\n");
			}
			//StringBuilder를 String으로 변환
			String msg = sb.toString();
			System.out.printf("%s", msg);
			br.close();

		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
