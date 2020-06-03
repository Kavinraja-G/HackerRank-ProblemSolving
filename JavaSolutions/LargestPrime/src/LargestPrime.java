public class LargestPrime {
    public static void main(String[] args)
    {
        System.out.println(getLargestPrime(217));
    }
    public static int getLargestPrime(int number){
        if(number<0) return -1;
        else {
            int max=0;
            for(int i=1;i<=number;i++) {
                if (number%i==0) {
                    int flag = 0;
                    for(int j=2;j<i;j++) {
                        if (i % j == 0) {
                            flag = 1;
                            break;
                        }
                    }if(flag==0 && (i>=max)) max=i;
                }
            }
            return max;
        }
    }
}
