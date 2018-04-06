/*
 * Name: Charles David Read
 * Student number: C1646151
 */

import java.util.Arrays;
import java.util.Scanner;
public class NameSort {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] arrayNames = new String[3];
		System.out.println("Please enter 3 names to sort");
    	for (int i = 0; i < arrayNames.length; i++) {
        	arrayNames[i] = in.nextLine();
    	}
    	Arrays.sort(arrayNames);
    	System.out.println("");
    	System.out.println("Sorted:");
    	for ( int x = 0 ; x < arrayNames.length ; x++ ) {
    		System.out.println("");
            System.out.println(arrayNames[x]);
		}
	}
}

