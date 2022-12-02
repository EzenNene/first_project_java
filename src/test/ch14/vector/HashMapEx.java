package test.ch14.vector;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// HashMap <key, 객체(저장할 값)>
		Map<String, Integer> map = new HashMap<>();
		
		map.put("키1", 1);
		map.put("키2", 2);
		map.put("키3", 3);
		map.put("키4", 4);
		map.put("키5", 5);
		map.put("키6", 6);
		
		System.out.println("총 Entry 수: " + map.size());
		
		// 키로 값 얻기
		String key = "키1";
		
		int value1 = map.get("키1");
		int value2 = map.get(key);
		
		System.out.println("점수: " + value1);
		System.out.println("점수: " + value2);
		System.out.println(map);
	}

}
