import java.util.*;

public class solution {
    static void whatFlavors(int[] cost, int money) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(money-cost[0],1);
        for(int i=1;i<cost.length;i++)
        {
            if(hmap.containsKey(cost[i]))
                System.out.println(hmap.get(cost[i])+" "+(i+1));
            else if(!hmap.containsKey(cost[i]) && money-cost[i]>0)
                hmap.put(money-cost[i],i+1);
        }
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int[] cost = new int[n];
            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }
            whatFlavors(cost, money);
        }
        scanner.close();
    }
}
