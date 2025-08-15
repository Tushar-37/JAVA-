
import java.util.Scanner;

public class ageChecker {
    
    public static void checkAgeCategory(int age){
    
        if(age > 18 && age<25){
            System.out.println("you are minor");
        }else if(age>29 && age< 50){
            System.out.println("you are minor ");

        }else{
            System.out.println("you are sinor citizen ");
        }


    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age : ");

        int age = sc.nextInt();

       checkAgeCategory(30);

    }
}
