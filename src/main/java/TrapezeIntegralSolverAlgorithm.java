public class TrapezeIntegralSolverAlgorithm implements IntegralSolverAlgorithm{
    @Override
    public double solve(Integral integral) {
        double res = 0.0;
        double h = (integral.getB() - integral.getA()) / 10;
        double k = integral.formula(integral.getA()) + integral.formula(integral.getB());

        for (double i = integral.getA() + h; i < integral.getB(); i += h) {
            res += integral.formula(i);
        }
        return h * (res + k / 2);
    }
}
