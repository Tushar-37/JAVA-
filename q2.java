/*Question 2: Print Multiples of 3 between 1 and N
Problem Statement:
Write a Java program that asks the user for a number N and prints all the multiples of 3 between 1 and N
using a for loop.
Sample Input:
Enter a number: 20
Expected Output:
3 6 9 12 15 18 */

import java.util.Scanner;

public class q2 {
    
    public static void main(String[] args) {
      
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number :");
        number = sc.nextInt();
        
        for(int i=1; i<=number; i++){

            if(i%3 == 0){
                System.out.println(i);
            }
            
        }

        sc.close();
    }
}
