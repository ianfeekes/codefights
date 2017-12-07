/*arrayMaxConsecutiveSum.java
 *codefights
 *Arcade
 *Introduction
 *Diving Deeper
 *#37
 *Created by Ian Feekes December 6th 2017
 */

int arrayMaxConsecutiveSum(int[] inputArray, int k) 
{
    int max = 0;
    for(int i=0;i<=inputArray.length-k;i++)
    {
        int temp=0;
        for(int j=i;j<i+k;j++)
        {
            temp+=inputArray[j];
        }
        if(temp>max) max=temp;
    }
    return max;
}


