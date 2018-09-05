/*secondRightmostZeroBit.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Corner of 0s and 1s 
 *#21
 */

int secondRightmostZeroBit(int n) {
  return -~((n-~(n^(n+1))/2)^(n-~(n^(n+1))/2+1))/2 ;
}



