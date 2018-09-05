/*switchLights.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Well of Integration
 *#73
 */

int[] switchLights(int[] a) 
{
    //int[]toReturn = new int[a.length];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==1)
        {
            for(int j=0;j<=i;j++)
            {
                if(a[j]==1)a[j]=0;
                else a[j]=1;
            }
        }
    }
    return a; 
}

