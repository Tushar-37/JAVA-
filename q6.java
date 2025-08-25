import java.util.Scanner;

public class q6 {
    
    public static void main(String[] args) {
        
       

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int arr = sc.nextInt();

        int []a = new int[arr];

        System.out.println("Enter array elements ;");

        for(int i=0; i<arr; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("array elements are :");
        for(int i=0; i<arr; i++){
        System.out.println("Array elements are : " + a[i]);
        }
    }
}
