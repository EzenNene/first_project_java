package test.ch14.vector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		System.out.println();
		
		// 반복해서 키와 값을 얻기 1
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator(); // 반복된 키를 얻는다
		
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v);
		}
		
		System.out.println();
		
		// 반복해서 키와 값을 얻기 2
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator(); // 반복된 키를 얻는다
		
		while(entryIterator.hasNext()) { // 다음키가 있는 찾는다
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey(); // 키를 가져옴
			Integer v = entry.getValue(); // 값을 가져옴
			System.out.println(k + ":" + v);
		}
	}

}
