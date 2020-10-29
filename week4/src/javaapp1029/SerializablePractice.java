package javaapp1029;

import java.io.BufferedReader;
import java.io.FileReader;

public class SerializablePractice {

	public static void main(String[] args) {
//		log.txt
//		> 첫번째 데이터가 아이피
//		> 열번째 데이터가 트래픽
//		1. 아이피 별로 접속한 횟수를 계산해서 출력
//		2. 아이피 별로 트래픽 합계를 계산해서 출력
		
		try {
			//파일의 내용을 문자열로 읽을 수 있는 인스턴스를 생성
			FileReader fr = new FileReader("./log.txt");
			BufferedReader br = new BufferedReader(fr);
			//파일이 제대로 있는지 출력으로 확인
			//System.out.printf("%s\n", br); - 확인완료
			
			
			
			while(true) {
				//데이터를 줄 단위로 읽기 - 출력으로 확인	
				String line = br.readLine();
				//데이터가 없으면 멈춤
				if(line == null) {
					break;
				}
				//데이터 라인 확인
				//System.out.printf("%s\n", line); - 확인완료
				
				//데이터에서 공백을 기준으로 line을 분할
				String [] ar = line.split(" ");
				
				
				
				
				
			}
						
		}catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
