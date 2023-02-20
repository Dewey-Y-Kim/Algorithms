package Programer;

public class Oxquiz {

	public Oxquiz() {
		// TODO Auto-generated constructor stub
	}
	public String[] Solution(String[] quiz) {
		String[] answer=new String[quiz.length];
		for (int i=0;i<answer.length;i++) {
			String str[]= quiz[i].split(" ");
			int sum=0; 
			sum+=Integer.parseInt(str[0]);
			for (int j=2; j<str.length;j+=2) {
				if (str[j-1].equals("=")) {
					break;
				}else {
					if(str[j-1].equals("+")) {
						sum+=Integer.parseInt(str[j]);
					} else {
						sum-=Integer.parseInt(str[j]);
					}
				}
				
			}
			if(sum == Integer.parseInt(str[str.length-1])) {
				answer[i]="O";
			} else {
				answer[i]="X";
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		/*
		* 연산 기호와 숫자 사이는 항상 하나의 공백이 존재합니다. 단 음수를 표시하는 마이너스 기호와 숫자 사이에는 공백이 존재하지 않습니다.
		* 1 ≤ quiz의 길이 ≤ 10
		* X, Y, Z는 각각 0부터 9까지 숫자로 이루어진 정수를 의미하며, 각 숫자의 맨 앞에 마이너스 기호가 하나 있을 수 있고 이는 음수를 의미합니다.
		* X, Y, Z는 0을 제외하고는 0으로 시작하지 않습니다.
		* -10,000 ≤ X, Y ≤ 10,000
		* -20,000 ≤ Z ≤ 20,000
		* [연산자]는 + 와 - 중 하나입니다.
		*/
		String quiz[]=	{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		quiz=(new Oxquiz().Solution(quiz));
		for (String str:quiz) {
			System.out.println(str);
		}
	}

}
