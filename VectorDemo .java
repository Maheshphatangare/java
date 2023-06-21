// Java code to illustrate hashCode()
import java.util.*;

public class VectorDemo {
	public static void main(String args[])
	{
		// Creating an empty Vector
		Vector<Integer> vec_tor = new Vector<Integer>();

		// Use add() method to add elements into the Vector
		vec_tor.add(10);
		vec_tor.add(20);
		vec_tor.add(30);
		vec_tor.add(40);
		vec_tor.add(50);

		// Displaying the Vector
		System.out.println("Vector: " + vec_tor);

		// Displaying the hashCode value of Vector
		System.out.println("The hashCode value is: "
						+ vec_tor.hashCode());
	}
}
