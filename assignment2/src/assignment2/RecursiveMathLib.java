package assignment2;

public class RecursiveMathLib 
extends MathLib
{

	@Override
	int gcd(int x, int y) {
		
		if (y==0) {
			return x;
		}else if ( x != 0 && x >= y) {
			return gcd(y, x % y);
		}
		System.out.println("Recursive GCD not implemented");
		return 0;
	}

	@Override
	int ack(int x, int y) {
		
		if (x==0) {
			return y+1;
		} else if (y==0) {
			return ack(x-1, 1);
		} else if (x != 0 && y != 0) {
			return ack((x-1), ack(x, y-1));
		}
		return 0;
	}

	@Override
	int fib(int x) {
		if (x==0) {
			return 0;
		} else if (x==1) {
			return 1;
		} else if (x > 1) {
			return fib((x-1) + fib(x-2));
		}
		return 0;
	}

	@Override
	int hanoi(int n) {
		if (n==1) {
			return 1;
		} else if (n>1) {
			return (2* hanoi(n-1)+1);
		}
		return 0;
	} 

}
