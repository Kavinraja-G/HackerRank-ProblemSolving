import java.util.Scanner;

public class Main {
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
        int[] g=comparision(a,b);
        System.out.println(g[0] + " " + g[1]);
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
        int[] array={points1,points2};
        return array;

    }

}
