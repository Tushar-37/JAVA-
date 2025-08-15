import java.util.Scanner;

public class PositiveNumberInput {

    
    public static int askForPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();

            if(number <= 0){
                System.out.println("number is negative");
            }else{
                System.out.println("number is positive");
            }
        
        } while (number <= 0);

        return number;
    }

    public static void main(String[] args) {
        int positiveNumber = askForPositiveNumber();
        // System.out.println("You entered a number is : " + positiveNumber + " C-DAC MUMBAI");
    }
}
