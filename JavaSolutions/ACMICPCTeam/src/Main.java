import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int nr=s.nextInt();
        int nc=s.nextInt();
        String[] a=new String[nr];
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<nr;i++){
            a[i]=s.next();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<(nr-1);i++){
            for(int j=i+1;j<nr;j++){
                int known=0;
                String str1=a[i];
                String str2=a[j];
                for(int g=0;g<nc;g++){
                    char c1=str1.charAt(g);
                    char c2=str2.charAt(g);
                    if(Integer.parseInt(String.valueOf(c1))+Integer.parseInt(String.valueOf(c2))>0){
                        known+=1;
                    }
                }
                b.add(known);
                if(known>max){
                    max=known;
                }
            }
        }
        System.out.println(max);
        int count=0;
        for(int h:b){
            if(h==max){
                count+=1;
            }
        }
        System.out.println(count);
    }

}
