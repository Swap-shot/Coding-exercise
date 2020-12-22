
package naturalno;

import java.util.Scanner;

public class NaturalNo {


    public static void main(String[] args) {
     int i, n;
     Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        n = sc.nextInt();
        i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
    
}
