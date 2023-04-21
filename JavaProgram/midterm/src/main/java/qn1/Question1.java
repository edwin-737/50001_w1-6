// 1006200 Edwin Wongso
package qn1;
import java.util.*;

public class Question1 {
    // No need to modify the main method. It is just used for test cases
    public static void main(String[] args) {
        // Test code for sumOfPositiveElements
        int[] numbers = {1,2,3,-6};
        System.out.println(sumOfPositiveElements( numbers )); // 6

        // Test code for createGrid()
        int n = 5;
        int m = 9;
        int[][] g = createGrid(n, m);

        System.out.println(g[0][0] == 1); // true
        System.out.println(g[4][8] == 1); // true

        // Test code for negativeFilter()
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(4.3);
        arr.add(-2.1);
        arr.add(52.9);
        arr.add(-71.0);
        arr.add(-6.0);
        arr.add(2.8);

        negativeFilter(arr);
        System.out.println(arr);  // [4.3, 52.9, 2.8]
    }

    // Start working from here
    public static int sumOfPositiveElements(int[] numbers) {
        int sum=0;
        for(int i = 0 ; i < numbers.length; i ++)
            if(numbers[i]>0)
                sum+=numbers[i];

        return sum;
    }


    public static int[][] createGrid(int n, int m) {
        if(m<1||n<1){
            int[][]grid=new int[5][5];
            for(int i = 0 ; i < 5 ; i ++)
                for(int j = 0 ; j < 5 ;j ++)
                    grid[i][j]=1;
            return grid;
        }
        int[][]grid=new int[n][m];
        for(int i = 0 ; i < n ; i ++)
            for(int j = 0 ; j < m ; j ++)
                grid[i][j]=1;
        return grid;
    }


    public static void negativeFilter(ArrayList<Double> arr) {
        for(int i = 0 ; i < arr.size(); i ++)
            if(arr.get(i)<0) {
                arr.remove(i);
                i=0;
            }

    }

}


