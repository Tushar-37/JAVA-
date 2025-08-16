public class stringImmutable {
    public static void main(String[] args) {
        
        String str1 = "CDAC MUMBAI";
        String str = "CDAC MUMBAI";

        String str2 = new String("Tushar");
        String str3 = new String("Tushar");

        System.out.println(str2==str1);
        System.out.println(str2==str3);
        System.out.println(str1==str);
       
    }
}
