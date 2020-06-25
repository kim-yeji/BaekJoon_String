package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        String s = scan.next();


        for (int i = 0 ; i < num ; i++){
            sum += s.charAt(i)-'0';
            // sum += Integer.parseInt(s.substring(i,i+1));
        }

        System.out.print(sum);
    }
}
