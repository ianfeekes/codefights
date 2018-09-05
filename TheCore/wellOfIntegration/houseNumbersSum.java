/*houseNumbersSum.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Well of Integration
 *#67
 */

int houseNumbersSum(int[] inputArray) 
{
    int sum = 0;
    for(int i=0;i<inputArray.length;i++)
    {
        if(inputArray[i]==0)break;
        sum+=inputArray[i];
    }
    return sum; 
}


