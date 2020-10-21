
public class Primos {

	public static void main(String[] args) {
		System.out.println(
				"La suma de los números primos que hay entre los 50 primeros números es: " + sumPrimeUntil(50));
		System.out.println("La suma de los 50 primeros números primos es: " + sumFirstPrime(50));

	}

	private static int sumPrimeUntil(int until) {
		int sum = 0;
		for (int i = 0; i < until; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	private static int sumFirstPrime(int numPrimes) {
		int sum = 0;
		int nextNumber = 0;
		int cont = 0;
		while (cont < numPrimes) {
			if (isPrime(nextNumber)) {
				sum += nextNumber;
				cont++;
			}
			nextNumber++;
		}
		return sum;
	}

	private static boolean isPrime(int number) {
		return isPrime(number, 2);
	}

	private static boolean isPrime(int dividend, int divisor) {
		if (dividend < 2) {
			return false;
		}
		if (dividend / 2 < divisor) {
			return true;
		}
		if (dividend % divisor == 0) {
			return false;
		}
		
		return isPrime(dividend, ++divisor);
	}
}
