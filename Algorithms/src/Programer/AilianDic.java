package Programer;

import java.util.Arrays;

public class AilianDic {

	public AilianDic() {
		// TODO Auto-generated constructor stub
	}
	public int solution(String[] spell, String[] dic) {
		String word="";
		int answer =0;
		for(String str : spell) {
			word+=str;
		}
		for(String str:dic) {
			String[] dictionary = str.split("");
			boolean result=true;
			for (String s : dictionary) {
				int i=0;
				if(word.indexOf(s)<0){
					result=false;
				}
			}
			if(result) {
				answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dic= {"moos", "dzx", "smm", "sunmmo", "som"};
		String[] spell= {"s", "o", "m", "d"};
		
		System.out.println(new AilianDic().solution(spell,dic));
		
	}

}
