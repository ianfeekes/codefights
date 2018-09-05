/*isCaseInsensitivePalindrome.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Book Market
 *#54
 */

boolean isCaseInsensitivePalindrome(String inputString) 
{
    int b = inputString.length()-1;
    for(int i=0;i<b;i++)
    {
        if(!Character.toString(inputString.charAt(i)).equalsIgnoreCase(Character.toString(inputString.charAt(b))))return false;
        b--;
    }
    return true; 
}


