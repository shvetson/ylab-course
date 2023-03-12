package complex;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 11.03.2023 15:02
 */

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber(double re) {
        this.re = re;
        this.im = 0.0;
    }

    public ComplexNumber() {
        this.re = 0.0;
        this.im = 0.0;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public ComplexNumber plus(ComplexNumber b) {
        ComplexNumber a = this;
        double newRe = a.re + b.getRe();
        double newIm = a.im + b.getIm();
        return new ComplexNumber(newRe, newIm);
    }

    public ComplexNumber minus(ComplexNumber b) {
        ComplexNumber a = this;
        double newRe = a.re - b.getRe();
        double newIm = a.im - b.getIm();
        return new ComplexNumber(newRe, newIm);
    }

    public ComplexNumber multi(ComplexNumber b) {
        ComplexNumber a = this;
        double newRe = a.re * b.getRe() - a.im * b.getIm();
//        double newIm = a.im * b.getRe() + a.re * b.getIm();
        double newIm = a.re * b.getIm() + a.im * b.getRe();
        return new ComplexNumber(newRe, newIm);
    }

    public double mod() {
        return Math.sqrt(re * re + im * im);
    }

    @Override
    public String toString() {
        String complex;
        if (this.im < 0) {
            complex = "z = " + this.re + " - " + Math.abs(this.im) + "i";
        } else if (this.im > 0) {
            complex = "z = " + this.re + " + " + this.im + "i";
        } else {
            complex = "z = " + this.re;
        }
        return complex;
    }
}