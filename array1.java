public class array1 {
    
    public static void main(String[] args) {
        
        double []heights = {5.11, 6, 5.5, 5.10, 6.2 , 5.3}; 

        int countOFStudent = heights.length;

        System.out.println(countOFStudent);

        double sum = 0;
        for(int i=0; i<heights.length; i++){

            sum = sum + heights[i];
        }

        System.out.println(sum/countOFStudent);
    }
}
