/*You are provided with a skeleton of the class 'Fraction', which accepts two arguments (numerator, denominator).

EXAMPLE:

Fraction fraction1 = new Fraction(4, 5);
Your task is to make this class string representable, and addable while keeping the result in the minimum
representation possible.

EXAMPLE:

System.out.println(fraction1.add(new Fraction(1, 8)));
// Outputs: 37/40
NB: DON'T use the built_in class 'fractions.Fraction'*/

package com.practic.codewars.oop;

public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((Fraction) o) == 0;
    }

    @Override
    public int compareTo(Fraction f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    //Add two fractions
    public Fraction add(Fraction f2) {
        long x;
        long y = bottom;
        long multiplication;
        long sum;

        if (bottom == f2.bottom) {
            x = top + f2.top;
        } else {
            multiplication = this.bottom * f2.bottom;
            sum = ((multiplication / bottom) * top) + ((multiplication / f2.bottom) * f2.top);
            long commonDominator = gcd(sum, multiplication);
            x = sum / commonDominator;
            y = multiplication / commonDominator;
        }
        return new Fraction(x, y);
    }

    @Override
    public String toString() {
        return String.format("%d/%d",top, bottom);
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
