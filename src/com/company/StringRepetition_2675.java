package com.company;
//  *+..+ 2675번 문자열반복 +..+*

import java.util.Scanner;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/*        1번 !! Scanner를 사용한 방법

public class StringRepetition_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i=0;i<num;i++){
            int n = scan.nextInt();
            String s = scan.next();

            for (int j=0;j<s.length();j++){
                for (int k=0;k<n;k++){
                    System.out.print(s.charAt(j));
                }
            }

            System.out.println("");
        }


    }
}
*/
//=============================================================================================


/*        2번 !! BufferReader를 사용한 방법
 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0;i < num; i++){
            String[] str = br.readLine().split(" "); //공백 분리

            int n = Integer.parseInt(str[0]);
            String s = str[1];

            for (int j =0 ;j<s.length();j++){
                for (int k =0;k<n;k++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println("");
        }
    }
 */

