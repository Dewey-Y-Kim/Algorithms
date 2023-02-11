package Programer;

public class NextNum {

	public NextNum() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int[] com) {
        int answer;
        if(com[com.length-1]-com[com.length-2]==com[com.length-2]-com[com.length-3]) {
        	answer= com[com.length-1]+com[1]-com[0];
        } else {
        	
        	answer= com[com.length-1]/com[0]*com[1];
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
