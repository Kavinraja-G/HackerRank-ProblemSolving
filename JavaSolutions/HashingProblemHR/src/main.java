import java.util.Hashtable;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int l1 = s.nextInt();
        int l2 = s.nextInt();
        s.nextLine();
        String magazine = s.nextLine();
        String rasom = s.nextLine();
        String[] wordsinRasom = rasom.split(" ");
        String[] wordsinMagazine = magazine.split(" ");
        Hashtable<String, Integer> magTable = new Hashtable<String, Integer>();
        for(String e : wordsinMagazine){
            if(magTable.containsKey(e))
            {
                magTable.put(e,magTable.get(e)+1);
            }
            else
            {
                magTable.put(e,1);
            }
        }
        System.out.println(magTable);

        for (String e : wordsinRasom) {
            if (!magTable.containsKey(e)) {
                System.out.println("No");
                break;
            }
            int excessCount = magTable.get(e)-1;
            if(excessCount == 0)
                magTable.remove(e);
            else
                magTable.put(e,excessCount);
        }
        System.out.println("Yes");
    }
}
