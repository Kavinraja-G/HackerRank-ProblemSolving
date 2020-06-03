import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q=s.nextInt();
        for(int i=1;i<=q;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            int z=s.nextInt();
            catAndMouse(x,y,z);
        }
    }
    public static void catAndMouse(int x,int y, int z){
        int dist1=Math.abs(x-z);
        int dist2=Math.abs(y-z);
        if(dist1<dist2){
            System.out.println("Cat A");
        }else if(dist2<dist1){
            System.out.println("Cat B");
        }else{
            System.out.println("Mouse C");
        }
    }
}
