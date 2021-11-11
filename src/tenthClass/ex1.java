package tenthClass;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if((N&1) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }

    }

}
