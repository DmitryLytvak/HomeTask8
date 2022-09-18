package ua.ithillel.java.controller;

import static java.util.Objects.isNull;

import ua.ithillel.java.exceptions.ArrayDataException;
import ua.ithillel.java.exceptions.ArraySizeException;

public class ArrayValueCalculator {
	
	public static int doCalc(String[][] arr) throws ArraySizeException, ArrayDataException {
		int count = 0;
		if (isNull(arr)) {
			System.out.println("Data entered incorrectly.");
		}
		if (arr.length != 4) {
			throw new ArraySizeException("Array size exceeds allowed size!");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length != 4) {
				throw new ArraySizeException("Array size exceeds allowed size!");
			}
			for (int j = 0; j < arr[i].length; j++) {
				try {
					count = count + Integer.parseInt(arr[i][j]);
				} catch (NumberFormatException e) {
					throw new ArrayDataException(i, j);
				}
			}
		}
		return count;
	}
}
