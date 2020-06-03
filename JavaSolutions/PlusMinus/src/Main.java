import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n;i++){
            a[i]=s.nextInt();
        }
        plusMinus(a);
    }
    public static void plusMinus(int[] b){
        float length=b.length;
        float positive=0;
        float negative=0;
        int zero=0;
        for(int i=0; i<length;i++){
            if(b[i]>0){
                positive+=1;
            }else if(b[i]<0){
                negative+=1;
            }else {
                zero+=1;
            }
        }
        float x=  (positive/length);
        float y= (negative/length);
        float z=  (zero/length);
        System.out.println(String.format("%.6f",x));
        System.out.println(String.format("%.6f",y));
        System.out.println(String.format("%.6f",z));
    }

}
