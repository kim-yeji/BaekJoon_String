package com.company;
//  *+..+ 10809번 알파벳찾기 +..+*

import java.util.Arrays;
import java.util.Scanner;

//  *+..+ 10809번 알파벳찾기 +..+*

public class FindAlpha_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int[] alpaArr = new int[26]; //결과를 담을 그릇 생성
        Arrays.fill(alpaArr, -1);  //-1로 초기화 시킨다.


        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i); // 문자 하나씩 떼어서 보기


            // 중복된 알파벳이 나을 때, 처음 나온 순서로 저장시키기 위해서는
            // -1인 상태일 때만 새로 저장하면 되는 것이다!!
            // -1가 아니면 그냥 패스
            if (alpaArr[c-'a'] == -1){
                alpaArr[c-'a']=i ;
            }
        }


        //결과 출력
        for (int i = 0 ; i < alpaArr.length ; i++){
            System.out.print(alpaArr[i]+" ");
        }
    }
}
