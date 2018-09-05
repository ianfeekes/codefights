/*removeArrayPart.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *List Forest Edge 
 *#39
 */

int[] removeArrayPart(int[] inputArray, int l, int r)
{
    int[] arr = new int[inputArray.length-(r-l+1)];
    int index=0;
    for(int i=0;i<inputArray.length;i++)
    {
        if((i<l)||(i>r)) 
        {
            arr[index]=inputArray[i];
            index++;
        }
    }
    return arr; 
}


