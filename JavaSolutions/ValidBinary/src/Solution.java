import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int k = s.nextInt();
        int count = 0,zeros=0;
        if(str.matches("^[0]+$") && k==1)
        {
            count+=str.length();
        }
        else if(str.matches("^[1]+$") && k==1)
        {
            count = 0;
        }
        else {
            for (int i = 0; i < str.length(); )
            {
                if(str.charAt(i)=='0')
                {
                    zeros++;
                    i++;
                }
                else if(str.charAt(i)=='1')
                {
                    count+= (zeros/2);
                    zeros = 0;
                    i++;
                }
            }
        }
        System.out.println(count);
    }

}
