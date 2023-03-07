package Programer;

public class babbling {

	public babbling() {
		/*
		 * 1 ≤ babbling의 길이 ≤ 100
		 * 1 ≤ babbling[i]의 길이 ≤ 15
		 * babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
		 * 즉, 각 문자열의 가능한 모든 부분 문자열 중에서 "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
		 * 문자열은 알파벳 소문자로만 이루어져 있습니다.
		 * ["aya", "yee", "u", "maa", "wyeoo"]	return : 1
		 * ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]	return : 3
		 */
	}
	public int solution(String[] babbling) {
		int i;
		int answer=0;		
		for(String str:babbling) {
			i=0;
			if(str.length()>2) {
				do {
					if(i+2<str.length()){
						if(str.substring(i, i+2).equals("ye")||str.substring(i, i+2).equals("ma")) {
							i+=2;
						}
					}else if(i+3<str.length()) {
						if(i+3<str.length() && str.substring(i, i+3).equals("woo")||str.substring(i, i+3).equals("aya")) {
							i+=3;
						}
					}
					if(i==str.length()) {
						answer++;
					}
				}while (i<str.length()-1);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		String[] srt = {"aya", "yee", "u", "maa", "wyeoo"};
		System.out.println(new babbling().solution(srt));
	}
}
