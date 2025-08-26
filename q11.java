import java.util.Scanner;

public class q11 {

    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the array size :");
            int size = sc.nextInt();

            int []arr = new int [size];

            for(int i=1; i<size; i++){
                System.out.println("Enter array elemnts :");
                arr[i] = sc.nextInt();

            }
            int negativeNumber = 0;
            int positiveNumber = 0;
            
            for(int i=0; i<size; i++){
               if(arr[i] <= 0){
                            
                negativeNumber++;
                }
                else{
                    positiveNumber++;
                }
             }
            
             System.out.println(positiveNumber);
             System.out.println(negativeNumber);
        }

    }
    

