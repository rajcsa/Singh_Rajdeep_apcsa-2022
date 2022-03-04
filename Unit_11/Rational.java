//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int numerator;
	private int denominator;

	public Rational () {
		numerator = 1;
		denominator = 1;
	}
	
	public Rational (int num, int den) {
		numerator = num;
		denominator = den;
	}

	public void setRational (int num, int den) {
		setNumerator(num);
		setDenominator(den);
	}

	public void setNumerator (int num) {
		numerator = num;
	}
	
	public void setDenominator (int den) {
		denominator = den;
	}
	
	public void add(Rational  other)
	{

		setNumerator(getNumerator() * other.denominator + other.numerator * getDenominator());
		setDenominator(getDenominator() * other.denominator);
		reduce();
	}

	private void reduce()
	{
		setNumerator(numerator/gcd(numerator, denominator));
		setDenominator(denominator/gcd(numerator, denominator));
	}


	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public boolean equals(Object obj)
	{
		return compareTo((Rational)(obj)) == 0;
	}

	public int compareTo(Rational other)
	{
		if (getNumerator() * other.denominator > other.numerator * getDenominator()) {
			return 1;
		}
		if (getNumerator() * other.denominator < other.numerator * getDenominator()) {
			return -1;
		}
		else return 0;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}
}