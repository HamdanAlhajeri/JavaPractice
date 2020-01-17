/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaex;

import java.util.Scanner;

public class JavaEx {
    
    
    public static void main(String[] args) {
        average();
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
}
