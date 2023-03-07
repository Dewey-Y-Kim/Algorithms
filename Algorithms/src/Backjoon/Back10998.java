package Backjoon;

import java.util.Scanner;
public class Back10998{
   
	public static void main(String Args[]){
		/*
		
        */
		Scanner sc= new Scanner(System.in);
		int loop= sc.nextInt();
		for (int idx=0; idx<loop; idx++) {
			String[] input= sc.nextLine().split(" ");
			double[] p =new double[input.length+1];
			for(int i=0;i<input.length;i++) {
				p[i+1]=Double.parseDouble(input[i]);
			}
			int answer=0;
			double distance= Math.sqrt(Math.pow(p[1]-p[4],2)+Math.pow(p[2]-p[5],2));
			double max= Math.max(p[3], p[6]);
			double min= Math.min(p[3], p[6]);
			if(max <distance+min) {
				answer =2;
			}else if(max>distance+min){
				answer=-1;
			}else {
				answer=1;
			}
			System.out.println(answer);
		}
		sc.close();
	}
}
    


