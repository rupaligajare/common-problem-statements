package persistent;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		       Scanner sc=new Scanner(System.in);
		       System.out.println("Enter the value for fibonacci: ");
		        int n=sc.nextInt();
		        int a=0,b=1,c;
		        for(int i=2;i<=n;i++){
		            c=a+b;    // 0a 1b 1c   c=a+b   
		            a=b;
		            b=c;
		            System.out.println(c);
		        }   
		        
  }

}
