/*
���� �������������� ����� a1, a2 � an.  �����
max(a1+a2n,a2+a2n-1,...,an+an+1);

.
 */
import java.util.Scanner;
public class Task3{
public static void main(String[] args) {
        int n, arr[],arr2[];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array ");
        n = in.nextInt();// ������ ������
        arr = new int [n];
        arr2 = new int[n];
        for (int i=0;i<arr.length;i++){
        arr[i] = (int) ( Math.random() * n);
        }// ��������� ������ ���������� ������� �� 0 �� ������� �������
    for (int i=0;i<arr.length-1;i++){
        arr2[i]=arr[i]+arr[i+1];
    }// ������ ������ �� ����� ��������� i � i+1 ����������� �������
    int max=arr2[0];
    for (int i=0;i<arr2.length;i++){
        if(max<arr2[i]){
            max=arr2[i];
        }//������� ������������ ��������
    }System.out.println("Maximum summ= "+max);
}}

