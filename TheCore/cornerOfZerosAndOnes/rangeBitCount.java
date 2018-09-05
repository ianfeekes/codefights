/*rangeBitCount.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Corner of 0s and 1s 
 *#19
 */

int rangeBitCount(int a, int b) 
{
    int numOnes = 0;
    int[] arr = new int[b-a+1];
    for(int i=a;i<=b;i++)
    {
        int result = 0;
        arr[i-a]=i;
        while(arr[i-a] >0)
        {
            result = arr[i-a] & 1;
            if(result==1)numOnes++;
            arr[i-a]=arr[i-a]>>1;
        }
    }
    
    return numOnes;
}


