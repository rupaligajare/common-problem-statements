package persistent;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
	}
		
		int[] reversedArray=new int[n];
		for(int i=0;i<n;i++) {
			reversedArray[i]=arr[n-1-i];
			
	}
		System.out.println("reversed array");
		for(int i=0;i<n;i++) {
		System.out.println(reversedArray[i]);
		
	}
}
	
}
