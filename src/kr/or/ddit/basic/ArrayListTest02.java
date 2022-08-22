package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *   문제 ) 5명의 사람 이름을 입력받아 ArrayList에 추가한 후에 
 *         이들중 '김' 씨 성의 이름을 모두 출력하시오.
 * 			입력은 Scanner 
 * 
 */


public class ArrayListTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listn = new ArrayList<>();
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("이름을 입력하세여 >>");
			String name = sc.nextLine();
			listn.add(name);
		}
		
		//방법 1
		for(int i = 0; i < listn.size(); i++) {
			if(listn.get(i).startsWith("김")) {
				System.out.println(listn.get(i));
			}
		}
		System.out.println("===========================");
		
		// 방법 2
		for(String name : listn) {
			if(name.indexOf("김") == 0) {
				System.out.println(name);
			}
		}
		
		System.out.println("===========================");
		
		// 방법 3 
		for(int i = 0 ; i < listn.size(); i++) {
			String temp = listn.get(i);
			if(temp.charAt(0) == '김') {
				System.out.println(temp);
			}
		}
		System.out.println("============================");
		
		// 방법 4
		for(int i = 0 ; i < listn.size(); i++) {
			String temp = listn.get(i);
				if(temp.substring(0, 1).equals("김")) {
					System.out.println(temp);
				}
			}
		
		
	}
}
