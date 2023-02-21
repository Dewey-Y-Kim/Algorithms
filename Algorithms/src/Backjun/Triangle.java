package Backjun;

public class Triangle {

	public Triangle() {
		/*과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
		 * 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
		 * 
		 * 입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
		 * 각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
		 * 출력 : 각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
		 */
	}
	public String[] triangle(int[][] triangle) {
		String[] result= new String[triangle.length];
		for(int i=0; i<triangle.length; i++) {
			int max=0;
			if (triangle[i][0]>triangle[i][1]) { max=0;} else {max=1;}
			if (triangle[i][2]>triangle[i][max]) {max =2;}
			int sum=0;
			for (int j=0; j<3; j++) {
				if(j!=max) { sum+= triangle[i][j]*triangle[i][j];} 
			}
			if(sum*sum== sum) {result[i]="right";} else {result[i]="wrong";}
		}
		return result;
	}

}
