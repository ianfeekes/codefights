/*equalPairOfBits.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Corner of 0s and 1s 
 *#24
 */

int equalPairOfBits(int n, int m) {
  return n + m + 1 & ~m - n ;
}
