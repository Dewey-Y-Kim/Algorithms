package Programer;

import java.util.ArrayList;
import java.util.Collections;

public class PushWord {

	public PushWord() {
		// 미완
	}
	public int Solution(String A, String B) {
		int answer =0;
		int i;
		boolean result=false;
		for(i=0; i<A.length();i++) {
			result=(B.substring(i)+B.substring(0,i)).equals(A);
			if(result) {
				break;
			}
		}
		if (result) {
			if(2*i>A.length()) {
				answer=i-A.length();
			}else {
				answer=i;
			}
		} else {
			answer=-1;
		}
		return answer;
	}
	public int Solution2(String A,String B) {
		ArrayList<Character> str=new ArrayList<>();
		
		
		return 0;
	}
	public static void main(String[] args) {
		/*
		 *  문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 
		 *  이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 
		 *  최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
		 */
		Collections.rotate(null, 0);
		System.out.println(new PushWord().Solution("hello", "elloh"));	
		
	}

}