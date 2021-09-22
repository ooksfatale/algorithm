package thirdClass;
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = str.charAt(0)-'0';         //첫번째 숫자 추출

        for( int i=1; i<str.length(); i++) {    //두번째부터 문자열 길이만큼 반본
            int num = str.charAt(i)-'0';        //문자열에서 숫자 추출

            if(num<=1 || result<=1){            // 1이하는 +
                result += num;
            }else{                              // 2이상은 *
                result *= num;
            }
        }
        System.out.println(result);
    }
}
