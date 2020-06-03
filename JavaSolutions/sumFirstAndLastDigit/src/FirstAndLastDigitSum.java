public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(700));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }else{
            int lastdigit =number%10;
            while(number>0)
            {
                if(number/10 == 0)
                    break;
                else
                    number/=10;
            }
            return (number+lastdigit);
        }

    }
}
