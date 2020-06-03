import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int t=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();
        int m=scan.nextInt();
        int n=scan.nextInt();
        int[] apples= new int[m];
        int[] oranges= new int[n];
        for (int i=0;i<m;i++){
            apples[i]=scan.nextInt();
        }
        for (int j=0;j<n;j++){
            oranges[j]=scan.nextInt();
        }
        countApplesAndOranges(s,t,a,b,apples,oranges);
    }
    public  static void countApplesAndOranges(int s,int t,int a,int b,int[] apples1,int[] oranges1){
        int[] apples2=new int[apples1.length];
        int[] oranges2=new int[oranges1.length];
        int count1=0;
        int count2=0;
        for(int i=0;i<apples1.length;i++){
            apples2[i]=apples1[i]+a;
        }
        for(int i=0;i<oranges1.length;i++){
            oranges2[i]=oranges1[i]+b;
        }
        for(int j:apples2){
            if(j>=s && j<=t){
                count1+=1;
            }
        }
        for(int j:oranges2){
            if(j>=s && j<=t){
                count2+=1;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
