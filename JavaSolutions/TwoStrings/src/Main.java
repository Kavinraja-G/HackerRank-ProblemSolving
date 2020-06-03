import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q=s.nextInt();
        s.nextLine();
        for(int i=1;i<=q;i++){
            String str1=s.nextLine();
            String str2=s.nextLine();
            System.out.println(func(str1,str2));
        }
    }
    public static String func(String s1,String s2){
        Set<Character> set=new HashSet<>();
        for(int i=97;i<=122;i++){
            set.add((char)i);
        }
        for(char c: set){
            if(s1.contains(Character.toString(c)) && s2.contains(Character.toString(c))){
                return "YES";
            }
        }
        return "NO";
    }
}
