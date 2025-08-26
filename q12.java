import java.util.Scanner;
public class q12 {
    
    public static void arraySort(int arr[]){
        int n = arr.length;

       for(int i=0; i<n-1; i++){
        for(int j=0;j<n-1; j++){

            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; 
            }
        }
       }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size :");

        int size = sc.nextInt();

        int []arr = new int [size];

        for(int i=0; i<size; i++){

            System.out.println("Enter the elements of arrays :");

            arr[i] = sc.nextInt();

        }

        arraySort(arr);

        for(int num:arr){
            System.out.println(num);
        }
    }

}
