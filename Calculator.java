public class Calculator {
    public char nummerNaarCharCijfer(int cijfer) {
        if (cijfer < 0) {
            throw new IllegalArgumentException("kan niet lager zijn dan nul");
        } else if (cijfer < 60) {
            return 'F';
        } else if (cijfer < 70) {
            return 'D';
        } else if (cijfer < 80) {
            return 'C';
        } else if (cijfer < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}