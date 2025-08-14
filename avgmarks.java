public class avgmarks {

    public static void main(String args[]) {

        int Averagemarks;

        int mathsMarks = 80;
        int scienceMarks = 85;
        int historyMarks = 90;

        Averagemarks = (mathsMarks + scienceMarks + historyMarks) / 3;

        System.out.println(Averagemarks);

        if (Averagemarks >= 90) {
            System.out.println("Grade A");
        } else if (Averagemarks >= 70 && Averagemarks <= 89) {
            System.out.println("Grade B");
        } else if (Averagemarks >= 50 && Averagemarks <= 69) {
            System.out.println("Grade C");
        } else if (Averagemarks >= 30 && Averagemarks <= 49) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

    }

}
