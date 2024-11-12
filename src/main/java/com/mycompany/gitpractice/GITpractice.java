/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gitpractice;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class GITpractice {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Title: THE partern shit");
        System.out.print("Enter number: ");
        int num = s.nextInt();
        
        //all(num);
        upsidedown_triangle(num);
        
        
        System.out.println("shtshtshtsht");
        
        just_box(num);
        
    }
    public static void descending(int num){
        for(int i  = 1; i <= num ; i++){
            for(int j = num; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void ascending(int num){
        for(int i  = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void all(int num) {
        descending(num);
        ascending(num);
    }
    
    
    public static void upsidedown_triangle(int num){
        long startTime  = System.nanoTime();
        for (int i = 1; i <= num; i++){
            for (int j = num; j >= i; j--){
                System.out.print(" ");
            }
            
            for (int h = 1; h<=i; h++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        long duration = System.nanoTime() - startTime;

        System.out.println("Runtime: " + duration + " nanoseconds");
    }
    
    public static void just_box(int num){
        for(int i = 1; i<= num; i++){
            for (int j = 1; j<=num; j++){
                if (i==num || j == num || i==1|| j ==1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
