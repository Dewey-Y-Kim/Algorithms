package Programer;

public class StrangeSort {

	public StrangeSort() {
		// TODO Auto-generated constructor stub
	}
	public int[] solution(int[] arr,int n) {
		int min=0;
		int answer[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((Math.abs(arr[min]-n))>(Math.abs(arr[j]-n))) {
					min =j;
					}
				}			
			if(min!=i) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			min=i+1;
		}
		for (int i=1;i<arr.length;i++) {
			if(Math.abs(arr[i-1]-n)==Math.abs(arr[i]-n) && arr[i]>arr[i-1]) {
				int temp= arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return
		int[] arr=new StrangeSort().solution(arr,4);
		System.out.println();
		for (int i: arr) {
			System.out.print(i+"  ");
		}
	}

}
