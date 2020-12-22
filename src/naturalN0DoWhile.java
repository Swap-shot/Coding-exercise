
import java.util.Scanner;

 
public class naturalN0DoWhile {
    public static void main(String[] args) {
     int i, n;
     Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        n = sc.nextInt();
        i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=n);
        sc.close();
    }
}
