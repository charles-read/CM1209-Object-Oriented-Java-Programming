/*
 * Name: Charles David Read
 * Student number: C1646151
 */

import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
    int sumEven = 0;
    int sumOdd = 0;	
    Scanner in = new Scanner(System.in);
    int[] intVal = new int[5];
		System.out.println("Enter an integer");
    	for (int i = 0; i < intVal.length; i++) {
        	intVal[i] = in.nextInt();
    	}
    	for(int i = 0; i < intVal.length; i++){
            if(intVal[i] % 2 == 0){
                sumEven = sumEven + intVal[i];
            }
            else{
                sumOdd = sumOdd + intVal[i];
            }
        }
        System.out.println("");
        System.out.println("The sum of even integers is " +sumEven+  ". The sum of odd integers is " +sumOdd+ ".");
   }
}