package persistent;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to compare");
		int num=sc.nextInt();
		System.out.println("Enter the size of elements");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=0;i<size;j++) {
				arr[j]=arr[i+1];
				if(arr[i]+arr[j]==num) {
					System.out.println(num);
				}
			}
			
		}
	
		
  }
}
