import java.util.Scanner;

public class MegabyteConverter {
    public static void main(String[] args) {
        /*printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);*/
        //Scanner scan = new Scanner(System.in);
        //int x;
        //System.out.println("Enter the Kilobytes value:");
        //x = scan.nextInt();
        //printMegaBytesAndKiloBytes(x);
        //For Loop:
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d%n", i);
        }
        //While Loop:
        int w = 0;
        while (w != 5) {
            System.out.println(w * 3);
            w++;
        }
        //Do- While Loop:
        int d = 100;
        do {
            System.out.println(d * 3);
        } while (d != 100);

        String s = "kavingautham";
        int count = 0;
        for (int i=0;i<s.length();i++)
        {
            char val = s.charAt(i);
            switch (val)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Vowel Count = "+ count);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes > 0) {
            int megabytes = kiloBytes / 1024;
            int remainingkilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingkilobytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
