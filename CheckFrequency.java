package persistent;
import java.util.Arrays;

public class CheckFrequency {

	
	    public static void main(String[] args) {
	        int arr[] = {1, 2, 3, 21, 2, 30, 1, 2};
	        
	        int n = arr.length;
	        boolean visited[] = new boolean[n];
	        
	        for (int i = 0; i < n; i++) {
	            if (visited[i]) {
	                continue; // Skip if element already counted
	            }
	            
	            int count = 1;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    visited[j] = true;
	                    count++;
	                }
	            }
	            
	            System.out.println("Element " + arr[i] + " frequency: " + count);
	        }
	    }
}
