// Connor Morgan
// Java OOP
// Triangle Project
// Oct 8th 2022

import java.util.Scanner; 

public class Main {
    private static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {

        double side1 = 0;
        double side2 = 0;
        double side3 = 0;

        boolean flag = false; 

       
        while (!flag) {
            System.out.println("Enter 3 sides of Triangle: ");
            side1 = sc.nextDouble(); 
            side2 = sc.nextDouble();
            side3 = sc.nextDouble();

            
            if (side1 > 0 && side2 > 0 && side3 > 0 && side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2)
                flag = true; 
        }

        System.out.println("Enter the Color of Triangle: ");
        String color = sc.next(); 

        System.out.println("Is the Triangle is filled(True/False): ");
        boolean filled = sc.nextBoolean(); 

        GeometricObject triangle = new Triangle(side1, side2, side3);
        triangle.setFilled(filled); 
        triangle.setColor(color); 

        System.out.println(triangle); 
        System.out.printf("Area of Triangle : %.2f\n", ((Triangle) triangle).getArea());
        System.out.println("Color of Triangle : " + triangle.getColor()); 
        System.out.println("Triangle Filled : " + triangle.isFilled()); 
    }
}
