import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        long weight=0;
        char prev=' ';
        ArrayList<Long> arr=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr!=prev){
                weight=0;
            }
            weight+=(long)((int)curr-96);
            arr.add(weight);
            prev=curr;
        }
        int q=s.nextInt();
        for(int i=1;i<=q;i++){
            long a=s.nextLong();
            if(arr.contains(a)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
