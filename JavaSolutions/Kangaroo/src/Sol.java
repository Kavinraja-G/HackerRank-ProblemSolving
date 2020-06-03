import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x1=s.nextInt();
        int v1=s.nextInt();
        int x2=s.nextInt();
        int v2=s.nextInt();
        System.out.println(Kangaroo(x1,v1,x2,v2));
    }
    public static String Kangaroo(int x1,int v1,int x2,int v2){
        int count1=0;
        int count2=0;
        for(int i=1;i<100000000;i++){
            int val1=x1+v1;
            count1+=i;
            int val2=x2+v2;
            count2+=i;
            if(val1==val2 && count1==count2){
                return "YES";
            }
            x1+=v1;
            x2+=v2;
        }
        return "NO";
    }



}
