public class SharedDigit
{
    public static void main(String[] args)
    {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,51));
    }
    public static boolean hasSharedDigit(int num1,int num2)
    {
        int count=0;
        if (((num1<10)||(num1>99)) || ((num2<10)||(num2>99))){
            return false;
        }else {
            while(count==0)
            {
                int lastdigit1=num1%10;
                int lastdigit2=num2%10;
                if (lastdigit1 == lastdigit2) {
                    count+=1;
                    return true;
                }
                num1/=10;
                num2/=10;

            }
            if (count==0)
                return false;
        }


        return false;
    }


}
