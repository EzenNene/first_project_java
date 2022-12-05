package test.ch14.vector;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(7);
		scores.add(4);
		scores.add(1);
		scores.add(5);
		scores.add(9);
		
		// 자동정렬 (오름차순)
		for (Integer s : scores) {
			System.out.println(s + " "); 
		}
		
		System.out.println();
		
		System.out.println("가장 낮은 값: " + scores.first());
		System.out.println("가장 높은 값: " + scores.last()	);
		System.out.println("5보다 작은 값: " + scores.lower(5));
		System.out.println("5보다 큰 값: " + scores.higher(5));
		
		System.out.println();
		
		// 내림차순
		NavigableSet<Integer> desc = scores.descendingSet();
		for (Integer s : desc) {
			System.out.print(s + " ");
		}
		
		// 범위검색 (5 <= score)
		// tailSet() : 주어진 값보다 높은 값을 가져온다. boolean은 해당값 포함여부 확인
		NavigableSet<Integer> rangeSet = scores.tailSet(5, true);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		// 범위검색 (4 <= score < 9)
		rangeSet = scores.subSet(4, true, 9, false);
		
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		
		
	}

}
