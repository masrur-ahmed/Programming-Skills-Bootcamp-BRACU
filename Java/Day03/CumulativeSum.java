public static int [] out = new int[input.length];
public int[] makeCumulative(int[] input) {
    
    int total = 0;
    for (int i = 0; i < input.length; i++) {
        total += input[i];
        out[i] = total;
    }
    return out;
}