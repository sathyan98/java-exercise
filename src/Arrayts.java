import java.util.Scanner;
public class Arrayts {
    public static void main(String[] args) {
        boolean[][] array = {{true, false, true},
                {false, true, false}};
        int rows_length = array.length;
        int columns_length = array[0].length;

        for (int i = 0; i < rows_length; i++) {
            for (int j = 0; j < columns_length; j++) {

                if (array[i][j]) {
                    System.out.print(" t ");
                } else {
                    System.out.print(" f ");
                }

            }
            System.out.println();
        }
    }
}















/* Sample array:
        array = {{true, false, true},
        {false, true, false}};
        Expected Output :
        t f t
        f t f */






