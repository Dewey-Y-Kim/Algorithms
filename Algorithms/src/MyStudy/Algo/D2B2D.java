package MyStudy.Algo;

import java.util.ArrayList;
import java.util.List;

public class D2B2D {
	List<Integer> decimal = new  ArrayList<>();
	public D2B2D() {
		
	}
	public int d2b(String s) {
		int n=0;
		for(int i=0; i<s.length(); i++) {
			n= convertd2b(i,s.charAt(s.length()-i-1));
		}
		return n;
	}
	public int convertd2b(int i, int num) {

		if(i>0) num = convertd2b(i+1,num*2);
		
		return num;
	}
	public static void main(String[] args) {
		System.out.print(new D2B2D().d2b("1"));
		
	}

}
