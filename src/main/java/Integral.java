    public class Integral {
    private double a;
    private double b;

    /***
     * The integral
     * a,b - intervals
     * formula() contains integral formula
     */

    public Integral(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /***
     * Need to override method to change formula
     */

    public double formula(double x) {
        return (1.8 * Math.pow(x,2) - 1) / (Math.pow(x, 3) + 1.2);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}