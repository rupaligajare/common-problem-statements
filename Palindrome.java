package persistent;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		String str="rupa";
		String nstr="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			nstr=ch+nstr;
			
		}
		if(str.equals(nstr)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		}
	
}
