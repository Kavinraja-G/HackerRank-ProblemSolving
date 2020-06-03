import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String s1="[ .,?!']+";
        String[] tokens=str.split(s1);
        for(String c:tokens){
            System.out.println(c);
        }
    }
}
