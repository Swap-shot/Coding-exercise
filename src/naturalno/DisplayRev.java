/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naturalno;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DisplayRev {
      public static void main(String[] args) {
     int rev=0, n;
     Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        n = sc.nextInt();
        while(n!=0){
            rev = rev*10 + n%10;
            n /=10;
        }
         while(rev!=0){
             System.out.print(rev%10+" ");
            rev /=10;
        }
        sc.close();
    }   
}
