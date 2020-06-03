public class LastDigitChecker {
    public static void main(String[] args)
    {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

    }
    public static boolean hasSameLastDigit(int x,int y,int z){
        if (((x<10)||(x>1000)) || ((y<10)||(y>1000)) || ((z<10)||(z>1000))){
            return false;
        }else{
            int l1=x%10;
            int l2=y%10;
            int l3=z%10;
            if((l1==l2) && (l2==l3)){
                return true;
            }else if((l1==l2) || (l2==l3) || (l3==l1)){
                return true;
            }else
                return false;
        }
    }
}
