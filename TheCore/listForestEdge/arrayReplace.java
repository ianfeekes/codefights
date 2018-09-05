/*arrayReplace.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *List Forest Edge 
 *#36
 */

int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) 
{
    for(int i=0;i<inputArray.length;i++)
    {
        if(inputArray[i]==elemToReplace)inputArray[i]=substitutionElem;
    }
    return inputArray;
}


