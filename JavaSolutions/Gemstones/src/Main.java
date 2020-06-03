import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextLine();
        }
        ArrayList<Character> arrayList=new ArrayList<>();
        String str=arr[0];
        int gem=0;
        for(char c:str.toCharArray()){
            int count=0;
            if(!arrayList.contains(c)){
                for(int i=0;i<n;i++){
                    if(arr[i].contains(Character.toString(c) )){
                        count+=1;
                    }
                }
            }
            if(count==n){
                arrayList.add(c);
                gem+=1;
            }
        }
        System.out.println(gem);

    }
}
