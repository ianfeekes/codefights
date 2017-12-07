/*AllLongestStrings.java
 *Codefights
 *Arcade
 *Introduction
 *Smooth Sailing
 *#9
 *Created by Ian Feekes December 6th 2017
 */

String[] allLongestStrings(String[] inputArray) {
int biggestLength = 0;
    int numBigStrings = 0;
    for(int i=0; i<inputArray.length; i++)
    {
        if(inputArray[i].length()>biggestLength) biggestLength=inputArray[i].length();
    }
    for(int i=0;i<inputArray.length; i++)
    {
        if(inputArray[i].length()==biggestLength) numBigStrings++;
    }
    String[] longestStrings = new String[numBigStrings];
    int counter = 0;
    for(int i=0; i<inputArray.length;i++)
    {
      if(inputArray[i].length()==biggestLength) 
      {
          longestStrings[counter]=inputArray[i];
          counter++;
      }
    }
    return longestStrings;
}


