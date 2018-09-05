/*stringsConstruction.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Mirror Lake
 *#59
 */

int stringsConstruction(String a, String b) 
{
    int maxStringCopies=100;
    for(int i=0;i<a.length();i++)
    {
        char c = a.charAt(i);
        int numC = 0;
        int numB = 0;
        for(int j=0;j<a.length();j++)
        {
            if(a.charAt(j)==c)numC++;
        }
        for(int k=0;k<b.length();k++)
        {
            if(b.charAt(k)==c)numB++;
        }
        int temp = numB/numC;
        if(temp<maxStringCopies)maxStringCopies=temp;
    }
    return maxStringCopies;
}


