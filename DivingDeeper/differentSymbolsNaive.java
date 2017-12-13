/*differentSymbolsNaive.java
 *codefights
 *Arcade
 *Introduction
 *Diving Deeper
 *#36
 *Created by Ian Feekes December 6th 2017
 */

int differentSymbolsNaive(String s) 
{
    int numChars=1;
    boolean alreadyAccountedFor=false;
    for(int i=1;i<s.length();i++)
    {
        alreadyAccountedFor=false;
        for(int j=0; j<i;j++)
        {
            if(s.charAt(j)==s.charAt(i))
            {
                alreadyAccountedFor=true;
            }
        }
        if(!alreadyAccountedFor)numChars++;
    }
    return numChars;
}


