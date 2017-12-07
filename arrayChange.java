/*arrayChange.java
 *codefights
 *Arcade
 *Introduction
 *Exploring the Waters
 *#17
 *Created by Ian Feekes December 6th 2017
 */

int arrayChange(int[] inputArray)
{
    int counter=0;
    for(int i=0;i<inputArray.length-1;i++)
    {
        while(inputArray[i+1]<=inputArray[i])
        {
            counter++;
            inputArray[i+1]++;
        }
    }
    return counter;
}


