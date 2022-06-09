/**
 * Дисципліна: Чисельні методи. Лабораторна робота 6. Яровой Денис
 * Варіант 20:
 * Інтеграл[1;22]: (1.8 * (x^2) - 1) / ((x^3) + 1.2)
 * <p>
 * Вимоги до проекту:
 * Написати програму для знаходження наближеного значення визначеного
 * інтегралу за допомогою методів прямокутників, трапецій та Сімпсона.
 *
 * @author Den Yarovoy
 */
public class Main {

    public static void main(String[] args) {
        Integral integral = new Integral(1, 2.2);
        System.out.println(new RectangleIntegralSolverAlgorithm().solve(integral));
        System.out.println(new TrapezeIntegralSolverAlgorithm().solve(integral));
        System.out.println(new SimpsonIntegralSolverAlgorithm().solve(integral));
    }
}
