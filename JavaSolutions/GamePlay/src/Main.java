import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Themepark g;
        Scanner s = new Scanner(System.in);
        int op = s.nextInt();
        if(op==1)
            g = new Queensland();
        else
            g = new Wonderla();
        while (s.hasNext())
        {
            g.gameplay(s.nextInt());
        }
    }
}
