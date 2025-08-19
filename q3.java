/*Question 3: Calculate the Factorial of a Number
Problem Statement:
Write a Java program that asks the user for a number N and calculates the factorial of N using a for loop.
Sample Input:
Enter a number: 5
Expected Output:
Factorial of 5 is 120*/

import java.util.Scanner;
public class q3 {
    
    public static void main(String[] args) {
        
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number :");
        number = sc.nextInt();

        long fact = 1;

        for(int i=1; i<=number; i++){

            fact = fact * i;
        }

        System.out.println(fact);

    }
}
