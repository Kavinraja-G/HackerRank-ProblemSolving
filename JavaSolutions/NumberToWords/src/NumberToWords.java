public class NumberToWords {
    public static void main(String[] args)
    {
        numberToWords(535);
    }
    public static int getDigitCount(int value){
        if(value<0){
            return -1;
        }else{
            int count=0;
            while(value!=0){
                int x=value%10;
                count+=1;
                value/=10;
            }
            return count;
        }
    }
    public static int reverse(int num){
        int res=0;
        while(num!=0){
            int x=num%10;
            res=(res*10)+x;
            num/=10;
        }
        return res;
    }
    public static void numberToWords(int number){
        int original=reverse(number);
        if(original<0){
            System.out.println("Invalid Value");
        }else{
            while(original>0){
                int lastdigit=original%10;
                switch(lastdigit)
                {
                    case 0:
                        System.out.println("Zero ");
                        break;
                    case 1:
                        System.out.println("One ");
                        break;
                    case 2:
                        System.out.println("Two ");
                        break;
                    case 3:
                        System.out.println("Three ");
                        break;
                    case 4:
                        System.out.println("Four ");
                        break;
                    case 5:
                        System.out.println("Five ");
                        break;
                    case 6:
                        System.out.println("Six ");
                        break;
                    case 7:
                        System.out.println("Seven ");
                        break;
                    case 8:
                        System.out.println("Eight ");
                        break;
                    case 9:
                        System.out.println("Nine ");
                        break;
                }
                original/=10;
            }

        }
    }
}
