import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt();
        ArrayList<Integer> time = new ArrayList<>();
        Map<Integer,Integer> customer = new HashMap<>();
        for (int i=1;i<=n;i++)
        {
            int order = s.nextInt();
            int prep = s.nextInt();
            time.add(order + prep);
            customer.put(i, order + prep);
        }
        Collections.sort(time);
        ArrayList<Integer> b = new ArrayList<>();
        for(int el : time)
        {
            for(int key : customer.keySet())
            {
                if(customer.get(key)==el && b.contains(key)==false)
                {
                    b.add(key);
                    System.out.print(key+" ");
                    break;
                }
            }
        }
    }
}
