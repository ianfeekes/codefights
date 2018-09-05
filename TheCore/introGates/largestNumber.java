/*largestNumber.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Intro Gates
 *#2
 */

int largestNumber(int n) 
{
    int i=1;
    int toReturn = 0;
    int digitPlace=1;
    while(i<=n)
    {
        toReturn+=9*digitPlace;
        digitPlace*=10;
        i++;
    }
    return toReturn;
}


