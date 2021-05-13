package com.softserve.edu.homework04;

public class App {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FloatChecker float1 = new FloatChecker();
		FloatChecker float2 = new FloatChecker();
		FloatChecker float3 = new FloatChecker();
		
		float1.setNumber();
		float2.setNumber();
		float3.setNumber();
		
		System.out.println(float1.inRange());
		System.out.println(float2.inRange());
		System.out.println(float3.inRange());
		
		
		
		
		IntChecker case2 = new IntChecker();
		
		case2.setInt1();
		case2.setInt2();
		case2.setInt3();
		
		case2.printMax();
		case2.printMin();
		
		HttpErrors error1 = HttpErrors.BadRequest;
		
		switch (error1) {
		case BadRequest:
			System.out.println(error1.promptError() + error1.getDiscription());
			break;
		case Forbidden:
			System.out.println(error1.promptError() + error1.getDiscription());
			break;
		case NotFound:
			System.out.println(error1.promptError()  + error1.getDiscription());
			break;
		case Unauthorized:
			System.out.println(error1.promptError() + error1.getDiscription());
			break;
		default:
			System.out.println("Unknown HTTP error!");
			break;
		}
	
	}
}
