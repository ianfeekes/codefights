/*longestDigitsPrefix.java
 *codefights
 *Arcade
 *Introduction
 *Dark Wilderness
 *#40
 *Created by Ian Feekes December 6th 2017
 */

String longestDigitsPrefix(String inputString)
{
    if(((int)inputString.charAt(0)>47)&&((int)inputString.charAt(0)<58))
    {
    String str = "";
    String temp = "";
    for(int i=0;i<inputString.length();i++)
    {
        if(((int)inputString.charAt(i)>47)&&((int)inputString.charAt(i)<58))
        {
            temp+=inputString.charAt(i);
        }
        else temp = "";
        if(temp.length()>str.length()) str = temp;
    }
    return str;
    }
    return "";
}


