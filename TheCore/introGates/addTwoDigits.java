/*addTwoDigits.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Intro Gates
 *#1
 */

int addTwoDigits(int n) 
{
    int toReturn = 0;
    while(n>0)
    {
        toReturn+=n%10;
        n/=10;
    }
    return toReturn;
}
