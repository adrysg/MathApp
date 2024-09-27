package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
// Question 1:
// declare variables here
       int bobSalary = 150000;
       int garySalary = 175000;

// then code solution
        int highestSalary= Math.max(garySalary, bobSalary);

// then use System.out.println() to display results
        System.out.println("The highest salary is " + highestSalary);

// Question 2:
// declare variables here
        int carPrice = 5500;
        int truckPrice = 10500;

// then code solution
        int smallest= Math.min(carPrice, truckPrice);

// then use System.out.println() to display results
        System.out.println("The smallest variable is " + smallest);

// Question 3:
// declare variables here
        double radius = 7.25;
// then code solution
    // area = PI * radius^2
        double area = Math.PI * Math.pow(radius, 2);

// then use System.out.println() to display results
        System.out.println("The circle area is " + area);

// Question 4:
// declare variables here
        double num = 5.0;

// then code solution
        double squareRoot = Math.sqrt(num);

// then use System.out.println() to display results
        System.out.println("The square root is " + squareRoot);

// Question 5:
// declare variables here
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

// then code solution
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2));

// then use System.out.println() to display results
        System.out.println("The distance between these points is " + distance);

// Question 6:
// declare variables here
        double value = -3.8;
// then code solution
        double  absoluteValue = Math.abs(value);

// then use System.out.println() to display results
        System.out.println("The absolute (positive) value is " + absoluteValue);

// Question 7:
// declare variables here
        double randNum = Math.random();

        System.out.println("Here is a random number between 0 and 1: " + randNum);


    }
}
