package Multi;

import java.util.Arrays;
import java.util.Collections;

public class TwoArrays_SwichN {

	public TwoArrays_SwichN() {
		// There are two arrays-A and B. Each array is consist of N`s Intteger elements. it works swich element for Maximum K. There is N K ,and array A and B.
		// It will return Maximum Sum of A`s elements
	}
	public int swichN(Integer[] a, Integer[] b, int k) {
		Arrays.sort(a);
		Arrays.sort( b, Collections.reverseOrder()); //Colection은 래핑클래스만 사용가능.
		
		for(int i=0;i<k;i++) {
			if (a[i]<b[i]) {
				int temp=a[i];
				a[i]=b[i];
				b[i]=temp;
			}else {
				break; // 횟수 절약을 위해
			}
		}
		int result=0;
		for(int i:a) {
			result+=i;
		}
		return result;
	}
	
	public static void main() {
		
	}
}
