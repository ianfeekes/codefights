/*killKthBit.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Corner of 0s and 1s 
 *#17
 */

int killKthBit(int n, int k) {
  return n & (~(1<<k-1)) ;
}
