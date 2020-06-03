import java.util.Arrays;
import java.util.Scanner;

public class Sol {
    public static void main(String[] args){
        int[] a = new int[3];
        int[] b = new int[3];
        Scanner s = new Scanner(System.in);
        for (int i=0;i<3;i++){
            a[i]=s.nextInt();
        }

        for (int i=0;i<3;i++){
            b[i]=s.nextInt();
        }
        System .out.println(Arrays.toString(comparision(a, b)));
    }
    public static int[] comparision(int[] a, int[] b){
        int points1=0;
        int points2=0;
        for (int i=0; i<3; i++){
            if(a[i]>b[i]){
                points1+=1;
            }else if(b[i]>a[i]){
                points2+=1;
            }else{
                points1+=0;
                points2+=0;
            }
        }
        final int[] ints = {points1, points2};
        return ints;
    }
}
