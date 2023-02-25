package Programer;

import java.util.Arrays;

public class Skillcheck {
	public Skillcheck() {}
	public String skillCheck(String s) {
		char[] ch= s.toCharArray();
		Arrays.sort(ch);
		StringBuilder str=new StringBuilder();
		
		return str.append(ch).reverse().toString();
	}
	public static void main(String[] args) {
		System.out.print(new Skillcheck().skillCheck("Zbcdefg"));
	}
}
