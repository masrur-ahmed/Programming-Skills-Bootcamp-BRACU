import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    static int[] a = new int[1000008];

    public static Boolean ok(int idx, int mid, int x) {
        return a[mid] - a[idx] <= x;
    }
    public static void main(String[] args) throws java.lang.Exception {
        int n, x, count = 0, low, mid, high;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a, 0, n);

        low = 0;
        high = n - 1;
        for (int i = 0; i < n; i++) {
            low = i;
            high = n - 1;
            while ((high - low) >= 2) {
                mid = (low + high) / 2;
                if (ok(i, mid, x)) {
                    low = mid;
                } else high = mid;
            }
            for (; low <= high; low++) {
                if (a[low] - a[i] > x) break;
                else if (Math.abs(a[low] - a[i]) == x) count++;

            }
        }
        System.out.println(count);
    }
}

/* 
public static int binarySearch(data_type[] arr, int fromIndex, int toIndex, data_type key)
Parameters :
arr – the array to be searched
fromIndex – the index of the first element (inclusive) to be searched
toIndex - the index of the last element (exclusive) to be searched
 key  – the value to be searched for
 */
