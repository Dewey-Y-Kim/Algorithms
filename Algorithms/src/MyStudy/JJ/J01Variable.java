package MyStudy.JJ;

import java.util.Scanner;

public class J01Variable {
	
	public J01Variable() {
		// TODO Auto-generated constructor stub
	}
	int num=1;
	public void method(int num) {
		System.out.println(num+"//"+this.num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new J01Variable().method(2);
		J01Variable j01= new J01Variable();
		j01.method(3);
		System.out.println(Math.PI);
		System.out.println((float)Math.PI);
		
		System.out.println(2+3+"s");
		System.out.println("s"+2+3);
		System.out.printf("%b\t %d \t%o \t%x \t%f \t %e \t %c \t %s\n",
						  true,1000,1000,1000,1000.10,1e2f,'a',"asbd");
		
		Scanner sc = new Scanner(System.in);
		// int i= sc.nextInt();
		// System.out.println(i);
		
		int num =Integer.parseInt((Integer.toBinaryString(25)),2);
		String number= Integer.toBinaryString(25);
		System.out.println("num="+num);	
		System.out.println("num2Binary="+number);
	}

}
