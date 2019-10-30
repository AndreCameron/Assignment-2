package assignment2;

public class Driver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveMathLib recursionLibrary
	 	= new RecursiveMathLib();
	IterationMathLib iterationLibrary
 		= new IterationMathLib();
	System.out.println("----- Recursion -----");
	runTestCode(recursionLibrary);
	System.out.println("----- Iteration -----");
	runTestCode(iterationLibrary);
	
	
	}

	private static void runTestCode(MathLib Library) {
		System.out.println("GCD of 4,1 = " +Library.gcd(4, 2));
		
	}
}
