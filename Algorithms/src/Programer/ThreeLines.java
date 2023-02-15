package Programer;

public class ThreeLines {

	public ThreeLines() {
		// TODO Auto-generated constructor stub
	}
	public int Solution(int[][] lines) {
		int answer=0;
		int min=lines[0][0];
		int max=lines[0][1];
		for(int i=1; i<3;i++) {
			if(lines[i][0]<min) min=lines[i][0];
			if(lines[i][1]>max) max=lines[i][1];
		}
		for(double i=min+.5;i<=max;i++) {
			boolean a=false, b=false, c=false;
			if(lines[0][0]<=i && lines[0][1]>=i) {a=true;}
			if(lines[1][0]<=i && lines[1][1]>=i) {b= true;}
			if(lines[2][0]<=i && lines[2][1]>=i) {c= true;}
			if ((a&b)||(b&c)||(a&c)) answer++;
			System.out.println(i+":"+a+"\t"+b+"\t"+c+"\n");
		}
		return answer;
	}
	public static void main(String[] args) {
		// 선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return
		int[][] i= {{0, 5}, {3, 9}, {1, 10}};
		System.out.println(new ThreeLines().Solution(i));
		
	}

}
