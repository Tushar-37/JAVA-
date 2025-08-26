import java.util.Scanner;

public class q13{

    public static void arrayNumberPresent(int arr[], int number){

        boolean found = false;

        for(int i=0; i<arr.length - 1; i++){

                if(arr[i] == number){
                    found = true;
                    break;
                }
        }

        if(found){
            System.out.println("Number Is Found");
        }else{
            System.out.println("Number Not Found");
        }
    } 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");

        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<size; i++){

            System.out.println("enter the array elements");
            
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Number to search:");

        int number = sc.nextInt();

        arrayNumberPresent(arr,number);

    }
}

