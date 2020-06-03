import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int q=s.nextInt();
        s.nextLine();
        for(int i=1;i<=q;i++){
            String str=s.nextLine();
            HashSet<Character> set=new HashSet<>();
            for(char c:str.toCharArray()){
                set.add(c);
            }
            System.out.println(set.size());
        }
    }
}
