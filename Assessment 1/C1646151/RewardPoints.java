
import java.util.Scanner;
public class RewardPoints {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter how much money was spent this month");
	int x = in.nextInt();
	int points = 0;	 

	if (x <= 99 && x > 0){
		points = 100;
	}
	else if (x < 1){
		points = 0;
	}
	else if (x >= 100 && x < 250){
		points = 250;
	}
	else if (x >= 250 && x < 500){
		points = 500;
	}
	else if (x >= 500 && x < 1001){
		points = 1000;
	}
	else if (x > 1000){
		points = 1500;
	}
	System.out.println("You have " + points + " points!");
    }
 
}