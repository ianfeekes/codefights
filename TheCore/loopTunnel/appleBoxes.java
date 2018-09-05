/*appleBoxes.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Loop Tunnel
 *#30
 */

int appleBoxes(int k) 
{
    int numYellow = 0;
    int numRed = 0;
    for(int i=1;i<=k;i++)
    {
        if(i%2!=0)
        {
            numYellow+=i*i;
        }
        else if(i%2==0)
        {
            numRed+=i*i;
        }
    }
    return (numRed-numYellow);
}



