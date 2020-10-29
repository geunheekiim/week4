package javaapp1029;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class LogAnalysis {

	public static void main(String[] args) {
//		1. 정상 응답을 수행한 개수를 출력
//		> 공백을 기준으로 9번째 데이터가 200이면 정상 응답
//		2. 서버에 접속한 컴퓨터의 개수를 출력(중복은 1개만 카운트)
//		> 공백을 기준으로 1번째 데이터가 접속한 컴퓨터의 IP wnth
//		3. 전체 트래픽의 합 구하기
//		> 트래픽은 마지막 요소 - 10번째 데이터

		try {
			// 1. 파일의 내용을 문자열로 읽을 수 있는 인스턴스 생성
			BufferedReader br = new BufferedReader(new FileReader("./log.txt"));
			// 파일을 제대로 복사했는지 확인, 예외가 발생하면 파일을 제대로 복사하지 않았거나 경로가 틀린 경우
			// System.out.printf("%s\n", br);

			// 2. 데이터를 줄 단위로 읽어서 출력
			// 정상 응답인 개수를 저장하기 위한 변수 생성
			int cnt = 0;

			// IP주소를 저장하기 위한 Set 을 생성
			Set<String> ipSet = new HashSet<String>();

			// 트래픽의 합계를 저장할 변수
			int sum = 0;

			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				// System.out.printf("%s\n", line); -확인완료

				// 3. 공백을 기준으로 line을 분할
				String[] ar = line.split(" ");
				// System.out.printf("%s\n", ar[0]); -확인완료

				if (ar[8].equals("200")) {
					cnt = cnt + 1;
				}
				// IP를 Set에 추가
				ipSet.add(ar[0]);

				int traffic = 0;
				try {
					// 문자열을 정수로 변환
					traffic = Integer.parseInt(ar[9]);
				} catch (Exception e) {
				}

				// 변경할 수 있는 경우는 변경된 값을 더하고
				// 그렇지 않은 경우는 0 을 더함
				sum = sum + traffic;
			}
			// 정상 응답한 데이터 개수 출력
			System.out.printf("정상 응답: %d개\n", cnt);

			// 접속한 컴퓨터의 개수
			// Set은 중복된 데이터를 저장하지 않음
			System.out.printf("컴퓨터 개수:%d개\n", ipSet.size());

			// 트래픽의 합계를 출력
			System.out.printf("트래픽 합계:%d\n", sum);

			br.close();

		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
