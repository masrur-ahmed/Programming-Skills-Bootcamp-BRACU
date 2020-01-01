import java.io.*;
import java.nio.charset.Charset;
public class ProblemC{
    
    public static void main(String args[]){
        Charset charset = Charset.forName("ascii");
        FastIO rd = new FastIO(System.in, System.out, charset);
        
        int n = rd.readInt();
        
        int d[] = new int[7];
        for(int i=0;i<7;i++){
            d[i] = rd.readInt();
        }
        
        int day = 0;
        while(n>0){
            day%=7;
            n-=d[day++];
        }
        System.out.print(day);
    }
}
