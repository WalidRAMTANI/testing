
public class Calculatrice {

    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro");
        }
        return (double) a / b;
    }

    public int maximum(int[] nombres) {
        if (nombres == null || nombres.length == 0) {
            throw new IllegalArgumentException("Tableau vide");
        }

        int max = nombres[0];

        for (int n : nombres) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();

        System.out.println(calc.addition(5, 3));       // 8
        System.out.println(calc.soustraction(10, 4)); // 6
        System.out.println(calc.multiplication(3, 4));// 12
        System.out.println(calc.division(10, 2));     // 5.0

        int[] tab = {4, 9, 2, 15, 7};
        System.out.println(calc.maximum(tab));        // 15
    }
}
