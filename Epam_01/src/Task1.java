/*����� ���������� ����� �������� ������������������, ��� �������� �����������
������� M. ������� �� ����� ���� ����� � ��� �������� ai  ��� i = 1, 2, ..., �.
*/
public class Task1 {
    public static void main(String[] args){
        for(int i=1 ; true; i++ ) {
            double a=(1/Math.pow(1+i, 2));
            double M= 0.03; //��������� �����
            if(a<M) {
                break;
            }
            System.out.print("Value of a="+a +"\n");
            System.out.print("A number index="+i+"\n");
        }
    }
}