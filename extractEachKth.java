/*extractEachKth.java
 *codefights
 *Arcade
 *Introduction
 *Diving Deeper
 *#34
 *Created by Ian Feekes December 6th 2017
 */

int[] extractEachKth(int[] inputArray, int k) 
{
    int[] outputArray = new int[inputArray.length-inputArray.length/k];
    int index=0;
    for(int i=0;i<inputArray.length;i++)
    {
        if(i%k!=k-1)
        {
            outputArray[index]=inputArray[i];
            index++;
        }
    }
    return outputArray;
}



