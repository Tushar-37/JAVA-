import java.util.Scanner;

class scanClass {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name  = sc.nextLine();
        
        System.out.print("Enter your height in meter: ");
        double height = sc.nextDouble();
        sc.nextLine(); 
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.println("Hello, " + name + " Welcome to the CDAC Mumbai.");
        System.out.println("Height: " + height + " meters");
        System.out.println("Age: " + age + " years old");
        
    }
}
