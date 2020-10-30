package javaapp1030;

import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownload {

	public static void main(String[] args) {
		try {
			//URL을 생성
			//URL을 만들기 전에 URL에 한글이 있으면
			//URLEncoder.encode 로 인코딩을 해주어야합니다.
			URL url = new URL("https://file.mk.co.kr/meet/neds/2020/05/image_readtop_2020_504377_15897604624203338.jpg");
			
			//연결 객체 생성
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			//옵션 설정
			//접속 시도 시간을 설정 - 30초
			con.setConnectTimeout(30000);
			//캐시 사용 여부를 설정
			con.setUseCaches(false);
			
			//파일 다운로드를 받을 때에는 BufferedInputStream 생성
			BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
			
			//기록할 FileStream을 생성
			PrintStream ps = new PrintStream("./2.jpg");
			
			//바이트 배열 단위로 읽어서 ps에 기록
			while(true) {
				//읽어올 크기의 배열을 생성
				byte [] b = new byte [con.getContentLength()];
				//읽기
				int r = bis.read(b);
				//읽은게 없으면 종료
				if(r <= 0) {
					break;
				}
				//읽은 내용을 파일에 기록
				ps.write(b, 0, r);
			}
			//버퍼에 남아있는 내용 모두 출력
			ps.flush();
			ps.close();
			bis.close();
			con.disconnect();
			
			
			
					
		} catch (Exception e) {
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}