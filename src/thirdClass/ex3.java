package thirdClass;
import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        int result = 0;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int num : arr){
            sum+=num;
            result+=sum;
        }

        System.out.println(result);
    }
}
