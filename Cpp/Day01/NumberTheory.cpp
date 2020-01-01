  int gcd ( int a, int b ) {
    a = ABS ( a ); b = ABS ( b );
    while ( b ) { a = a % b; swap ( a, b ); } return a;
}
  int lcm ( int a, int b ) {
    a = ABS ( a ); b = ABS ( b );
    return ( a / gcd ( a, b ) ) * b;
}

#define SIZE 10000
vector < int > prime;
char stat[SIZE];
void prime_sieve ( int n ) {
    int sqrtn = sqrt ( n );
    prime.pb ( 2 );
    for ( int i = 3; i <= sqrtn; i += 2 ) {
        if ( stat[i] == 0 ) {
            for ( int j = i * i; j <= n; j += 2 * i ) stat[j] = 1;
        }
    }
    for ( int i = 3; i <= n; i += 2 ) if ( stat[i] == 0 ) prime.pb ( i );
}

void factorize ( int n ) {
    int sqrtn = sqrt ( n );
    for ( int i = 0; i < prime.size() && prime[i] <= sqrtn; i++ ) {
        //if ( stat[n] == 0 ) break;  <- Extra optimization. Not always needed.
        if ( n % prime[i] == 0 ) {
            int p = 0;
            while ( n % prime[i] == 0 ) {
                p++;
                n /= prime[i];
            }
            //Do something here, according to problem
            sqrtn = sqrt ( n );
        }
    }
    if ( n != 1 ) {
        //Do something here, according to problem
    }
}


int findTrailingZeros(int n)
{
    // Initialize result
    int count = 0;

    // Keep dividing n by powers of
    // 5 and update count
    for (int i = 5; n / i >= 1; i *= 5)
        count += n / i;

    return count;
}


int ext_gcd (int a,int b,int &x,int &y) {
    if (a == 0) {
        x = 0;
        y = 1;
        return b;
    }
    int x1, y1;
    int d = ext_gcd (b%a, a, x1, y1);
    x = y1 - (b / a) * x1;
    y = x1;
    return d;
}


