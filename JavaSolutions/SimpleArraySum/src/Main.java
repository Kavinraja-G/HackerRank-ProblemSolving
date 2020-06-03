import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]=s.nextInt();
        }
        System.out.println(simpleArraySum(array));

    }
    public static int simpleArraySum(int[] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];

        }
        return sum;
    }
}
