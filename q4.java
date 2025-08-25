
/*Question 4: Print Even Numbers from 1 to N
Problem Statement:
Write a Java program that asks the user for a number N and prints all the even numbers from 1 to N using
a for loop. */

import java.util.Scanner;

    public class q4 {
        
        public static void main(String[] args) {
            
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the N number :");
            number = sc.nextInt();
    
            ;
    
            for(int i=1; i<=number; i++){
    
               if(i%2 == 0){
                System.out.println(i);
               }
            }
        }
    }
    

