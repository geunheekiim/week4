package javaapp1026;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserMapMain {

	public static void main(String[] args) {
		//키와 값을 쌍으로 저장하는 자료구조 인스턴스 생성
		Map<String, Object> map = new HashMap<String, Object>();
		
		//데이터 저장
		map.put("name", "adam");
		map.put("age", 50);
		//기존에 존재하는 key를 사용하게되면 수정
		map.put("age", 49);
		
		//전체데이터 확인
		System.out.printf("%s\n", map);
		//하나의 값을 가져오기
		System.out.printf("%s\n", map.get("name"));
		System.out.printf("%s\n", map.get("job"));
		//데이터 삭제
		//map.remove("name");
		map.put("name", null);
		
		System.out.printf("%s\n", map);
		
		//전체 데이터 순회
		//모든 키의 값을 가져오기
		Set<String> ketSet = map.keySet();
		for( String key : ketSet ) {
			System.out.printf("%s: %s\n", key, map.get(key));
		}
	}

}
