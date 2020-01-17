/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaex;

/**	
 *	
 * @author Hamdan	
 */

import java.util.Scanner;

public class JavaEx {
    
    
    public static void main(String[] args) {
        //average();
        //checkPrime();
        printPattern();
    }
    public static void average(){
        int sum = 0;
        int num = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        while(num != 0){
            num = in.nextInt();
            sum += num;
            count += 1;
        } 
        if (count == 0){
            System.out.println("The average is undefinded");
        }else{
            System.out.println("The average is: " + (float)sum/count);
        }
    }
    public static void checkPrime(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
                 
        while(num != 0){
            int i = 2;
            while(i < num){
                if(num % i == 0){
                    break;
                }
                i++;
            }
            if (num == i){
                System.out.println("This number is prime");
            }else {
                System.out.println("This number is not prime");
            }
            num = in.nextInt();
            
        }
    }
    public static void printPattern(){
        int ilimit = 0;
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        while(ilimit < num){
            int i = 0;
            while(i < ilimit){
            System.out.print("* ");
            i++;
            }
            System.out.println(" ");
            ilimit++;
        }
        
    }
}
