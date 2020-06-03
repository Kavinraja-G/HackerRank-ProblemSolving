import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        char[][] a=new char[n][n];
        for(int i=0;i<n;i++){
            s.nextLine();
            String str=Integer.toString(s.nextInt());
            for(int j=0;j<n;j++){
                a[i][j]=str.charAt(j);
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (i != 0 && j != 0 && i != n - 1 && j != n - 1) {
                    if (a[i][j] > a[i][j + 1] && a[i][j] > a[i][j - 1] && a[i][j] >
                            a[i - 1][j] && a[i][j] > a[i + 1][j]) {
                        System.out.printf("%c", 88);
                    } else {
                        System.out.printf("%c", a[i][j]);
                    }
                } else {
                    System.out.printf("%c", a[i][j]);
                }
            }
            System.out.printf("\n");
        }
    }
}
