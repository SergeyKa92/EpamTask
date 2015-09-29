/*
—оставить программу дл€ вычислени€ значений функции F(x) на отрезке [а, b] с
шагом h. –езультат представить в виде таблицы, первый столбец которой Ц значени€ аргумента,
второй - соответствующие значени€ функции:
F(x)=tg(2x)-3
 */
public class Task2 {
    public static void main(String[] args) {
        double a=-5; //нижний предел
        double b=3;  // верхний предел
        double h=1;  //шаг
        while (a<=b) {
            double F = Math.tan(a);
            System.out.println("Value of argument    "+ "   Function value");
            System.out.println(a+"                      " + F);
            a+=h;

        }
    }
}
