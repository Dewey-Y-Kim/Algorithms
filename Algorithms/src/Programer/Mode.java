package Programer;

import java.util.Arrays;

public class Mode {

	public Mode() {
		// TODO Auto-generated constructor stub
		
	}
	public int solution(int[] array) {
		int answer = 0;
		int[] arr= new int[1000];
		for(int n:array){
			arr[n]++;
		}
		int max=0,sec =-1;
		for (int i=1;i<1000;i++) {
			if(arr[i]>=arr[max]) {
				sec=max;
				max=i;
			}
		}
		if(sec==-1){return max;} //두번째 큰 값이 없다는 경우 런타임에러 방지 및 최대값 리턴
		if(arr[max]!=arr[sec]) {
			answer=max;
		} else {
			answer= -1;
		}
		return answer;
	}
	

}
