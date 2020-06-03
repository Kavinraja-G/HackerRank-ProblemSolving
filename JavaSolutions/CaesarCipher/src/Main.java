import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String str=s.nextLine();
        int k=s.nextInt();
        char[] a=new char[n];
        a=str.toCharArray();
        String str2="";
        for(char c:a){
            if(c>=65 && c<=90){
                char c1= (char) (c+k);
                if(c1<=90){
                    c=c1;
                }else{
                    c= (char)  (65+((c-65+k)%26));
                }
            }else if(c>=97 && c<=122){
                char c2=(char) (c+k);
                if(c2<=122){
                    c=c2;
                }else{
                    c=(char) (97+((c-97+k)%26));
                }
            }
            str2+=Character.toString(c);
        }
        System.out.println(str2);

    }
}
