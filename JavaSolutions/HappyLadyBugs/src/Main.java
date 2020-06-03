import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int g=s.nextInt();
        for(int i=1;i<=g;i++){
            int n=s.nextInt();
            s.nextLine();
            String str=s.nextLine();
            System.out.println(str);
            System.out.println(func(n,str));
        }
    }
    public static String func(int n,String s){
        char[] c=s.toCharArray();
        int count=0;
        for(char i:c){
            int g= Collections.frequency(Collections.singleton(c),i);
            System.out.println(g);
            if(i!='_' && g==0){
                return "NO";
            }
            if(i=='_'){
                count++;
            }
        }
        if(count==0){
            return "NO";
        }else{
            return "YES";
        }
    }
}
