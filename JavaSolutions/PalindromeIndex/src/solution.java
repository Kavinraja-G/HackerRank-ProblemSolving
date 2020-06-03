import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class solution {
    public static boolean checkPalindrome(String s, int i)
    {
        StringBuilder str = new StringBuilder(s);
        str.deleteCharAt(i);
        String ls = str.substring(0,str.length()/2);
        String rs = str.substring(str.length()/2,str.length());
        StringBuilder right = new StringBuilder(rs);
        if(ls.equals(right.reverse().toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static int palindromeIndex(String s) {
        int i=0,j=s.length()-1;
        while((i<=j))
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;j--;
            }
            else
            {
                if(checkPalindrome(s,i))
                {
                    return i;
                }
                else
                {
                    return j;
                }
            }
        }
        return -1;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
