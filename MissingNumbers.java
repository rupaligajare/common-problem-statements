package persistent;

import java.util.Arrays;

public class MissingNumbers {

		static void printMissingElements(int arr[],int N)
{
int diff = arr[0];
for(int i=0;i<N;i++) {
	if(arr[i]-i != diff) {
		while(diff < arr[i]-1) {
			System.out.println(i + diff+ " ");
			diff++;
		}
	}
}
}
public static void main(String args[]) {
	int arr[]= {1,2,3,5,7,9};
	int N=arr.length;
	printMissingElements(arr,N);
}
}

