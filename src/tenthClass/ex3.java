package tenthClass;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int resut = (N+1) & ~N;
        N+=resut;

        System.out.println(N);

    }
}
