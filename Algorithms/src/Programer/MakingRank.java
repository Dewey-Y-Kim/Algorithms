package Programer;

public class MakingRank {

	public MakingRank() {
		// TODO Auto-generated constructor stub
	}
	class Solution {
	    public int[] solution(int[][] score) {
	        int[] answer = new int[score.length];
	        int[] scoSum = new int[score.length];
	        for(int i =0; i<score.length; i++) {
	        	scoSum[i]=score[i][0]+score[i][1];
	        }
	        for(int i=0; i<score.length; i++) {
	        	answer[i]++;
	        	
	        	for(int j=0; j<score.length; j++) {
	        		if(scoSum[i]>scoSum[j]) {
	        			answer[j]++;
	        		}
	        	}
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
