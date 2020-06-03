import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int q=s.nextInt();
        s.nextLine();
        for(int i=1;i<=q;i++){
            String str=s.nextLine();
            long n=func(str);
            System.out.println(n>0 ? "YES "+n : "NO");
        }
    }
    public static long func(String str){
        if(str.charAt(0)=='0'){
            return -1;
        }
        for(int i=1;i*2<=str.length();i++){
            long firstnum=Long.parseLong(str.substring(0,i));
            StringBuilder sequence=new StringBuilder();
            long number=firstnum;
            while(sequence.length()<str.length()){
                sequence.append(number);
                number+=1;
            }
            if(sequence.toString().equals(str)){
                return firstnum;
            }
        }
        return -1;
    }

}
