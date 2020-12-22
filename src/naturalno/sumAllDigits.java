
package naturalno;

import java.util.Scanner;

public class sumAllDigits {
    public static void main(String[] args) {
     int sum=0, n;
     Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        n = sc.nextInt();
        while(n!=0){
            sum +=n%10;
            n /=10;
        }
        System.out.println("Sum of all digit : "+sum);
        sc.close();
    }
}
