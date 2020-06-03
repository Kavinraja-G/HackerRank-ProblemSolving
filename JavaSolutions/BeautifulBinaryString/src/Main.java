import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String str=s.nextLine();
        StringBuilder string=new StringBuilder(str);
        int count=0;
        for(int i=0;i<(n-2);i++){
            if(string.charAt(i)=='0' && string.charAt(i+1)=='1' && string.charAt(i+2)=='0'){
                count+=1;
                string.setCharAt(i+2,'1');
            }
        }
        System.out.println(count);
    }
}
