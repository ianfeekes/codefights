/*arrayPreviousLess.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *springOfIntegration
 *#89
 */

int[] arrayPreviousLess(int[] items) 
{
    int[] toReturn = new int[items.length];
    if(items.length<1)return toReturn; 
    toReturn[0]=-1;
    if(items.length==1)
    {
        return toReturn; 
    }
    for(int i=1;i<items.length;i++)
    {
        for(int j=i-1;j>=0;j--)
        {
            if(items[j]<items[i])
            {
                toReturn[i]=items[j];
                break;
            }
            toReturn[i]=-1;
        }
    }
    return toReturn;
}


