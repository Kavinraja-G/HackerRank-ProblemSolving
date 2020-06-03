import java.util.*;
class solution
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String ip = s.nextLine();
        StringBuilder str = new StringBuilder(ip);
        int len=0;
        int i=0;
        while(i<=str.length()-2 && str.length()!=0 )
        {
            if(str.charAt(i)=='0' && str.charAt(i+1)=='1')
            {
                //System.out.println(str);
                str.deleteCharAt(i);
                str.deleteCharAt(i);
                //System.out.println(str);
                i=0;
            }
            else
                i++;
        }
        len = str.length();
        if(len==0) System.out.println("-1");
        else System.out.println(str);
    }
}