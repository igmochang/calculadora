public class Calculator {

    public double sum(double a, double b) {
        double res = a + b;
        return res;
    }

    public double res(double a, double b) {
        double res = a - b;
        return res;
    }

    public double div(double a, double b) {
            double res = a / b;
            return res;
    }

    public double mult(double a, double b) {
        double res = a*b;
        return res;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 3));
        System.out.println(calc.res(10, 3));
        System.out.println(calc.mult(9, 9));
        System.out.println(calc.div(-5, 0));
    }
}
