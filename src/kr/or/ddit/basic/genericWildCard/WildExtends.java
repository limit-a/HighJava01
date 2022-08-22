package kr.or.ddit.basic.genericWildCard;

import java.util.ArrayList;
import java.util.List;

// Person 상속 x  클래스 
class Test{
	String name;
}

class Person {
	String name;
	
	
	
}

class Man extends Person{
  
	Man(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}

class Woman extends Person{
	
	 Woman(String name) {
		this.name = name;
	}
	
	 @Override
		public String toString() {
			return name;
		}
		
}




public class WildExtends {
	public static void main(String[] args) {
		

		List<Person> listP = new ArrayList<>();
		listP.add(new Person());
		
		
		printData(listP);
		
		
		List<Man> listM = new ArrayList<Man>();
		listM.add(new Man("이순신"));
		listM.add(new Man("이명박"));
		listM.add(new Man("안현수"));
		
		printData(listM);
		
		List<Woman> listW = new ArrayList<Woman>();
		listW.add(new Woman("김지수"));
		listW.add(new Woman("백예린"));
		listW.add(new Woman("아이유"));
		
		printData(listW);
		
		
		List<Test> listT = new ArrayList<>();
		listT.add(new Test());
		//printData(listT);  상속이 안되서 접근 불가
		
	}

	// Person 상속 받은 놈만 접근하는 와일드 카드 
	private static void printData(List<? extends Person> list) {
		
		for(Person obj : list) {
			System.out.println(obj);
		}
		
	}
		
	
}
