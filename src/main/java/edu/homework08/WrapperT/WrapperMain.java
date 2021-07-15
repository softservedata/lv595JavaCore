package edu.homework08.WrapperT;

public class WrapperMain {
	public static void main(String[] args) {
		Wrapper<Integer> wrap1 = new Wrapper<>();
		wrap1.setValue(10);

		Wrapper<String> wrap2 = new Wrapper<>();
		wrap2.setValue("Hello");

		Wrapper<Boolean> wrap3 = new Wrapper<>();
		wrap3.setValue(true);

		System.out.println(wrap1.getValue());
		System.out.println(wrap2.getValue());
		System.out.println(wrap3.getValue());
		System.out.println();
		System.out.println(wrap1.toString());
		System.out.println(wrap2.toString());
		System.out.println(wrap3.toString());
	}

}
