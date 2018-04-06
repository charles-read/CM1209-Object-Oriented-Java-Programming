/*
 * Name: Charles David Read
 * Student number: C1646151
 */

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
      String str_norm;
      String str_rev = "";
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter phrase/word, spaces are ignored. ");
      str_norm = in.nextLine();

      for ( int x = (str_norm.length()) - 1; x >= 0; x-- ){
         str_rev = str_rev + str_norm.charAt(x);
      }
      if (str_norm.replaceAll("\\s+","").equals(str_rev.replaceAll("\\s+",""))){
         System.out.println("Phrase/word is a palindrome.");
      }
      else{
         System.out.println("Phrase/word is not a palindrome.");
      }
   }
}