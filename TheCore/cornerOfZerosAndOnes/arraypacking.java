/*arrayPacking.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Corner of 0s and 1s 
 *#18
 */

int arrayPacking(int[] a) 
{
    int toReturn = 0;
    int BitShifter=0;
    for(int i=0;i<a.length;i++)
    {
        toReturn+=a[i]<<BitShifter;
        BitShifter+=8;
    }
    return toReturn;
}


