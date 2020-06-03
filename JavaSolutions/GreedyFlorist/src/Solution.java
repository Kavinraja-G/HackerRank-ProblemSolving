import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    static int getMinCost(Integer[] cost, int size, int totalPeople)
    {
        int[] peoples = new int[totalPeople];
        int finalAmount=0;
        int currPerson=0;
        Arrays.sort(cost, Collections.reverseOrder());
        for(int i=0;i<size;i++)
        {
            finalAmount += (peoples[currPerson]+1)*cost[i];
            peoples[currPerson]++;
            currPerson = (currPerson+1)%totalPeople;
        }
        return finalAmount;
    }


    private static final Scanner s = new Scanner(System.in);
    public static void  main(String[] args)
    {
        int n = s.nextInt();
        int peoples = s.nextInt();
        Integer[] cost = new Integer[n];
        for(int i=0;i<n;i++)
        {
            cost[i] = s.nextInt();
        }
        System.out.println(getMinCost(cost,n,peoples));
    }
}
