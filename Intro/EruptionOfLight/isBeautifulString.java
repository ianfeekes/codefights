/*isBeautifulString.java
 *codefights
 *Arcade
 *Introduction
 *Eruption of Light
 *#43
 *Created by Ian Feekes December 6th 2017
 */

boolean isBeautifulString(String inputString) 
{
    int maxascii = 0;
    for(int i=0;i<inputString.length();i++)
    {
        if((int)inputString.charAt(i)>maxascii) maxascii = inputString.charAt(i);
    }
    //System.out.println((char)maxascii);
    while(maxascii>97)
    {
        if(!parseThrough(maxascii, inputString)) return false;;
        maxascii--;
    }
    return true; 
}

boolean parseThrough(int charVal, String str)
{
    int numHigherChar = 0;
    int numLowerChar = 0;
    for(int i=0;i<str.length();i++)
    {
        if((int)str.charAt(i)==charVal) numHigherChar++;
        else if((int)str.charAt(i)+1==charVal)numLowerChar++;
    }
    if(numHigherChar>numLowerChar) return false;
    else return true; 
}
