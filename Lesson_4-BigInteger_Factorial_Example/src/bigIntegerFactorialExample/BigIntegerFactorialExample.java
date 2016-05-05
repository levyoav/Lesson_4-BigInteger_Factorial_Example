package bigIntegerFactorialExample;

import java.math.BigInteger;

public class BigIntegerFactorialExample {

	public static void main(String[] args) {

		//Randomise a number for factorial.
		int n = (int) (Math.random() * 101);
		System.out.println(n);

		//Initialise the first number to 1.
		long f1 = 1;

		for (int i = 2; i <= n; i++) {
			//For large values of n, the factorial of that value will cause an overflow when using a long variable to store the result.
			//This will result in wrong value of the factorial.
			f1 = f1 * i;
		}

		System.out.println(f1); //For large n values, wrong values of factorial will be printed.  

		//Using BigInteger class for representing very large numbers. This class can be AS BIG AS NEEDED.  
		BigInteger f2 = new BigInteger("1"); //Need to use String as representation of int. 

		for (int i = 2; i <= n; i++) {
			//BigInteger is an immutable class. So whenever you do any arithmetic, you have to reassign the output to a variable.
			//so the method multiply() of BigInteger class does not multiply new BigIntger value with its own value, but creates and returns
			//a new BigInteger reference without changing the current BigInteger and this is what done even in the case of Strings. Need to use
			//the String.valueOf(i) method to invoke the BigInteger CTOR that receives String as parameter.
			f2 = f2.multiply(new BigInteger(String.valueOf(i)));
		}

		System.out.println(f2); //Very long numbers will be printed.

	}

}
