package ub05;

public class test {

	public static void main(String[] args) {
		String testString = "1.1";
		String [] parts = testString.split("\\.");
		
		System.out.println(parts[0]);
		System.out.println(parts[1]);


	}

}
