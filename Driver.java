package com.greatlearning.driver;
import com.greatlearning.services.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {

		String expr = "({[]})[]";

		if (BalancingBrackets.areBracketsBalanced(expr))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}
