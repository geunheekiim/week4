package javaapp1030;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class KakaoOpenAPI {

	public static void main(String[] args) {
		try {
			// URL을 생성
			// URL을 만들기 전에 URL에 한글이 있으면
			// URLEncoder.encode 로 인코딩을 해주어야합니다.
			String query = "삼국지";
			//한글은 인코딩을 해야합니다.
			query = URLEncoder.encode(query, "UTF-8");
			
			URL url = new URL("https://dapi.kakao.com/v3/search/book?target=title&query=" + query);

			// 연결 객체 생성
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 옵션 설정
			// 접속 시도 시간을 설정 - 30초
			con.setConnectTimeout(30000);
			// 캐시 사용 여부를 설정
			con.setUseCaches(false);
			
			con.addRequestProperty("Authorization", "KakaoAK 06136c0fd39926204b8e739c73effb38");

			// 전송 방식이 POST라면 setRequestMethod 호출

			// 문자열 다운로드이면 BufferedReader를 생성하고
			// 파일 다운로드이면 BufferedInputStream을 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

			// 가져온 데이터를 문자열에 읽기
			StringBuilder sb = new StringBuilder();
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				sb.append(line + "\n");
			}
			String content = sb.toString();

			// 출력
			System.out.printf("%s\n", content);

			// 정리작업
			br.close();
			con.disconnect();

		} catch (Exception e) {
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		}
	}

}
