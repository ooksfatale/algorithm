package fourthClass;
import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for(int i=0; i<str.length();i++){
            int num = str.charAt(i)-'0';
            if(num !=0){
                list1.add(num);
            }else{
                list2.add(num);
            }
        }

        list1.addAll(list2);
        System.out.println(list1);
    }
}