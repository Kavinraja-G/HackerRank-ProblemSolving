import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
        }
        Collections.sort(a);
        Collections.reverse(a);
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> arr3=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(a.get(i)+a.get(j)>a.get(k) && a.get(k)+a.get(i)>a.get(j) && a.get(j)+a.get(k)>a.get(i)){
                        if(a.get(i)+a.get(j)+a.get(k)>max){
                            max=a.get(i)+a.get(j)+a.get(k);
                            arr1.add(max);
                            arr2.add(a.get(i));
                            arr2.add(a.get(j));
                            arr2.add(a.get(k));
                        }
                    }
                }
            }
        }
        if(arr1.size()==0){
            System.out.println("-1");
        }else{
            int g=arr1.indexOf(Collections.max(arr1));
            int i=g*3;
            arr3.add(arr2.get(i));
            arr3.add(arr2.get(i+1));
            arr3.add(arr2.get(i+2));
            Collections.sort(arr3);
            for(int u:arr3){
                System.out.printf("%d ",u);
            }
        }
    }
}
