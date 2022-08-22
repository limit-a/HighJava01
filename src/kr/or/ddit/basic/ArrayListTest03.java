package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 *    문제1) 5명의 별명을 입력받아 ArrayList에 추가한 후 이들 중 
 *    별명의 길이가 제일 긴 별명을 출력하시오. 
 *    (단, 각 별명의 길이는 모두 다르게 입력한다.)
 * 
 *    문제2) 문제1에서 별명의 길이가 같은 것을 입력하는 조건으로 변경되었을 때 
 *   		 결과를 출력하시오.
 * 
 */
public class ArrayListTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 ArrayList<String> nickNames = new ArrayList<>();
		
		 for(int i = 0 ; i < 5; i++) {
			 System.out.print("별명을 입력하세요>>");
			 String nick = sc.nextLine();
			 nickNames.add(nick);
		 }
		 String tmp = "";
		 for(int i = 0; i < nickNames.size(); i++) {
			 if(tmp.length() < nickNames.get(i).length()) {
				 tmp = nickNames.get(i);
			 }
		 }
		 
		 System.out.println("가장 긴 별명 : " + tmp);
	}
}
