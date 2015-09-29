/*
Даны действительные числа a1, a2 … an.  Найти
max(a1+a2n,a2+a2n-1,...,an+an+1);

.
 */
import java.util.Scanner;
public class Task3{
public static void main(String[] args) {
        int n, arr[],arr2[];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array ");
        n = in.nextInt();// выдает массив
        arr = new int [n];
        arr2 = new int[n];
        for (int i=0;i<arr.length;i++){
        arr[i] = (int) ( Math.random() * n);
        }// заполняет массив случайными числами от 0 до размера массива
    for (int i=0;i<arr.length-1;i++){
        arr2[i]=arr[i]+arr[i+1];
    }// делает массив из суммы элементов i и i+1 предыдущего массива
    int max=arr2[0];
    for (int i=0;i<arr2.length;i++){
        if(max<arr2[i]){
            max=arr2[i];
        }//находит максимальное значение
    }System.out.println("Maximum summ= "+max);
}}

