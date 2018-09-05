/*seatsInTheater.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Intro Gates
 *#4
 */

int seatsInTheater(int nCols, int nRows, int col, int row) 
{
    nCols++;
    nCols-=col;
    nRows-=row;
    return nCols*nRows;
}


