/*isSubstitutionCipher.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Mirror Lake
 *#60
 */

boolean isSubstitutionCipher(String string1, String string2) 
{
    for(int i=0;i<string1.length();i++)
    {
        char c = string1.charAt(i);
        if(string2.charAt(i)!=c)
        {
            if(!checkStrings(string1, string2, c, string2.charAt(i)))return false;
            if(!checkStrings(string2, string1, string2.charAt(i), c))return false;
        }
    }
    return true; 
}

boolean checkStrings(String str1,String str2, char c, char d)
{
    for(int i=0;i<str1.length();i++)
    {
        if((str1.charAt(i)==c)&&(str2.charAt(i)!=d))return false; 
    }
    return true; 
}

