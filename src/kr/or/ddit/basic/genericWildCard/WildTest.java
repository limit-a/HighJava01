package kr.or.ddit.basic.genericWildCard;

import java.util.ArrayList;
import java.util.List;

public class WildTest {
	public static void main(String[] args) {
		
		// 와일드 카드 사용 
		/*
		 * < ? >
			메소드 매개변수의 자료형에 사용되는 제너릭
			< ? extends Object > 의 줄임 표현
			어떤 자료형의 객체도 매개변수로 받겠다는 의미
			nbounded WildCard라고 알려져 있음
		 */
		
		//String 자료형 list
		List<String> list = new ArrayList<>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		
		//Integer 자료형 list2 생성
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
	
		
		//Double 자료형 list3 생성
		List<Double> list3 = new ArrayList<>();
		
		list3.add(3.14);
		list3.add(16.222);
		list3.add(42321.12312);
		
		
		printData(list);
		printData(list2);
		printData(list3);
		
	}

	// 리스트 출력 메서드
	private static void printData(List<?> list) {
		for(Object o : list) {
			System.out.println(o);
		}
		
	}
	
	
	
}
