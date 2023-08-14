package persistent;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		char ch;
		String str= "Rupali",nstr="";
		for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
		nstr=ch+nstr;
	
		}
		System.out.println(nstr);
		

	}

}
