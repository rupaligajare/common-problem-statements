package persistent;

import java.util.Scanner;

public class MissingNumInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {1,2,3,4,6};
			int n=arr.length+1;
			int sum=(n*(n+1))/2;
			for(int num:arr) {
				sum=sum-num;
			}
		System.out.println(sum);
	}

	



}
