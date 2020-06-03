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
    public static int func(String str){
        int count=0;
        for(int i=0;i<(str.length()-1);i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count+=1;
            }
        }
        return count;
    }
}
