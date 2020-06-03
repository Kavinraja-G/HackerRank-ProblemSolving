import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int r=s.nextInt();
        int max=Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
            for(int j=l;j<=r;j++){
                int g=i^j;
                if(i != j && g>max){
                    max=i^j;
                }
            }
        }
        System.out.println(max);
    }
}
