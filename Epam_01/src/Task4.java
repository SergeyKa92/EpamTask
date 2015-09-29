import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int n=6;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j )||(i==array[i].length-1-j)) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
                }
            }

        for(int[] i: array)
        {
            for(int j: i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }}