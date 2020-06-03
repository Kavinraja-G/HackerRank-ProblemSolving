import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[] a= new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int j=0;j<m;j++){
            b[j]=s.nextInt();
        }
        System.out.println(getTotal(a,b));
    }
    public static int getTotal(int[] a,int[] b){
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        for(int i=1;i<=100;i++){
            int count=0;
            for(int j:b){
                if(j%i==0){
                    count+=1;
                }
            }
            if(count==b.length){
                arr1.add(i);
            }
        }
        for(int i=0;i<arr1.size();i++){
            int count=0;
            for(int j:a){
                if(arr1.get(i)%j==0){
                    count+=1;
                }
            }
            if(count==a.length){
                arr2.add(arr1.get(i));
            }
        }
        return arr2.size();
    }
}
