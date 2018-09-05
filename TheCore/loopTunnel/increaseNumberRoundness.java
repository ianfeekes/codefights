/*increaseNumberRoundness.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Loop Tunnel
 *#31
 */

boolean increaseNumberRoundness(int n) 
{
    while(n%10==0)
    {
        n/=10;
    }
    while(n>0)
    {
        if(n%10==0)return true;
        n/=10;
    }
    return false; 
}


