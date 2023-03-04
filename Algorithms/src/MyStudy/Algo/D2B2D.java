package MyStudy.Algo;

import java.util.ArrayList;
import java.util.List;

public class D2B2D {
	List<Integer> decimal = new  ArrayList<>();
	public D2B2D() {
		
	}
	public int b2D(String s) { //2진수를 10진수로
		int n=0;
		int[] num= new int[s.length()+1];
		num[0]=0;
		String str[] = s.split("");
		for(int i=0; i<s.length();i++) {
			num[i+1]=Integer.parseInt(str[i]);
		}
		for(int i=0; i<s.length(); i++) {
			n+=convertd2b(i,num[num.length-i-1]);
		}
		return n;
	}
	public int convertd2b(int n, int num) {

		if(n>0) num = convertd2b(n-1,num*2);
		
		return num;
	}
	public String d2B(int n) { //10진수를 2진수로
		List<Integer> num= new ArrayList<>();
		for(int i=1;Math.pow(2, i)<n;i++) {
			num.add(n%(int)Math.pow(2,i));
		}
		String answer="";
		for(int i=num.size()-1;i>=0;i--) {
			answer+=num.get(i);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(new D2B2D().b2D("1111"));
		System.out.printf("%d -> %S",10,new D2B2D().d2B(10));
		
	}

}
