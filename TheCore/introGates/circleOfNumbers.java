/*circleOfNumbers.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Intro Gates
 *#6
 */

int circleOfNumbers(int n, int firstNumber) 
{
    int toReturn = firstNumber+n/2;
    if(toReturn>=n)
    {
        toReturn%=n;
    }
    return toReturn;
}


