package persistent;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;	//MIN_VALUE= -2147483648
		int[] arr=new int[5];
		System.out.println("Enter 5 elements of an array: ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();  
			if(arr[i]>max) {
			secondMax=max;
			max=arr[i];
			}
			else if(arr[i]>secondMax && arr[i] != max) {
				System.out.println("Second maximum number is: ");
			}
		
	}			
		System.out.println(secondMax);
																		
	}
}
