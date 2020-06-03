import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BoxWeight box1=new BoxWeight(s.nextDouble(),s.nextDouble(),s.nextDouble(),s.nextDouble());
        BoxWeight box2=new BoxWeight(s.nextDouble(),s.nextDouble(),s.nextDouble(),s.nextDouble());
        System.out.println("box1 weight = "+box1.weight);
        System.out.println("box1 volume = "+box1.volume());
        System.out.println("box2 weight = "+box2.weight);
        System.out.println("box2 volume = "+box2.volume());

        BoxWeight clone1=new BoxWeight(box1);
        System.out.println("clone1 weight = "+clone1.weight);
        System.out.println("clone1 volume = "+clone1.volume());
        BoxWeight clone2=new BoxWeight(box2);
        System.out.println("clone2 weight = "+clone2.weight);
        System.out.println("clone2 volume = "+clone2.volume());
    }
}
