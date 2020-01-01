import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
public class ProblemB {
    public static void main(String args[]) throws java.io.IOException{
        Charset charset = Charset.forName("ascii");
        FastIO rd = new FastIO(System.in, System.out, charset);
        int T = rd.readInt();
        while (T-- > 0) {
            int N = rd.readInt();
            String s =rd.readString();
            int[] arr = new int[3];
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'G') {
                    arr[0]++;
                } else if (s.charAt(i) == 'R') {
                    arr[1]++;
                } else if (s.charAt(i) == 'B') {
                    arr[2]++;
                }
            }
            Arrays.sort(arr);
            System.out.println(arr[0] + arr[1]);
        }
        rd.flush();
        
        
    }
    
}
