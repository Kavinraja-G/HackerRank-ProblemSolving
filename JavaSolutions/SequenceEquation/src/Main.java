import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<n;i++){
            arrayList.add(s.nextInt());
        }
        ArrayList<Integer> arr=function(arrayList);
        for(int j:arr){
            System.out.println(j);
        }
    }
    public static ArrayList<Integer> function(ArrayList<Integer> a){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=a.size();i++){
            int val=a.indexOf(i)+1;
            int y=a.indexOf(val)+1;
            arr.add(y);
        }
        return arr;
    }
}
