class largestofthreeno{
    
   
    static int largest(int A, int B, int C){
        
        if(A>B && A>C){
            return A;
        }
        else if(B>A && B>C){
            return B;
        }
        else{
            return C;
        }
    }  
    public static void main(String args[]){
        
          
     int A = 5;
     int B = 6;
     int C = 33;
     
     int large;
     
     large = largest(A,B, C);
     System.out.println(large);
    }
 }