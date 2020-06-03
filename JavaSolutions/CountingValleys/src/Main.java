import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String s=scan.next();
        System.out.println(countingValleys(n,s));
    }
    public static int countingValleys(int n,String s){
        int v=0;
        int lvl=0;
        for(char c:s.toCharArray()){
            if(c=='U'){
                lvl++;
            }else{
                lvl--;
            }
            if(lvl==0 && c=='U' ){
                v++;
            }
        }
        return v;
    }
}
