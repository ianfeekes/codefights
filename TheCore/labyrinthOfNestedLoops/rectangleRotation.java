/*rectangleRotation.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Labyrinth of Nested Loops
 *#49
 */

int rectangleRotation(int a, int b) 
{
    a=(int)(a/Math.sqrt(2));
    b=(int)(b/Math.sqrt(2));
    int c = (a+1)*(b+1)+a*b;
    return c%2==0?c-1:c;
}


