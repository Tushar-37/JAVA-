import java.util.Scanner;

public class sum1 {

    public static int calculateSum(int num1) {

        int sum = 0;

        for (int i = 1; i <= num1; i++) {
             sum = i + sum;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int num1 = sc.nextInt();

        int result = calculateSum(num1);
        
        System.out.println(result);

    }
}
