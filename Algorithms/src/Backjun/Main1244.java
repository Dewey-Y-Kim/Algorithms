package Backjun;

import java.util.Scanner;

// 백준 1244 스위치
public class Main1244 {
	static Scanner scan = new Scanner(System.in);
	static int arr[];
	//남학생일때           부여받은 스위치 번호
	static void man(int swNum) {
		for(int i=swNum ; i<arr.length; i+=swNum ) {// 3,6
			arr[i] ^= 1; // arr[i] = arr[i] ^ 1;
		}
	}
	//여학생일때
	static void woman(int swNum) {
		int left = swNum - 1; // 2
		int right = swNum + 1; // 4
		
		while(true) {
			//break걸려야 하는 경우
			// 1. left가 1보다 작다.
			// 2. right가 배열의 길이보다 크거나 같으면
			// 3. left위치의 값과 right위치의 값이 다르면 좌우 스위치가 대칭인지 확인할 필요없다.
 			if(left<1 || right >= arr.length) break;
 			if(arr[left] != arr[right]) break;
 			// left위치의 값과 right위치의 값이 대칭일 경우 index증감
 			left--;
 			right++;
		}
		//left++;
		//right--;
		//스위치 교환
		for(int i=left+1;i<=right-1; i++) {
			arr[i] ^= 1;
		}
	}
	//출력
	static void switchPrint() {
		for(int i=1; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(i%20==0) System.out.println();
		}
	}
	public static void main(String[] args) {
		// 스위치 갯수입력
		int n = scan.nextInt() + 1;  //
		// 스위치 상태를 저장할 배열 객체 생성
		arr = new int[n];
		// 스위치 상태 입력
		for(int i=1; i<n; i++) {// 1,2,3,4,5,6,7,8
			arr[i] = scan.nextInt();
		}
		
		// 학생수
		int stu = scan.nextInt();
		
		for(int s=1; s<=stu; s++) {
			int gender = scan.nextInt();//성별
			int swNum = scan.nextInt();//스위치번호
			
			if(gender==1)
				man(swNum);
			else if(gender==2)
				woman(swNum);			
		}	
		switchPrint();		
	}
}
