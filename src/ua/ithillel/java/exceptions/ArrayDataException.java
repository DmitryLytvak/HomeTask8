package ua.ithillel.java.exceptions;

public class ArrayDataException extends Throwable {
	
	public int i;
	public int j;
	
	
	public ArrayDataException(int i, int j) {
		this.i = i;
		this.j = j;
	}
}


