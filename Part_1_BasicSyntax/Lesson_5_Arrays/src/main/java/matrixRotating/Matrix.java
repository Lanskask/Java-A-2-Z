package matrixRotating;

/**
 * Created by a1 on 30.09.16.
 */

public class Matrix
{
    public static void main(String[] argv)
    {
        int m = 6;
        int[][] myMatrix = new int[m][m];

        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                myMatrix[i][j] = (int) Math.round( Math.random()*10 );
            }
        }


        System.out.println("\nInitial Matrix:");
        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                System.out.printf("%3d ", myMatrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nRotated Matrix:");

//        Rotating
        for (int i = 0; i < m/2; i++) { // border -> center
            for (int j = i; j < m-1-i; j++) { // left -> right

                int tmp = myMatrix[i][j];
                myMatrix[i][j] = myMatrix[j][m-1-i];
                myMatrix[j][m-1-i] = myMatrix[m-1-i][m-1-j];
                myMatrix[m-1-i][m-1-j] = myMatrix[m-1-j][i];
                myMatrix[m-1-j][i] = tmp;
            }
        }

//        Output
        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                System.out.printf("%3d ", myMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
