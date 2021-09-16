package com.algorithm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();           // N종류 동전
        int K = sc.nextInt();           // 동전 가치의 합
        int arr[] = new int[N];        // 입력된 동전 배열
        int cnt = 0;                    // 동전 개수

        for(int i=0; i <N; i++) {
            arr[i] = sc.nextInt();     // N종류의 동전 입력
        }

        for(int i = N-1; i>=0; i-- ){   // 금액이 큰 동전부터 루프
            if(arr[i] <=K ){           // K금액의 동전보다 작은 경우의 조건
                cnt += K / arr[i];     // 사용된 동전 개수 : 몫
                K %= arr[i];           // 남은금액 :  나머지
            }
        }
        System.out.println(cnt);
    }
}
