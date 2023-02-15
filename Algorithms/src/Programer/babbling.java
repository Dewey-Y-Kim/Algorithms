package Programer;

public class babbling {
    public int solution(String[] babbling) {
    	int answer = 0;
    	
    	for(String str:babbling) {
    		int i=0;
    		boolean check=true;
    		do {
    			System.out.println(str==str.substring(i,i+3));
    			
    			if(i+2<=str.length()&&(str.substring(i,i+2).equals("ye")||str.substring(i,i+2).equals("ma"))) {
    				i+=2; 
    				check=true;
    				if(i==str.length()) break;
    			}else if(i+3<=str.length()&&(str.substring(i,i+3).equals("aya")||str.substring(i,i+3).equals("woo"))) {
    				i+=3;
    				check=true;
    				if(i==str.length()) break;
    			}else {
    				check=false;
    				break;
    			}
    		}while(i<babbling.length);
    		if (check) answer++;
    	}
        return answer;
	}
   public static void main(String[] args) {
	   /*
	    *  "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음만 
	    *  문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return
	    *  1 ≤ babbling의 길이 ≤ 100
	    *  1 ≤ babbling[i]의 길이 ≤ 15
	    *  babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
	    *  즉, 각 문자열의 가능한 모든 부분 문자열 중에서 "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
	    *  문자열은 알파벳 소문자로만 이루어져 있습니다.
	    */
    	String s[]={"aya", "yee", "u", "maa", "wyeoo"};
    	
    	System.out.println(new babbling().solution(s));
    }
}