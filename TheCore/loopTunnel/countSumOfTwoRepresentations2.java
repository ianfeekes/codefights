/*countSumOfTwoRepresentations2.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Loop Tunnel         
 *#26
 */

int countSumOfTwoRepresentations2(int n, int l, int r) 
{
    int toReturn = 0;
    if((l>n/2)||(l>r)) return 0;
    
    toReturn+=(n/2)-n-r+1; 
    if((n-r)>l)toReturn-=n-r-l;
    return toReturn;
}



