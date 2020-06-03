import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Map<Character, Integer> map=new HashMap<>();
        for(int i=97;i<=122;i++){
            map.put((char)(i), s.nextInt());
        }
        String str=s.next();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            arrayList.add(map.get(str.charAt(i)));
        }
        System.out.println(function(arrayList,str));
    }
    public static int function(ArrayList<Integer> h, String word){
        int area= Collections.max(h)*word.length();
        return area;
    }
}
