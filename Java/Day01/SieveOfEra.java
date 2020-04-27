class SieveOfEra
{
	public static void Sieve(int mx) {
		int[] prime = new int[mx + 1];
		for (int i = 0; i <= mx; i++) {
			prime[i] = 1;
		}

		for (int i = 2; i <= Math.sqrt(mx); i++) {
			if (prime[i] == 1){
				for (int j = 2; i * j <= mx; j++) {
					prime[i * j] = 0;
				}
			}
		}

		for (int i = 2; i <= mx; i++) {
			if (prime[i] == 1) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Sieve(100);
	}
}
