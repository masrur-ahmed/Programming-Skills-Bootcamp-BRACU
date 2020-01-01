public class Mod {
        int m;
 
        public Mod(int m) {
            this.m = m;
        }
 
        public int modOpt(int x) {
            x %= m;
            if (x < 0) {
                x += m;
            }
            return x;
        }
 
        public int modOpt(long x) {
            x %= m;
            if (x < 0) {
                x += m;
            }
            return (int) x;
        }
 
        public int mul(int x, int y) {
            return modOpt((long) x * y);
        }
 
        public int mul(long x, long y) {
            x = modOpt(x);
            y = modOpt(y);
            return modOpt(x * y);
        }
 
        public int plus(int x, int y) {
            return modOpt(x + y);
        }
 
        public int plus(long x, long y) {
            x = modOpt(x);
            y = modOpt(y);
            return modOpt(x + y);
        }
 
        public int subtract(int x, int y) {
            return modOpt(x - y);
        }
 
        public int subtract(long x, long y) {
            return modOpt(x - y);
        }
}