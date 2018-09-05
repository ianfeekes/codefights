/*swapAdjacentBits.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Corner of 0s and 1s 
 *#22
 */

int swapAdjacentBits(int n) {
  return (((n & 0x2AAAAAAA) >> 1) | ((n & 0x15555555) << 1)) ;
}

