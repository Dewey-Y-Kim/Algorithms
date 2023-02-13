package Programer;

public class Hate3 {

	public Hate3() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int n) {
		int answer=0;
		for (int i=1;i<=n;i++) {
			answer++;
			if(answer%3==0||String.valueOf(answer).indexOf("3")>=0) {
				i--;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<=100;i++){
			System.out.println(i+"="+new Hate3().solution(i));
		}
	}

}
