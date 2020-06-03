public class NumberPalindrome {
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }
    public static boolean isPalindrome(int number){
        int res=0;
        int original= number;
        while(number!=0){
            int x = number%10;
            res = (res*10) + x;
            number=(number/10);
            //System.out.println(res);
        }
        if(res==original){
            return true;
        }
        else
            {
            return false;
        }

    }


}
