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
public class CountNo {
     public static void main(String[] args) {
     int count=0, n;
     Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        n = sc.nextInt();
        while(n!=0){
            count++;
            n /=10;
        }
        System.out.println("total count : "+count);
        sc.close();
    }
    
}
