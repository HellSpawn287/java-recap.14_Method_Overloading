public class MethodOverload {
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player scored unknown number of points");
        return 0;
    }

    // ------->>>>> Exercise <<<<<---------
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double sumOfInches = (12 * feet) + inches;
            double centimeters = sumOfInches * 2.54d;
            System.out.println(feet + " feet and " + inches + " inches equals " + centimeters + "centimeters");
            return centimeters;
        } else {
            System.out.println("Invalid input");
            return -1;
        }
    }

    // ------->>>>> Exercise <<<<<---------
//    OverLoad
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double centimeters = inches * 2.54d;
            System.out.println(inches + " inches equals " + centimeters + "centimeters");
            return centimeters;
        } else {
            System.out.println("Invalid input");
            return -1;
        }
    }

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println("\nExercise");
        calcFeetAndInchesToCentimeters(6, 13);
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(6, 3);
        System.out.println("\nExercise OverLoading");
        calcFeetAndInchesToCentimeters(72);
    }
}
