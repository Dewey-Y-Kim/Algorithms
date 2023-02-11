package Solution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
/*1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기*/
import java.util.Scanner;

public class Solution1204 {

	
	public static void main(String[] args) throws FileNotFoundException{
		//데이터가져오기
		System.setIn(new FileInputStream("src/test02/ex/sw/input1204.txt"));
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();// 문제수
		
		for(int i=1; i<=t; i++) {
			int n = s.nextInt();
			int arr[] = new int[101];// 점수의 갯수 0~100점까지 이므로 점수를 index로 사용한다.
			for(int j=1; j<=1000; j++) {// 1그룹에 점수 1000개이므로
				arr[s.nextInt()]++; 
			}
			//
			// 첫번째 index -> 0점
			int maxIdx = 0;
			for(int idx=1; idx<arr.length; idx++) { // 1,2,3........100
				if(arr[maxIdx] <= arr[idx]) {
					maxIdx = idx;
				}
			}
			System.out.println("#"+n+" "+maxIdx);
			System.out.println(Arrays.toString(arr));			
		}
	}
}
