package edu.vu.vuse.cs278.g3.engine;

public class PhysicsFormulas {

	/**
	 * Implements the formula F = um;
	 * Pass one parameter as null and the calculated value of that
	 * parameter will be returned.
	 * @param f The frictional force applied to the object
	 * @param m The mass of the object
	 * @param u The coefficient of friction
	 * @return The returned value is the calculated value of the parameter that
	 * was passed as null.
	 * @throws TooManyNullArgumentsException Thrown if more than one argument is null. 
	 */
	public static Double frictionalForce(Double f, Double m, Double u) throws TooManyNullArgumentsException {
		int code = 0;
		code += (f == null) ? 1 : 0;
		code += (m == null) ? 10 : 0;
		code +=	(u == null) ? 100 : 0;
		
		switch(code) {
		// Solving for F
		// Formula is F = um
		case 1:
			return u*m;
			
		// Solving for m
		// Formula is m = F/u
		case 10:
			return f/u;
			
		// Solving for u
		// Formula is u = F/m
		case 100:
			return f/m;
		}
		throw new TooManyNullArgumentsException(code);
	}
	
	/**
	 * This function implements the formula for an objects momentum. 
	 * @param P The momentum of the object.
	 * @param m The mass of the object.
	 * @param v The velocity of the object.
	 * @return The value returned is the argument that was set to null in the arguments.
	 * @throws TooManyNullArgumentsException Thrown if more than one argument is null.
	 */
	public static Double momentum(Double P, Double m, Double v) throws TooManyNullArgumentsException {
		int code = 0;
		code += (P == null) ? 1 : 0;
		code += (m == null) ? 10 : 0;
		code +=	(v == null) ? 100 : 0;
		
		switch(code) {
		// Solving for P
		// Formula is P = vm
		case 1:
			return v*m;
			
		// Solving for m
		// Formula is m = P/v
		case 10:
			return P/v;
			
		// Solving for v
		// Formula is v = P/m
		case 100:
			return P/m;
		}
		throw new TooManyNullArgumentsException(code);
	}
	
	
	/**
	 * This exception indicates that too many null arguments were passed to
	 * one of the above PhysicsFormulas.
	 * @author Matthew Shea
	 *
	 */
	public static class TooManyNullArgumentsException extends Exception {

		private static final long serialVersionUID = 579634328683341549L;
		int number = 0;
		public TooManyNullArgumentsException(int number) {
			this.number = number;
		}
		
		public String getError() {
			return new StringBuilder().append(number).append(" arguments given.").toString();
		}
		
		
	}
}
