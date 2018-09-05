/*circleOfNumbers.java
 *codefights
 *Arcade
 *Introduction
 *Through the Fog
 *#30
 *Created by Ian Feekes December 6th 2017
 */

/*NOTE: Implementation of this algorithm is not difficult at all! Before you look towards my code think about this one for a little bit and it should be simple to solve after you put some thought towards it*/ 

int circleOfNumbers(int n, int firstNumber) 
{
    firstNumber+=n/2;
    if(firstNumber>=n)
    {
        firstNumber-=n;
    }
    return firstNumber;
}
