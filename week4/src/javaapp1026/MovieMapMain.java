package javaapp1026;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MovieMapMain {

	public static void main(String[] args) {
		//Movie 인스턴스 1개를 생성하고 값을 설정
		Movie movie = new Movie();
		movie.setMovieNum(1);
		movie.setMovieTitle("악마를 보았다");
		movie.setActor("이병헌");
		movie.setMovieRating(19);
		movie.setOpeningDate("20100101");
		movie.setAttendance(19025294);
		movie.setRatingAverage(4.9);
		
		//Movie 인스턴스의 값을 각각 출력
		/*System.out.printf("번호:%d 제목:%s 주연배우:%s\n", movie.getMovieNum(), movie.getTitle(), movie.getActor()  );*/
		
		//DTO 대신 사용하는 Map
		Map<String, Object> map = new HashMap<String, Object>();
		
		//데이터 저장
		map.put("movieNum", 1);
		map.put("movieTitle", "악마를 보았다");
		map.put("actor", "이병헌");
		
		//데이터 출력
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.printf("%s:%s\n", key, map.get(key));
		}
		
		
		
		
	}

}
