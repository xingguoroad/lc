import java.util.Arrays;

/**
 * Created by GelinZHU on 4/1/17.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix == null) {
            return;
        }

        // first find the 转制matrix
        int[][] matrixP = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixP[i][j] = matrix[j][i];
            }
        }

//        for (int i = 0; i < matrixP.length; i++) {
//            for (int j = 0; j < matrixP[0].length; j++) {
//                System.out.print(matrixP[i][j] + " ");
//            }
//            System.out.println();
//        }

        // switch each row of matrixP
        for (int i = 0; i < matrixP.length; i++) {
            int left = 0;
            int right = matrix[0].length - 1;
            while (left < right) {
                int temp = matrixP[i][left];
                matrixP[i][left] = matrixP[i][right];
                matrixP[i][right] = temp;
                left++;
                right--;
            }
        }

//        for (int i = 0; i < matrixP.length; i++) {
//            for (int j = 0; j < matrixP[0].length; j++) {
//                System.out.print(matrixP[i][j] + " ");
//            }
//            System.out.println();
//        }


        for (int i = 0; i < matrixP.length; i++) {
            for (int j = 0; j < matrixP[0].length; j++) {
                matrix[i][j] = matrixP[i][j];
            }
        }

//        for (int i = 0; i < matrixP.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 2}, {3, 4}};
        RotateImage ri = new RotateImage();
        ri.rotate(matrix);
    }
}
