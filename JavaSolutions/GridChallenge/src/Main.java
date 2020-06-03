import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int k = 1; k <= t; k++) {
            int n = s.nextInt();
            char[][] c = new char[n][n];
            s.nextLine();
            for (int i = 0; i < n; i++) {
                String str=s.nextLine();
                for (int j = 0; j < n; j++) {
                    c[i][j] = str.charAt(j);
                }
            }
            System.out.println(func(n,c));
        }
    }
    public static String func(int n,char[][] c){
        for(int i=0;i<n;i++){
            ArrayList<Character> ch=new ArrayList<>();
            for(int j=0;j<n;j++){
                ch.add(c[i][j]);
            }
            Collections.sort(ch);
            for(int j=0;j<n;j++){
                c[i][j]=ch.get(j);
            }
        }
        int g=0;
        for(int j=0;j<n;j++){
            int count=1;
            for(int i=0;i<n-1;i++){
                if(c[i][j]<=c[i+1][j]){
                    count+=1;
                }
            }
            if(count==n){
                g+=1;
            }
        }
        if(g==n){
            return "YES";
        }else{
            return "NO";
        }
    }
}
