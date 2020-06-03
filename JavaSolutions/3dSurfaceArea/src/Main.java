import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int w = s.nextInt();
        int[][] a = new int[h+2][w+2];
        for(int i=1;i<h+1;i++)
        {
            for(int j=1;j<w+1;j++)
                a[i][j] = s.nextInt();
        }

        int area = 0;
        for(int i=1;i<h+1;i++)
        {
            for(int j=1;j<w+1;j++)
            {
                if(a[i][j]-a[i+1][j] > 0) area+=a[i][j]-a[i+1][j];
                if(a[i][j]-a[i-1][j] > 0) area+=a[i][j]-a[i-1][j];
                if(a[i][j]-a[i][j+1] > 0) area+=a[i][j]-a[i][j+1];
                if(a[i][j]-a[i][j-1] > 0) area+=a[i][j]-a[i][j-1];
            }
        }
        area+= (2*h*w);
        System.out.println(area);


/*         for(int i=0;i<=h+1;i++)
        {
            for(int j=0;j<=w+1;j++)
                System.out.printf("%d ",a[i][j]);
            System.out.println();
        }
 */
    }
}
