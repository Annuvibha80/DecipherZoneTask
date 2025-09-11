package com.week4_d3.string;

import java.util.Scanner;

/*
For a given input convert the capital letter in small and small in capital
 */
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        StringBuilder str = new StringBuilder(sc.next());
        System.out.println("StrinBuilder : " +str);

        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            if(ch<='Z' && ch>='A'){
                System.out.print((char)(ch+32));
            }

           else if(ch>='a' && ch<='z'){
               System.out.print((char)(ch-32));
          }
        }
        System.out.println();

        //From StringBuilder
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch<='Z' && ch>='A'){
               str.setCharAt(i, (char)(ch+32));
            }

            else if(ch>='a' && ch<='z'){
                str.setCharAt(i, (char)(ch-32));
            }
        }
        System.out.println(str);
    }
}
