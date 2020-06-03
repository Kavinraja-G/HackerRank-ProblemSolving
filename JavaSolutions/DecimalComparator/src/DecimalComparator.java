public class DecimalComparator {
    public static void main(String[] args)
    {
        /*System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));*/
        int x = 123;
        reverse(x);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2)
    {
        int n1=(int)(num1*1000);
        int n2=(int)(num2*1000);
        if(n1==n2)
        {
            return true;
        }
        return false;
    }
    public static void reverse(int num){
        int rem;
        while(num!=0){
            int temp = num%10;
            num/=10;
            System.out.printf("%d",temp);
        }

    }

}
