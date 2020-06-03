public class EvenDigitSum {
    public static void main(String[] args)
    {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(1598426960));
        System.out.println(getEvenDigitSum(-22));

    }
    public static int getEvenDigitSum(int number){
        int sum=0;
        if(number<0){
            return -1;
        }else{
            while(number>0){
                int lastdigit=number%10;
                if(lastdigit%2==0){
                    sum+=lastdigit;
                }
                number/=10;
            }
        }
        return sum;
    }
}
