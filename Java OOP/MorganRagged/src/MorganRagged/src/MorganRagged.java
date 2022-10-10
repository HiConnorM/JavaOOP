package MorganRagged.src;
import java.util.Scanner;

public class MorganRagged {
	public static void main(String[] args) {
		int[][] ragged = new int[5][];
		Scanner input = new Scanner(System.in);
		int size, sum, min, max;

		for(int i = 0;i<ragged.length;i++){
			System.out.print("Enter size of tested array "+(i+1)+": ");
			size = input.nextInt();

			if(size>0) {
				System.out.println("Enter "+ size +" numbers");
				ragged[i] = new int[size];

				for (int j = 0; j < size; j++) {
					ragged[i][j] = input.nextInt();
				}

				sum = ragged[i][0];
				min = ragged[i][0];
				max = ragged[i][0];

				for (int j = 1; j < size; j++) {
					sum += ragged[i][j];
					if(min > ragged[i][j]){
						min = ragged[i][j];
					}
					if(max < ragged[i][j]){
						max = ragged[i][j];
					}
				}

				System.out.println("Sum of row "+(i+1)+" is "+sum);
				System.out.println("Minimum of row "+(i+1)+" is "+min);
				System.out.println("Maximum of row "+(i+1)+" is "+max);
			}
		}
	}
}