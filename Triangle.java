import java.io.*;
import java.util.*;

class Triangle {

    // Util function to find
    // minimum sum for a path
    public int minSumPath(int A[][]) {
        // For storing the result
        // in a 1-D array, and
        // simultaneously updating
        // the result.
        int[] memo = new int[A.length];
        int n = A.length - 1;

        // For the bottom row
        for (int i = 0;
             i < A[n].length; i++)
            memo[i] = A[n][i];

        // Calculation of the
        // remaining rows, in
        // bottom up manner.
        for (int i = A.length - 2;
             i >= 0; i--)
            for (int j = 0;
                 j < A[i].length; j++)
                memo[j] = A[i][j] +
                        (int) Math.min(memo[j],
                                memo[j + 1]);

        // return the
        // top element
        return memo[0];
    }


    public int maxPathSum(int [][] A, int m, int n)
    {
        // loop for bottom-up calculation
        for (int i = m - 1; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                // for each element, check both
                // elements just below the number
                // and below right to the number
                // add the maximum of them to it
                if (A[i + 1][j] > A[i + 1][j + 1])
                    A[i][j] += A[i + 1][j];
                else
                    A[i][j] += A[i + 1][j + 1];
            }
        }

        // return the top element
        // which stores the maximum sum
        return A[0][0];
    }


}