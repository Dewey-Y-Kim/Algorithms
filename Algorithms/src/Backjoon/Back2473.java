package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Back2473 {

	public static void main(String[] args) {
		/*
		 * 산성 용액의 특성값은 1부터 1,000,000,000까지의 양의 정수로 나타내고, 알칼리성 용액의 특성값은 -1부터 -1,000,000,000까지의 음의 정수로 나타낸다.
		 * 같은 양의 세 가지 용액을 혼합한 용액의 특성값은 혼합에 사용된 각 용액의 특성값의 합으로 정의
		 * 특성값이 0에 가장 가까운 용액을 만들어내는 세 용액을 찾는 프로그램을 작성
		 * 출력해야하는 세 용액은 특성값의 오름차순으로 출력
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int[] list=new int[num];
		for(int i=0;i<num;i++) {
			list[i]=sc.nextInt();
		}
		int s=0,e=0;
		Arrays.sort(list);
		int min=0;
		for(int i=0;i<num;i++) {
			if (list.length==3||list[0]>0){ System.out.println(0+" "+1+" "+2); break;}
			if(list[num-1]<0) {System.out.println((num-3)+" "+(num-2)+" "+(num-1));break;}
			if(s==i) {s++;}
			if(e==i) {e++;}
			if(e==s) {e++;}
			
		}
	}
}	

/*
public class Main{
	public static void main(String args[]){
		
	}
} */