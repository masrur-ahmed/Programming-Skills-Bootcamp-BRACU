import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
public class ProblemD {
 static int gcd(int x, int y){
  if(y == 0)return x;
  return gcd(y, x%y);
 }
 public static void main(String[] args) {
    Charset charset = Charset.forName("ascii");
        FastIO rd = new FastIO(System.in, System.out, charset);
  int n = rd.readInt();
  int gcd = rd.readInt();
  for(int i = 1; i < n; i ++)
   gcd = gcd(gcd, rd.readInt());
  System.out.println(gcd*n);
 }

}