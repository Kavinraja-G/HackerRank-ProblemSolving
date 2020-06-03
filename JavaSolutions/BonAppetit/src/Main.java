import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int b=s.nextInt();
        theBonAppetitfunction(arr,k,b);
    }
    public static void theBonAppetitfunction(int[] arr,int k, int bcharged){
        int bactual=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i!=k){
                sum+=arr[i];
            }
        }
        bactual=sum/2;
        if(bactual==bcharged){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(bcharged-bactual);
        }
    }
}
