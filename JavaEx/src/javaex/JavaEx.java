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
        MyString.test();
    }

    public static void average() {
        int sum = 0;
        int num;
        int count = 0;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        while (num != 0) {
            num = in.nextInt();
            sum += num;
            count += 1;
        }
        if (count == 0) {
            System.out.println("The average is undefinded");
        } else {
            System.out.println("The average is: " + (float) sum / count);
        }
    }

    public static void checkPrime() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while (num != 0) {
            int i = 2;
            while (i < num) {
                if (num % i == 0) {
                    break;
                }
                i++;
            }
            if (num == i) {
                System.out.println("This number is prime");
            } else {
                System.out.println("This number is not prime");
            }
            num = in.nextInt();

        }
    }

    public static void printPattern1() {
        int limit = 0;
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        while (limit < num + 1) {
            int i = 0;
            while (i < limit) {
                System.out.print("* ");
                i++;
            }
            System.out.println(" ");
            limit++;
        }
    }

    public static void printPattern2() {
        Scanner in = new Scanner(System.in);
        int limit = in.nextInt();
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static void printPattern3() {
        Scanner in = new Scanner(System.in);
        int limit = in.nextInt();
        int i = 1;
        int num = 1;
        while (i < limit) {
            int j = 0;
            while (j < i) {
                System.out.print(num + " ");
                num++;
                j++;
            }
            i++;
            System.out.println("");
        }
    }

    public static void printPattern4() {
        Scanner in = new Scanner(System.in);
        int limit = in.nextInt();
        int i = 1;
        while (i <= limit) {
            int j = 1;
            while (j <= limit - i + 1) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println("");
        }
    }

    public static void printFibanocciSeries() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 0;
        int first = 0;
        int second = 1;
        if (num >= 1) {
            System.out.print(first);
            i++;
        }
        if (num >= 2) {
            System.out.print("," + second + ",");
            i++;
        }

        while (i < num) {
            int temp = second;
            second += first;
            first = temp;
            System.out.print(second + ",");
            i++;

        }
    }

    public static void multpliyingTo10() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 0;
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + i * num);
            i++;
        }
    }

    public static void printPattern5() {
        Scanner in = new Scanner(System.in);
        int limit = in.nextInt();
        int i = 0;
        int j = 0;
        while (j < limit) {
            i = 0;
            while (i < limit - j - 1) {
                System.out.print("* ");
                i++;
            }
            i = 0;
            while (i < j + 1) {
                System.out.print(j + 1 + " ");
                i++;
            }
            j++;
            System.out.println("");
        }
    }

    public static void palindromeCheck() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int temp = x;
        int num = 0;
        //int i = in.nextInt();
        int i = x % 10;
        while (i > 0) {
            num = i + num * 10;
            //i = in.nextInt();
            x /= 10;
            i = x % 10;
        }
        if (temp == num) {
            System.out.println(num + " Is numer is Palindrome");
        } else {
            System.out.println("This number is not a Palindrome");
        }
    }

    public static void arrayIntDecliration() {
        Scanner in = new Scanner(System.in);
//        int array1[] = {1, 2, 3, 4};
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int array2[];
        array2 = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = in.nextInt();
        }
        System.out.println("Printing the array");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }

    public static void arrayCharDecliration() {
        Scanner in = new Scanner(System.in);
        char array1[] = {65, 66, 67, 68};
        char array3[] = {'A', 'B', 'C', 'D'};
        char array4[] = "ABCD".toCharArray();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
        System.out.println("");
        for (int i = 0; i < array4.length; i++) {
            System.out.print(i + " : " + array4[i]);
        }
        System.out.println("");
//        System.out.println("Enter the size of the array");
//        int size = in.nextInt();
//        char array2[];
//        array2 = new int[size];
//        System.out.println("Enter the array elements");
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = in.nextInt();
//        }
//        System.out.println("Printing the array");
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println(array2[i]);
//        }

    }

    public static void palindromeString() {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        char arrayCh1[];
        arrayCh1 = str1.toCharArray();
        int i = arrayCh1.length - 1;
        char arrayCh2[] = new char[arrayCh1.length];
        int j = 0;
        boolean checkPal = true;
        while (j < arrayCh1.length) {
            arrayCh2[j] = arrayCh1[i];
            i--;
            j++;
        }
        i = arrayCh1.length - 1;
        j = 0;
        while (j < i) {
            if (arrayCh1[j] == arrayCh2[j]) {
                j++;
            } else {
                checkPal = false;
                break;
            }
        }
        if (checkPal == true) {
            System.out.println("Your text is a palidnomre");
        } else {
            System.out.println("Your text is not a palindrome");
        }
    }

    public static void checkStringPalindorme2() {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        char arrayCh1[];
        arrayCh1 = str1.toCharArray();
        int i = arrayCh1.length - 1;
        int j = 0;
        boolean checkPal = true;
        while (j < i) {
            if (arrayCh1[j] == arrayCh1[i]) {
                j++;
                i--;
            } else {
                checkPal = false;
                break;
            }
        }
        if (checkPal == true) {
            System.out.println("Your text is a palindrome");
        } else {
            System.out.println("Your Text is not a palindrome");
        }
    }

    public static void printPattern6() {
        int i;
        int j;
        int k;
        for (i = 1; i <= 5; i++) {
            for (j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
