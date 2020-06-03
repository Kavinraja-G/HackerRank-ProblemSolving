import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            System.out.println(func(n));
        }
    }
    public static String func(int n){
        return (n%7<2)? "Second" : "First";
    }
}
