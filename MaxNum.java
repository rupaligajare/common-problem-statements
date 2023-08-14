package persistent;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Maximum number is: "+max);
		
	}

}













