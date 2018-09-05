/*isTandemRepeat.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Book Market
 *#53
 */

boolean isTandemRepeat(String inputString) 
{
    for(int i=0;i<inputString.length();i++)
    {
        if(inputString.substring(0,i).equals(inputString.substring(i,inputString.length())))return true; 
    }
    return false; 
}


