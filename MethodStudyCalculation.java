public class MethodStudyCalculation {

    // Instance variable are always above main method and other method but inside
    // the class and if we not initiallize instance variable then it is okk.

    int cost;

    void calculatesalaryDeduction() {
        System.out.println("your salary is deducted");
    }

    void calculateTdsDeduction() {
        // local variables has to initalize always or it will generate error;
        // int tds;
        // int sal;
        System.out.println("your tds is deducted");
    }

    public static void main(String args[]) {

        MethodStudyCalculation obj = new MethodStudyCalculation();
        obj.calculatesalaryDeduction();
        obj.calculateTdsDeduction();
    }
}
