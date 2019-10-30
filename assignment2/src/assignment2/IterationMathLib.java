package assignment2;

public class IterationMathLib 
extends MathLib
{
	@Override
	int gcd(int x, int y) {
		int temp;
		while(y != 0) {
			if (x >= y && x != 0) {
				temp = x;
				x = y;
				y = temp % y;
			}
		}
	return 0;
	}

	@Override
	int ack(int x, int y) {
		while (x!=0){
			
		if (y==0)
			return ack(x-1, 1);
	}
	return y+1;
	}

	@Override
	int fib(int x){
		while (x!=0)
		{
		if (x==1)
		return 1;
		if(x>1)
		return fib(x-1) + fib(x-2);
		}
		return 0;
		}

	@Override
	int hanoi(int n){
		while(n!=1)
		{
		if (n>1) {
		return 2*hanoi(n-1)+1;
		}
		return 1;
		}
		return 0;
	}
}

