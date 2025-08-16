public class studyStatic {
    
    // If we assign static keyword to instance variable we dont need to create object we direct call it by classname.variablename;
      static String printing = "Hii";
    public static void main(String[] args) {
        
        // studyStatic obj = new studyStatic();
       // System.out.println(obj.printing);
        
         System.out.println(studyStatic.printing);
    }
}
