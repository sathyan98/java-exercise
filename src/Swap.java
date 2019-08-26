import java.util.Scanner;
public class Swap {
    public static void main(String args[]) {


        int[][] mat = {{10, 20, 30},
                       {40, 50, 60}};
        System.out.print("the original array is :\n");
        print_array(mat);
        System.out.println("after the transpose:\n ");
        transpose(mat);
    }

        private static void transpose ( int[][] mat)
        {
            int[][] newmat = new int[mat[0].length][mat.length];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++)
                    newmat[j][i] = mat[i][j];
            }
            print_array(newmat);
        }

        private static void print_array ( int[][] mat)
        {
            for (int i = 0; i < mat.length; i++)
                for (int j = 0; j < mat[0].length; j++)
                    System.out.println(mat[i][j]);
        }


    }






/*Write a Java program to print an array after changing the rows and columns of a given two-dimensional array. Go to the editor

        Original Array:
        10 20 30
        40 50 60
        After changing the rows and columns of the said array:10 40
        20 50
        30 60  */