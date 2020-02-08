package javaex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 662551322
 */
public class MyString {

    char arrayCh[];

    public MyString(String str) {
        arrayCh = str.toCharArray();

    }

    public void checkPalindorme() {

        int i = arrayCh.length - 1;
        int j = 0;
        boolean checkPal = true;
        while (j < i) {
            if (arrayCh[j] == arrayCh[i]) {
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

    public String reverse() {
        char arrayCh1[];
        arrayCh1 = new char [arrayCh.length];
        int j = 0;
        int i = arrayCh.length - 1;
        while (i >= 0) {
            arrayCh1[j] = arrayCh[i];
            i--;
            j++;
        }
        String str2;
        str2 = new String(arrayCh1);
        return str2;
        
    }
    public String delExtraSpace(){
        String str1;
        char b[] = new char[arrayCh.length];
        char c[];
        
        return str1;
    }

    public static void test() {
        String str = "aa  bbb   c";
        MyString obj = new MyString(str);
        obj.checkPalindorme();
        System.out.println(obj.reverse());
    }
}
