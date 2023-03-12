package Backjoon;

import java.util.Scanner;
public class Back1002{
    public static void main(String Args[]){
    	Scanner sc = new Scanner(System.in);
    	int loop=Integer.parseInt(sc.nextLine());
    	for(int idx=0;idx<loop;idx++) {
    		String line;
    		line= sc.nextLine();
    		String[] string= line.split(" ");
    		double[] p=new double[string.length+1];
    		for(int i=0; i<string.length;i++) {
    			p[i+1]=Double.parseDouble(string[i]);
    		}
    		double distance = Math.sqrt(Math.pow((p[1]-p[4]),2)+Math.pow((p[2]-p[4]),2));
    		double max = Math.max(p[3], p[6]);
    		double min = Math.min(p[3], p[6]);
    		System.out.println(distance+"//"+max+"//"+min);
    		int answer;
    		if (distance == max-min|| distance==max+min) {
    			answer=1;
    		}else if(distance>max+min|| (distance==0&&max!=min)) {
    			answer=0;
    		}else if(distance<max+min) {
    			answer=2;
    		}else { 
    			answer=-1;
    		}
    		System.out.println(answer);
    	}
    }
}
/*
3
0 0 13 40 0 37
0 0 3 0 7 4
1 1 1 1 1 5
*/
