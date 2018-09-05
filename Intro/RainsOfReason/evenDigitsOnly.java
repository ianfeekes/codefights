/*evenDigitsOnly.java
 *codefights
 *Arcade
 *Introduction
 *Rains of Reason
 *#26
 *Created by Ian Feekes December 6th 2017
 */

boolean evenDigitsOnly(int n) 
{
    while(n>0)
    {
        if(n%2!=0)return false;
        n/=10;
    }
    return true;
}
