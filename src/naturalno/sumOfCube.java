/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naturalno;

import java.util.*;

/**
 *
 * @author user
 */
public class sumOfCube {
     public static void main(String[] args) {
     int sum=0, n;
    Scanner sc = new Scanner(System.in);
       System.out.println("enter value of n");
        n = Integer.parseInt(sc.nextLine());
        while(n!=0){
            sum = sum+(n%10)*(n%10)*(n%10);
            n /=10;
        }
        System.out.println("Sum of all digit : "+sum);
       sc.close();
    }
}
