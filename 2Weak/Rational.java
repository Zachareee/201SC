
public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 1;
        denominator = 1;
    }

    public Rational(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public int getNum() {
        return numerator;
    }

    public void setNum(int n) {
        numerator = n;
    }

    public int getDenom() {
        return denominator;
    }

    public void setDenom(int d) {
        denominator = d;
    }

    public String toString() {
        return "" + numerator + '/' + denominator;
    }

    public Rational add(Rational num) {
        int newNumerator = numerator * num.getDenom() + num.getNum() * denominator;
        int newDenominator = denominator * num.getDenom();
        int divisor = gcd(newNumerator, newDenominator);

        newNumerator /= divisor;
        newDenominator /= divisor;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational num) {
        int newNumerator = numerator * num.getDenom() - num.getNum() * denominator;
        int newDenominator = denominator * num.getDenom();
        int divisor = gcd(newNumerator, newDenominator);

        newNumerator /= divisor;
        newDenominator /= divisor;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational num) {
        int newNumerator = numerator * num.getNum();
        int newDenominator = denominator * num.getDenom();
        int divisor = gcd(newNumerator, newDenominator);

        newNumerator /= divisor;
        newDenominator /= divisor;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational num) {
        int newNumerator = numerator * num.getDenom();
        int newDenominator = denominator * num.getNum();
        int divisor = gcd(newNumerator, newDenominator);

        newNumerator /= divisor;
        newDenominator /= divisor;
        return new Rational(newNumerator, newDenominator);
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
