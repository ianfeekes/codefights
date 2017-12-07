/*arrayMaximalAdjacentDifference.java
 *codefights
 *Arcade
 *Introduction
 *Island of Knowledge
 *#20
 *Created by Ian Feekes December 6th 2017
 */

int arrayMaximalAdjacentDifference(int[] inputArray) 
{
    int absMin = 0;
    for(int i=0;i<inputArray.length-1;i++)
    {
        if(inputArray[i]-inputArray[i+1]>absMin) absMin=inputArray[i]-inputArray[i+1];
        else if(inputArray[i+1]-inputArray[i]>absMin) absMin=inputArray[i+1]-inputArray[i];
    }
    return absMin;
}


