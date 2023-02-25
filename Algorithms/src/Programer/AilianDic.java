package Programer;

public class AilianDic {

	public AilianDic() {
		// TODO Auto-generated constructor stub
	}
	 public int solution(String[] spell, String[] dic) {
	        int answer = 2;
	        boolean result=false;
	        for(String check :dic) {
	        	for (String str:spell) {
	        		if(check.indexOf(str)>=0&&check.indexOf(str)==check.lastIndexOf(str)) {
	        			result=true;
	        		} else {
	        			result=false;
	        			break;
	        		}
	        	}
	        	if(result) {
	        		answer=1;
	        	}
	        	System.out.print(check+"\t"+result+"\n");
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dic= {"moos", "dzx", "smm", "sunmmo", "som"};
		String[] spell= {"s", "o", "m", "d"};
		new AilianDic().solution(spell,dic);
		
	}

}
