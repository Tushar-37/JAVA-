public class constructorStudy {
    int age;
    int weight;

    //constructor declaration : default constructor is made by java but we cant see it .

    constructorStudy(){

        age = 18;
        weight = 50;
    }

    public static void main(String[] args) {
        
        constructorStudy obj = new constructorStudy();
        System.out.println(obj.age);
        System.out.println(obj.weight);
    }
}
