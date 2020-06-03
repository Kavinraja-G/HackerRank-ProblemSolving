import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q=s.nextInt();
        s.nextLine();
        for(int i=1;i<=q;i++){
            String str=s.nextLine();
            System.out.println(func(str));
        }
    }
    public static int func(String str){
        int n=str.length();
        StringBuilder string =new StringBuilder(str);
        int count=0;
        char[] c=str.toCharArray();
        for(int i=0,j=(n-1);i<n/2 && j>=n/2;i++,j--){
            if(c[i]>c[j]){
                int g=c[i]-c[j];
                count+=g;
                string.setCharAt(i,c[j]);
            }
            if(c[j]>c[i]){
                int g=c[j]-c[i];
                count+=g;
                string.setCharAt(j,c[i]);
            }
        }
        return count;
    }
}
