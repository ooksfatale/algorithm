package FifthClass;

import sun.awt.Symbol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer str = new StringTokenizer(bf.readLine());
        String arr[] = new String[str.countTokens()];

        for( int i = 0; i<arr.length; i++){
            arr[i]=str.nextToken();
        }

        int x = 1;
        int y = 1;
        int nx = 0;
        int ny = 0;
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        String[] move_types = {"L", "R", "U", "D"};

        for(int i = 0; i<arr.length; i++ ){
            for(int j = 0; j<move_types.length; j++){
                if(arr[i].equals(move_types[j])){
                    nx = x+dx[j];
                    ny = y+dy[j];
                }

                if(nx<1 || ny<1 || nx>n || ny>n ){
                    continue;
                }
                x = nx;
                y = ny;
            }
        }

        System.out.println(x+", "+y);

    }
}
