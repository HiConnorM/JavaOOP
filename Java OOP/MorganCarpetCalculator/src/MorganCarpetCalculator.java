//Connor Morgan
// Java OOP 
// CarpetCalculator project
// Sept. 30th 2022

import java.util.Scanner;

public class MorganCarpetCalculator {

	public static void main(String[] args) {
		double length , width, CarpetCostPerFoot, TotalCarpetCost;
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter the length of carpet in feet: ");
			
			length = in.nextDouble();
			
			if (length <0) {
				System.out.println("Input must be positive integer ");
				continue;
			} 
			else
				break;
			
		}

		while(true) {
			System.out.print("Enter the width of carpet in feet: ");
			
			width = in.nextDouble();
			
			if (width <0) {
				System.out.println("Input must be positive integer ");
				continue;
			} 
			else
				break;
		}
		
		
		while(true) {
			System.out.print("Enter cost of carpet per square feet: ");
			
			CarpetCostPerFoot = in.nextDouble();
			
			if (CarpetCostPerFoot <0) {
				System.out.println("Input must be positive integer ");
				continue;
			} 
			else
				break;
			
		}
		
		RoomDimension dimension = new RoomDimension(length,width);
		
		RoomCarpet roomcarpet = new RoomCarpet(CarpetCostPerFoot, dimension);
		
		TotalCarpetCost = roomcarpet.totalCarpetCost();
		
		System.out.println("Total cost of carpet is: $"+ TotalCarpetCost);
		
	}

}
