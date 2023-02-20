package Programer;

public class finitenum {

	public finitenum() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int a, int b) {
        int answer = 0;
       b= b/rutine(a,b);
       b= removeFive(b);
       b= removeTwo(b);
       if(b!=1){
           return 2;
           } else {
           return 1;
       }
   }
   
   public int rutine(int a, int b) {
       if( a%b!=0) {
       	b=rutine(b,a%b);
       }
       return b;
   }
   
   public int removeFive(int b){
       if(b%5==0) {
           b=removeFive(b/5);
       }
       return b;
       
   }
   
   public int removeTwo(int b){
       if(b%2==0) {
           b=removeTwo(b/2);
       }
       return b;
       
   }
    public static void main(String[] args) {
    	int i= new finitenum().removeFive(75);
    	System.out.println(i);
    }

}
