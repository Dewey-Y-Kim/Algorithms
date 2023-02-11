package Programer;

public class polynomial {

	public polynomial() {
		// TODO Auto-generated constructor stub
	}
	dpublic String solution(String polynomial) {
	        polynomial=polynomial.replaceAll(" ","");
	        
	    	String[] position =polynomial.split("\\+");
	    	for(String str:position) {
	    	System.out.print(str+"\t");
	    	}
	    	int x=0, n=0;
	    	for(String str:position) {
	    		switch(str.indexOf("x")){
	    			case -1 : n+=Integer.parseInt(str); break;
	    			case 0: x++; break;
	    			default : x+=Integer.parseInt(str.substring(0, str.indexOf("x"))); break;
	    		}
	    	}
	        String answer="";
	    	if(n==0) {
	        	answer=String.valueOf(x);
	    	}else{
	    		answer=String.valueOf(x)+n;
	        }
	    	return answer;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="1234x";
		System.out.println(new polynomial().solution(x));
		System.out.println(1+x.substring(0,4));
	}

}
