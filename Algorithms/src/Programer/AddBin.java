package Programer;

public class AddBin {

	public AddBin() {}
	public String solution(String bin1, String bin2) {
		// 편법 말고 정법 준비중
		String answer="";
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
		boolean result=true;
		for (int i=sol.length-1;i>0;i++) {
			if(sol[i].equals("c")){
				sol[i]="1";
				if(sol[i-1].equals("0")) {sol[i-1]="1";}
				{else if(sol[i-1].equals("1")){sol[i-1]="c";}
				
			}
		}
		
		return answer;
	}
	
	public String solution2(String bin1, String bin2) {
		Integer i=Integer.parseInt(bin1,2);
		Integer j=Integer.parseInt(bin2,2);
		String answer=Integer.toBinaryString(i+j);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(new AddBin().solution("1001", "1111"));
	}
}

	