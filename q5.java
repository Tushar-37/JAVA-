import java.util.Scanner;

public class q5 {
    
    public static void main(String[] args) {
            
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the N number :");
            number = sc.nextInt();

            int sum = 0;

            for(int i=1; i<=number; i++){
    
               if(i%2 !=0){
                sum = sum + i;
               }

            }
        System.out.println(sum);
        // sc.close();
    }
}
