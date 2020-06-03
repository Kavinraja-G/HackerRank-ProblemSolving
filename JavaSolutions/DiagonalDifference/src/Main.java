import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println(diagonalDifference(arr));
    }
    public static int diagonalDifference(int[][] b){
        int diagsum1=0;
        int diagsum2=0;
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b.length;j++){
                if(i==j){
                    diagsum1+=b[i][j];
                }
                if(i==b.length-j-1){
                    diagsum2+=b[i][j];
                }
            }
        }
        int result= diagsum1-diagsum2;
        if(result>0){
            return result;
        }else{
            return -result;
        }
    }

}
