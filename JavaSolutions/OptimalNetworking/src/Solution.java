import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static int findPackets(int[][] grid, int cr, int cc, int r, int c)
    {


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] grid = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                grid[i][j] = s.nextInt();
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        findPackets(grid,0,0,r,c,arr);
        System.out.println(arr);
    }
}
