package persistent;

public class LargestNum {

	public static void main(String[] args) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		int arr[]= {1,2,4,90,34,52};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		    if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum is: "+max);
		System.out.print("Minimum is: "+min);

	}

}
