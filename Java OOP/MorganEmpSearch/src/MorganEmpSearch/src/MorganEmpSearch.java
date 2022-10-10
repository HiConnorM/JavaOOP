package MorganEmpSearch.src;

import java.util.ArrayList;
import java.util.Scanner;


public class MorganEmpSearch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int employeeCount = 0;
		String inputId;
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> id = new ArrayList<>();
		
		System.out.print("Enter employee name: ");
		String inputName = in.nextLine();
		
		while(employeeCount < 10 && inputName.compareTo("ZZZ")!=0)
		{
			
			System.out.print("Enter Employee ID: ");
			inputId = in.nextLine();
			
			names.add(inputName);
			id.add(inputName);
			
			System.out.print("Enter employee name: ");
			inputName = in.nextLine();
			
			employeeCount++;
			
		}
		
		System.out.print("Names entered: ");
		for(int i = 0; i < employeeCount; i++)
		
			System.out.print(names.get(i)+" ");
		System.out.println("\n");
		
		System.out.print("Enter search ID: ");
		String SearchId = in.nextLine();
		
		while(SearchId.compareTo("ZZZ")!=0)
		{
			boolean flag = false;
			
			for(int i = 0; i<employeeCount;i++) 
				if(id.get(i).compareTo(SearchId)==0)
				{
					System.out.println("Name of employee: " + names.get(i) + "\n ID of employee: " + id.get(i));
					flag = true;
					break;
				}
			if(flag==false) {
				System.out.println("Invalid ID entered");
			}
			
			System.out.print("Enter ID that you ebtered to search: ");
			SearchId = in.nextLine();
			
		}

	}

}