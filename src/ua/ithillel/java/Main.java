package ua.ithillel.java;

import ua.ithillel.java.controller.ArrayValueCalculator;
import ua.ithillel.java.exceptions.ArrayDataException;
import ua.ithillel.java.exceptions.ArraySizeException;

public class Main extends ArrayValueCalculator {
	
	public static void main(String[] args) {
		
		String[][] arr = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"},
				{"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
		
		try {
			try {
				int result = doCalc(arr);
				System.out.println(result);
			} catch (ArraySizeException e) {
				System.out.println("Array size exceeds allowed size!");
			} catch (ArrayDataException e) {
				System.out.println("Wrong array value!");
				System.out.println("Error in cell: " + e.i + "/" + e.j);
			}
		} finally {
			System.out.println("Program is over!");
			
		}
	}
}

