import java.util.Scanner; 

/**
 * Write a Java program that reads a floating-point number 
 * and prints "zero" if the number is zero. Otherwise, print 
 * "positive" or "negative". Add "small" if the absolute value 
 * of the number is less than 1, or "large" if it exceeds 1,000,000.
 * 
 * @author Darren
 *
 */

public class FloatMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean exit = false; 
		
		do {
			System.out.println("Enter a floating point number");
			Scanner scanner = new Scanner(System.in); 
			String input = scanner.nextLine(); 
			
			if(input.isEmpty()) {
				exit = true; 
			}
			else {
				float num = Float.parseFloat(input);
				String modifier = ""; 
				
				if(Math.abs(num) < 1) {
					modifier = "Small";
				}
				else if(num > 1000000) { 
					modifier = "Large";
				}
				
				if(num == 0) {
					System.out.println("Zero");
				}
				else {
					System.out.println(modifier + (num > 0 ? "Positive":"Negative"));
			
				}
			}
			if(exit) {
				scanner.close();
			}
		}while(!exit);

	}

}
