import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(hurdleRace(k,arr));
    }
    public static int hurdleRace(int k,int[] a){
       ArrayList<Integer> arr=new ArrayList<>();
       for(int i:a){
           arr.add(i);
       }
       int max=Collections.max(arr);
       if(k<max){
           return (max-k);
       }else{
           return 0;
       }

    }
}
