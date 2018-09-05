/*leastFactorial.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Loop Tunnel 
 *#25
 */

int leastFactorial(int n)
{
    int temp = 1;
    int factorial = 1;
    while(factorial<n)
    {
        factorial = 1;
        int i = temp;
        while(i>0)
        {
            factorial*=i;
            i--;
        }
        temp++;
    }
    return factorial;
}


