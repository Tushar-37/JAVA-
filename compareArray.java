import java.util.Arrays;

public class compareArray {
    public static void main(String[] args) {
        int []array1 = {1,2,3,4,5};
        int []array2 = {1,2,3,4,6,8,4,5,6};
       
        System.out.println("your array is same or not :" + Arrays.compare(array1,array2));
    }

}
