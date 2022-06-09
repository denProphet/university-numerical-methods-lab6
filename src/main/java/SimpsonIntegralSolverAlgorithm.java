public class SimpsonIntegralSolverAlgorithm implements IntegralSolverAlgorithm{

    @Override
    public double solve(Integral integral) {
        double sum_1 = 0.0, sum_2 = 0.0;
        double h = (integral.getB() - integral.getA()) / 10;
        double k = integral.formula(integral.getA()) + integral.formula(integral.getB());

        for (double i = integral.getA() + h, j = 0; i < integral.getB(); i += h, j++) {
            if (j % 2 == 0) {
                sum_1 += integral.formula(i);
            } else {
                sum_2 += integral.formula(i);
            }
        }
        return (h / 3) * (k + sum_1 * 4 + sum_2 * 2);
    }
}
