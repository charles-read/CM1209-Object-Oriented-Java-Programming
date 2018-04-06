/*
 * Name: Charles David Read
 * Student number: C1646151
 */

//RandomCounter.java
// Application to generate and add up 10 random integer values between 0 and 100. As each random number is generated, it is printed to the screen. Finally the sum of the generated numbers is output. An example of a correctly formatted output is:

//86 44 77 65 73 81 86 95 72 28

//Sum of the 10 random numbers is 707

import java.lang.Math;
public class RandomCounter {
    public static void main(String[] args) {
        int randomCount = 0;
        for(int i = 0; i < 11 ; ++i) {
            int randNum = (int) Math.floor(Math.random()*101);
            System.out.print(randNum + " ");
            randomCount += randNum;
        }
        System.out.println("The Sum of the 10 random numbers is " +randomCount+ ".");
    }    
}