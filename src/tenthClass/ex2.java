package tenthClass;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray();

        for(int i=0; i<arr.length; i++){
            arr[i] ^= 32;
        }

        String str = new String(arr);
        System.out.println("str = " + str);
        

    }
}
