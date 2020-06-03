import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(s.nextInt());
        }
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<(n-1);i++){
            if(arr.get(i+1)-arr.get(i)<min){
                min=arr.get(i+1)-arr.get(i);
            }
        }
        for(int j=0;j<(n-1);j++){
            if(arr.get(j+1)-arr.get(j)==min){
                arr1.add(arr.get(j));
                arr1.add(arr.get(j+1));
            }
        }
        for(int g:arr1){
            System.out.printf("%d ",g);
        }
    }
}
