import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int q=s.nextInt();
        s.nextLine();
        for(int i=1;i<=q;i++){
            String str=s.nextLine();
            System.out.println(func(str));
        }
    }
    public static String func(String s1){
        String s2="hackerrank";
        int i=0;
        for(char c:s1.toCharArray()){
            if(c==s2.charAt(i)){
                i+=1;
            }
            if(i==s2.length()){
                break;
            }
        }
        if(i==s2.length()){
            return "YES";
        }else{
            return "NO";
        }
    }
}
