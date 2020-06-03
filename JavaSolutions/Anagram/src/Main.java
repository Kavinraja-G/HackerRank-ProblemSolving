import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int q=s.nextInt();
        s.nextLine();
        for(int i=1;i<=q;i++){
            String str=s.nextLine();
            System.out.println(func(str));
        }
    }
    public static int func(String str){
        int n=str.length();
        int count=0;
        int mid=n/2;
        if(n%2==1){
            return -1;
        }
        String str1=str.substring(0,mid);
        String str2=str.substring(mid,n);
        StringBuilder string =new StringBuilder(str2);
        for(char c:str1.toCharArray()){
            for(int j=0;j<string.length();j++){
                if(c==string.charAt(j)){
                    string.deleteCharAt(j);
                    count+=1;
                    break;
                }
            }
        }
        return (str1.length()-count);
    }
}
