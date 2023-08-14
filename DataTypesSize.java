package persistent;

import java.util.Scanner;

public class DataTypesSize {

    public static int dataTypes(String type) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        if(str=="Integer" || str=="Float"){
            System.out.print("4");
        }
        else if(str=="Long" || str=="Double"){
            System.out.print("8");
        }
        else if(str=="Character"){
            System.out.print("1");
        }
        else{
             return -1;
        }
        
        return 0;

    }

}
