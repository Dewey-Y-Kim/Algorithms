package Programer;

public class AddingBinery {

	class Solution {
		
		    public String solution(String bin1, String bin2) {
			    	String solution="";
			    	String[] num1= new String[bin1.length()];
			    	String[] num2= new String[bin2.length()];
			    	String[] sol = new String[num1.length+1];
			    	num1=bin1.split("");
			    	num2=bin2.split("");
			    	for(int i =bin1.length()-1;i>=1;i--) {
			    		if(num1[i].equals(num2[i])){
		                    if(num1[i].equals("1")){
		                        sol[i+1]="c";
		                    }else{ sol[i+1]="0";}
		                }else{ sol[i+1]="1";}
			    	}
			    	for(int i=num1.length; i>=1; i--) {
			    		if(sol[i]=="c") {
			    			if(num1[i].equals(num2[i])){
		                    if(num1[i].equals("1")){
		                        sol[i]="c";
		                        }else{ sol[i]="0";}
		                    }else{ sol[i]="1";}
			    		}
			    	}
			    	if(sol[0]=="0") {
			    		for(int i=1;i<sol.length;i++) {
			    			solution+=sol[i];
			    		}
			    	}else {
			    		for(String str : sol) {
			    			solution+=str;
			    		}
			    	}
			    	return solution;
			    }
		}   
	
	public String setnum(String bin, int num){//자리수 맞추기위해 앞에 0추가
		String str = "";
		for (int i=0;i<num;i++){
			str+="0";
		}
		str+=bin;
		return str;
	}
}
	