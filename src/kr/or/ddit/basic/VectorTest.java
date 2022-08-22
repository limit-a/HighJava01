package kr.or.ddit.basic;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		
		// Vector 객체 생성  ( 과거의 List ) 
		Vector v1 = new Vector();
		
		System.out.println("처음 크기 : " + v1.size());
		
		// 1.  데이터 추가   : add(추가할데이터)
		// 반환값 : 추가 성공(true), 실패(false)
		
		v1.add("aaaa");
		v1.add(new Integer(111));
		v1.add(123); // auto - boxing 
		v1.add('a');
		v1.add(true);
		boolean r = v1.add(3.14);
		
		System.out.println("현재 크기 : "+ v1.size());
		System.out.println("반환값 : " + r );
		
		// 데이터 추가 : addElement(추가할 데이터) 
		//  ==> 이전 버젼의 프로그램에서도 사용할 수 있도록 하기 위해 남아 있는 메서드
		
		v1.addElement("CCC");
		System.out.println("v1 =>" + v1);
		
		// 데이터 추가  : add(index, 데이터)
		// ==> 'index'번째에 '데이터'를 끼워 넣는다.
		// ==> 'index' 는 0부터 시작하고 반환값은 없다. !
		
		v1.add(1, "kkk");
		System.out.println("v1 =>" + v1);
		
		// 2. 데이터 꺼내오기  : get(index) 
		//  ==> 'index'번째의 데이터를 꺼내온다.
		
		//Integer aa = (Integer)v1.get(2);
		//int data = aa.intValue();  // wrapper class에서 꺼내와라  
		int data = (int)v1.get(2);
		System.out.println("2번 째 data = " + data);
		
		
		
		// 3. 데이터 수정  : set(index, 새로운 데이터)
		// ==> 'index'번째 데이터를 '새로운데이터'로 덮어쓴다.
		// ==> 반환값 : 변경되기 전의 원래의 데이터 
		
		String temp = (String)v1.set(0, "zzzz");
		System.out.println("v1 =>" + v1);
		System.out.println("원래의 데이터: " + temp);
		
		// 4. 데이터 삭제 : remove(index) 
		// ==> 'index'번째의 데이터를 삭제한다.
		// ==> 반환값  : 삭제된 데이터
		
		 v1.remove(0);
		 System.out.println("삭제 후 :" + v1);
		
		temp = (String)v1.remove(0);
		System.out.println("삭제된 자료: " + temp);
		System.out.println("삭제 후 :" + v1);
		
		
		//auto-boxing, auto-unboxing
		// 데이터 삭제 : remove(삭제할데이터)
		// ==> '삭제할데이터'를 찾아서 삭제 
		// ==> '삭제할데이터'가 여러개이면 앞에부터 삭제된다.
		// ==> 반환값 : 삭제성공(true), 삭제실패(false)
		// ==> '삭제할데이터'가 '정수형'이거나 'char'형일 경우에는 반드시 객체형으로 변환해서 사용  
		
		v1.remove("ccc");
		System.out.println("삭제 후 : " + v1);
		
		
		//v1.remove(new Integer(123));
		v1.remove((Object)123);
		System.out.println("삭제 후 :" + v1);
		
		v1.remove(new Character('a'));
		System.out.println("삭제 후 :" + v1);
		
		v1.remove(true);
		System.out.println("삭제 후 :" + v1);
		
		v1.remove(3.14);
		System.out.println("삭제 후 :" + v1);
		
		//--------------------------------------------------------------
		
		
		/*
		 *   제네릭 타입(Generic Type) ==> 클래스 내부에서 사용할 데이터의 타입을 
		 *   외부에서 지정하는 기법으로 객체 선언할 때 <> 안에 그 객체의 내부에서
		 *   사용할 데이터의 타입을 정해주는 것. 
		 *   이런식으로 선언하게 되면 그 지정한 데이터 타입 이외의 다른 데이터를 
		 *   저장할 수 없다.
		 *    
		 *   이 때 제네릭으로 선언할 수 있는 데이터 타입은 '클래스형' 
		 *    Integer, Boolean, Character  
		 *    
		 *    
		 *    제네릭 타입으로 선언하게 되면 데이터를 꺼내올 때 별도의 형변환이 필요없다.
		 *  
		 */
		
		Vector<Integer> v2 = new Vector<>(); // int형만 저장할 수 있는 벡터
		Vector<String> v3 = new Vector<>();  // String 형만 저장할 수 있는 벡터 
		
		v3.add("안녕하세요");
		//v3.add(123);  // 오류 : 다른 종류의 데이터를 저장할 수 없다.
		
		String temp2 = v3.get(0);

		
		Vector<Vector> vv = new Vector<Vector>();
		
		Vector<Vector<Vector>> vvv = new Vector<Vector<Vector>>();
		
		
		System.out.println("------------------------------------------------");
		
		
		v3.clear(); // 전체 데이터 삭제하기 
		System.out.println("v3의 size : " + v3.size());
		
		v3.add("AAAA");
		v3.add("BBBB");
		v3.add("CCCC");
		v3.add("DDDD");
		v3.add("EEEE");
		
		Vector<String> v4 = new Vector<String>();
		v4.add("BBBB");
		v4.add("EEEE");
		
		System.out.println("v3 => " + v3);
		
		// 데이터 삭제 : removeAll(Collection 객체)
		//  ==> 'Collection객체'가 가지고 있는 데이터를 모두 삭제한다.
		//  ==> 반환값 : 성공(true) , 실패(false)
		
		v3.removeAll(v4);  // v3 삭제 할껀데  v4에 있는거 삭제
		
		System.out.println("v3 => " + v3);
		System.out.println("------------------------------------------");
		
		v3.clear();
		
		v3.add("AAAA");
		v3.add("BBBB");
		v3.add("CCCC");
		v3.add("DDDD");
		v3.add("EEEE");
		
		// 벡터의 데이터를 순서대로 모두 가져와 사용하고 싶으면 반복문을 사용 
		// 주로 for문 사용 
		for(int i = 0 ; i < v3.size(); i++) {
			System.out.println(i+"번째 자료 : " + v3.get(i));
		}
		
		for(String s : v3) {
			System.out.println(s);
		}
		
		
	}
}
