/*firstDigit.java
 *codefights
 *Arcade
 *Introduction
 *Diving Deeper
 *#35
 *Created by Ian Feekes December 6th 2017
 */

char firstDigit(String inputString) 
{
    char c = 'j';
    for(int i=0;i<inputString.length();i++)
    {
        if(((int)inputString.charAt(i)>47)&&((int)inputString.charAt(i)<58)) return inputString.charAt(i);
    }
    return c;
}


