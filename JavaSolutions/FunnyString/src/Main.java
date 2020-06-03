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
    public static String func(String str1){
        StringBuilder rev = new StringBuilder();
        rev.append(str1);
        rev=rev.reverse();
        String str2=rev.toString();
        int count=0;
        for(int i=0;i<str1.length()-1;i++){
            int x=Math.abs(str1.charAt(i+1)-str1.charAt(i));
            int y=Math.abs(str2.charAt(i+1)-str2.charAt(i));
            if(x==y){
                count+=1;
            }
        }
        if(count==(str1.length()-1)){
            return "Funny";
        }else{
            return "Not Funny";
        }

    }

}
