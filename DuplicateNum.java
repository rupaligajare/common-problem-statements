package persistent;
import java.util.Scanner;

public class DuplicateNum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		int result[]=new int[2];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//Arrays.sort(arr);
		int index=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					i++;
				}
				else {
					result [index++]=arr[i]; 
			}
				
			}	
			System.out.println(result[index]);
	    }
	}
	}	
	
	
	

//	public static void main(String args[]) {
//		int arr[]= {1,2,3,4,2};
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]==arr[i+1]) {
//				System.out.print(arr[i]);
//			}
//		}
//	}
//}

