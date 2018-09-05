/*palindromeRearranging.java
 *codefights
 *Arcade
 *Introduction
 *Exploring the Waters
 *#18
 *Created by Ian Feekes December 6th 2017
 */

boolean palindromeRearranging(String inputString) 
{
    int numLetters = 0;
    int counter = 0;
    char c;
    int checker =0;
    for(int i=0;i<inputString.length();i++)
    {
        counter = 0;
        c = inputString.charAt(i);
        if(hasntBeenSeen(c, inputString, i))
        {
            numLetters++;
            for(int j=0; j<inputString.length();j++)
            {
                if(inputString.charAt(j)==c)
                {
                    counter++;
                }
            }
        }
        System.out.println("counter for char "+c+" is "+counter);
        if(counter%2!=0)
        {
          checker++;
        }
        if((checker>1)&&(numLetters>1)) return false;//there are other instances that can be false 
        /*if there is over one letter that has an odd amount of instances
         *and there are two or more letters
          then there is no possible way that it can be rearranged to become a palindrome */
        //abaaa    aabaa abaa  
    }
    return true; 
}

boolean hasntBeenSeen(char c, String str, int x)
{
    for(int i=0; i<x;i++)
    {
        if(str.charAt(i)==c) return false;
    }
    return true; 
}


