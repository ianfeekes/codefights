/*isPower.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Labyrinth of Nested Loops
 *#43
 */

boolean isPower(int n) 
{
    int i=2;
    if(n==1)return true; 
    while(i*i<=n)
    {
        int temp = i;
        while(temp*i<=n)
        {
            if(temp*i==n)return true; 
            temp*=i;
        }
        i++;
    }
    return false; 
}



