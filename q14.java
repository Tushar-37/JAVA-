import java.util.Scanner;

public class q14 {
    
    public static void indexFound(int arr[], int index){

        boolean found = false;
        for(int i=0; i<arr.length-1; i++){
            
            if(i == index){
               found = true;
               break;
            }
        }  
        if(found){
            System.out.println("Index Found");
        }else
            System.out.println("Index Not Found");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");

        int size = sc.nextInt();

        int arr[]= new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter array elements:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index to found");
        int index = sc.nextInt();

        indexFound(arr,index);

    }
}
