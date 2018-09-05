/*properNounCorrection.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Book Market
 *#52
 */

String properNounCorrection(String noun) 
{
    String str = "";
    if((int)noun.charAt(0)>90)
    {
        char c = noun.charAt(0);
        str+=(char)((int)noun.charAt(0)-32);
    }
    else str+=noun.charAt(0);
    for(int i=1;i<noun.length();i++)
    {
        if((int)noun.charAt(i)<97)
        {
            str+=(char)((int)noun.charAt(i)+32);
        }
        else str+=noun.charAt(i);
    }
    return str; 
}


