import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(viralAdvertising(n));
    }
    public static int viralAdvertising(int n){
        int shared=5;
        int totliked=0;
        for(int i=1;i<=n;i++){
            int liked=shared/2;
            totliked+=liked;
            shared=liked*3;
        }
        return totliked;
    }
}
