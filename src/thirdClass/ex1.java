package thirdClass;
import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 0;

        while( N!=1){           // N이 1이될때 까지 반복
            if( (N % K) == 0){  // N이 K로 나누어 떨어질 경우
                N /= K;         // N = N / K
            }else{              // N이 K로 나누어 떨어지지 않을 경우
                N-=1;           // N = N - 1
            }
            cnt+=1;             // 반복되는 동안의 횟수
        }
        System.out.println(cnt);
    }
}