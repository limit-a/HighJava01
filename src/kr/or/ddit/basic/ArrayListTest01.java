package kr.or.ddit.basic;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		
		//ArrayList는 기본적인 사용법이 Vector와 같다
		
		ArrayList list1 = new ArrayList();
		
		list1.add("aaa");
		list1.add("bbb");
		list1.add(123);
		list1.add('k');
		list1.add(true);
		list1.add(123.45);
		
		
		System.out.println("list1 =>" + list1);
		System.out.println("size =>" + list1.size());
		
		//get 메서드로 가지고옴 
		
		System.out.println("1번 째 자료 : " + list1.get(1));
		
		// 데이터 끼워넣기  
		list1.add(3, "yyy");
		System.out.println("list1 =>" + list1);
		
		// 데이터 변경하기  set
		
		String temp = (String)list1.set(3, "zzzz");
		System.out.println("전 데이터 : " + temp);
		System.out.println("list1 =>" + list1);
		
		
		//삭제도 같다.
		
		list1.remove(3);
		System.out.println("list1 =>" + list1);
		
		list1.remove("bbb");
		System.out.println("list1 =>" + list1);
		
		
		// 제네릭을 사용할 수 있다.
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("AAAA");
		list2.add("BBBB");
		list2.add("CCCC");
		list2.add("DDDD");
		list2.add("EEEE");
		
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(i + "====>"+list2.get(i));
		}
		System.out.println("----------------------------------");
		
		for(String s : list2) {
			System.out.println(s);
		}
		
		System.out.println("=========================================");
		
		
		//contains(비교객체) ==> 리스트에 '비교객체'가 있으면 true, 없으면 
		// false 반환
		
		
		System.out.println("DDDD값: " + list2.contains("DDDD"));
		System.out.println("ZZZZ값: " + list2.contains("ZZZZ"));
		
		list2.add("FFFF");
		list2.add("GGGG");
		list2.add("DDDD");
		list2.add("HHHH");
		System.out.println("list2 =>" + list2);
		
		
		// indexOf(비교객체), lastIndexOf(비교객체)  
		//   ==> 리스트에 '비교객체'가 있으면 '비교객체'가 있는 Index값을 반환하고 
		//   ==>  없으면 -1 반환 
		// indexOf() 메서드는 앞에서 뒤쪽 방향으로 검색
		// lastIndexOf() 메서드는 뒤에서 앞방향으로 검색 
		System.out.println("DDDD의 위치값1 : " + list2.indexOf("DDDD"));
		System.out.println("ZZZZ의 위치값1 : " + list2.indexOf("ZZZZ"));
		System.out.println("DDDD의 위치값2 : " + list2.lastIndexOf("DDDD"));
		System.out.println("ZZZZ의 위치값2 : " + list2.lastIndexOf("ZZZZ"));
		
		System.out.println("-------------------------------------------------------");
		
		// toArray() ==> List안의 데이터를 배열로 변환하여 반환한다.
		
		// toArray(new 제네릭타입[0]) ==> 제네릭타입의 배열로 변환한다.
		
		Object[] strArr = list2.toArray();
		//String[] strArr2 = (String[])list2.toArray(); // 이런식의 형변환은 안된다.
		
		String[] strArr2 = list2.toArray(new String[0]);
		for(String s : strArr2) {
			System.out.println("형변환 한것 : " + s);
		}
		
		
		System.out.println("list2의 사이즈 : " + list2.size());
		System.out.println("배열의 개수 : " + strArr.length);
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(i + "번째 : " + strArr[i]);
		}
		
	}
}
