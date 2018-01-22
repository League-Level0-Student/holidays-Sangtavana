import java.util.Random;

import javax.swing.JOptionPane;

// This recipe adds random numbers until the sum is exactly 2018!!!
//     Happy New Year!

public class HappyNewYear {
	public static void main(String[] args) {
		// 1. Make a variable 'newYear' and initialize it to 2018.
int newYear = 2018;

		// 7. Repeat steps 2 to 6 (10 times)
for (int j = 0; j < 10; j++) {
	

			// 2. Make a variable 'sum' and initialize to 0
int sum=0;
			
			// 3. Repeat steps 4 to 6 (500 times) 
Random r = new Random();
for(int i=0;i<500;i++){
				// 4. Get a random number between 0 and 50
int x= r.nextInt(51);

				
				// 5. If sum is less than newYear then add your random
				//    number to your sum, otherwise subtract it.
				
if (sum < newYear) {
	sum=sum+x;
}else{
	sum=sum-x;
}

				// 6. If your sum matches newYear, then print the number of tries
				//    to the console and use the "break" statement to exit the loop
				 if (sum>=newYear) {
					JOptionPane.showMessageDialog(null, "You took " + i + " amount of tries");
					break;
				}
}
		
		// *** BONUS: Keep track of your best score and worst score, and print
		//            the results to the console.
		
	}
}
}