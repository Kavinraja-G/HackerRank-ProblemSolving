import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while (test-- >0)
        {
            StringBuilder str = new StringBuilder();
            int n = s.nextInt();
            for (int i=n;i>=0;i--)
            {
                if(i%3==0 && (n-i)%5==0)
                {
                    int j=0;
                    for(;j<i;j+=3)
                    {
                        str.append("555");
                    }
                    for(int k=i;k<n;k+=5)
                    {
                        str.append("33333");
                    }
                    break;
                }
            }

            if(str.length() == 0)
                System.out.println("-1");
            else
                System.out.println(str);
        }
    }
}
