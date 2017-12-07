/*arrayReplace.java
 *codefights
 *Arcade
 *Introduction
 *Rains of Reason
 *#25
 *Created by Ian Feekes December 6th 2017
 */

/*I love easy ones like this because it makes my runtime look fantastic!*/ 

int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) 
{
    for(int i=0;i<inputArray.length;i++)
    {
        if(inputArray[i]==elemToReplace)inputArray[i]=substitutionElem;
    }
    return inputArray;
}


