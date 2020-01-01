import java.io.*;

import java.lang.reflect.Array;
import java.math.*;
import java.util.*;
class NumberTheory
{
    public boolean isPrime(long n)
    {
        if(n < 2)
            return false;
        for(long x = 2;x * x <= n;x++)
        {
            if(n % x == 0)
                return false;
        }
        return true;
    }
    public ArrayList<Long> primeFactorisation(long n)
    {
        ArrayList<Long> f = new ArrayList<>();
        for(long x=2;x * x <= n;x++)
        {
            while(n % x == 0)
            {
                f.add(x);
                n /= x;
            }
        }
        if(n > 1)
            f.add(n);
        return f;
    }
    
    public long gcd(long a, long b)
    {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public long phi(long n)
    {
        double result = n;
        
        for(long p=2;p*p<=n;p++)
        {
            if(n % p == 0)
            {
                while (n % p == 0)
                    n /= p;
                result *= (1.0 - (1.0 / (double)p));
            }
        }
        if(n > 1)
            result *= (1.0 - (1.0 / (double)n));
        return (long)result;
    }
    public Name extendedEuclid(long a, long b)
    {
        if(b == 0)
            return new Name(a, 1, 0);
        Name n1 = extendedEuclid(b, a % b);
        Name n2 = new Name(n1.d, n1.y, n1.x - (long)Math.floor((double)a / b) * n1.y);
        return n2;
    }
    public long modularExponentiation(long a, long b, long n)
    {
        long d = 1L;
        String bString = Long.toBinaryString(b);
        for(int i=0;i<bString.length();i++)
        {
            d = (d * d) % n;
            if(bString.charAt(i) == '1')
                d = (d * a) % n;
        }
        return d;
    }
    long pow(long base, int exp) {
        if (exp == 0) return 1L;
        long x = pow(base, exp/2);
        long ans = x * x;
        if (exp % 2 != 0) ans *= base;
        return ans;
    }
    
    long gcd(long... v) {
        /** Chained calls to Euclidean algorithm. */
        if (v.length == 1) return v[0];
        long ans = gcd(v[1], v[0]);
        for (int i=2; i<v.length; i++) {
            ans = gcd(ans, v[i]);
        }
        return ans;
    }
    
    long gcd(long a, long b) {
        /** Euclidean algorithm. */
        if (b == 0) return a;
        return gcd(b, a%b);
    }
    
    int[] generatePrimesUpTo(int last) {
        /* Sieve of Eratosthenes. Practically O(n). Values of 0 indicate primes. */
        int[] div = new int[last+1];
        for (int x=2; x<=last; x++) {
            if (div[x] > 0) continue;
            for (int u=2*x; u<=last; u+=x) {
                div[u] = x;
            }
        }
        return div;
    }
    
    long lcm(long a, long b) {
        /** Least common multiple */
        return a * b / gcd(a,b);
    }
    public static int lowerBound(int[] array, int length, int value) {
        int low = 0;
        int high = length-1;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value <= array[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static int upperBound(int[] array, int length, int value) {
        int low = 0;
        int high = length-1;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
class Name
{
    long d;
    long x;
    long y;
    
    public Name(long d, long x, long y)
    {
        this.d = d;
        this.x = x;
        this.y = y;
    }
}