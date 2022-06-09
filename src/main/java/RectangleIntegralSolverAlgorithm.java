public class RectangleIntegralSolverAlgorithm implements IntegralSolverAlgorithm{
    @Override
    public double solve(Integral integral){
        double res = 0.0;
        double h = (integral.getB() - integral.getA()) / 10;

        for (double i = integral.getA(); i < integral.getB(); i += h) {
            res += (integral.formula(i + h / 2));
        }
        return res * h;
    }
}
