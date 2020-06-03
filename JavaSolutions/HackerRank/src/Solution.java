import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(timeConversion(str));
    }
    public static int timeConversion(String s){
        String str[]=s.split(":",2);
        int hours=Integer.parseInt(str[0]);
        int min=Integer.parseInt(str[1]);

        return min;
    }
}
