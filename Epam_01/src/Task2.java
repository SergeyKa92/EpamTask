/*
��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] �
����� h. ��������� ����������� � ���� �������, ������ ������� ������� � �������� ���������,
������ - ��������������� �������� �������:
F(x)=tg(2x)-3
 */
public class Task2 {
    public static void main(String[] args) {
        double a=-5; //������ ������
        double b=3;  // ������� ������
        double h=1;  //���
        while (a<=b) {
            double F = Math.tan(a);
            System.out.println("Value of argument    "+ "   Function value");
            System.out.println(a+"                      " + F);
            a+=h;

        }
    }
}
