/*spiralNumbers.java
 *codefights
 *Arcade
 *Introduction
 *Land of Logic 
 *#59
 *Created by Ian Feekes December 6th 2017
 */

int[][] spiralNumbers(int n) 
{
int val = 1;
 int m=n;
    int[][]a = new int[n][n];
    /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index */
    int k = 0, l = 0;
    while (k < m && l < n)
    {
        /* Print the first row from the remaining
          rows */
        for (int i = l; i < n; ++i)
            a[k][i] = val++;
 
        k++;
 
        /* Print the last column from the remaining
          columns */
        for (int i = k; i < m; ++i)
            a[i][n-1] = val++;
        n--;
 
        /* Print the last row from the remaining
           rows */
        if (k < m)
        {
            for (int i = n-1; i >= l; --i)
                a[m-1][i] = val++;
            m--;
        }
 
        /* Print the first column from the remaining
           columns */
        if (l < n)
        {
            for (int i = m-1; i >= k; --i)
                 a[i][l] = val++;
            l++;
        }
    }
    return a;
}
