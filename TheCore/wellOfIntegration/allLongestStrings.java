/*allLongestStrings.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Well of Integration
 *#68
 */

String[] allLongestStrings(String[] inputArray) 
{
    int maxLen = 0;
    int index=0;
    int numBigStrings =0;
    int[] indicesOfBigStrings = new int[inputArray.length];
    for(int i=0;i<indicesOfBigStrings.length;i++)indicesOfBigStrings[i]=-1;
    for(int i=0;i<inputArray.length;i++)
    {
        if(inputArray[i].length()>maxLen)maxLen=inputArray[i].length();
    }
    for(int i=0;i<inputArray.length;i++)
    {
        if(inputArray[i].length()==maxLen)
        {
            indicesOfBigStrings[index]=i;
            index++;
            numBigStrings++;
        }
    }
    String[] arr = new String[numBigStrings];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=inputArray[indicesOfBigStrings[i]];
    }
    return arr; 
}


