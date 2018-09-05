/*createAnagram.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Mirror Lake
 *#61
 */

int createAnagram(String s, String t) 
{
    char[] arr = new char[t.length()];
    int numReplacements = 0;
    for(int i=0;i<t.length();i++)
    {
        arr[i]=s.charAt(i);
    }
    for(int i=0;i<t.length();i++)
    {
        boolean replacementFound = false; 
        for(int j=0;j<t.length();j++)
        {
            if(arr[j]==t.charAt(i))
            {
                arr[j]='-';
                replacementFound = true; 
                break; 
            }
        }
        if(!replacementFound)numReplacements++;
    }
    return numReplacements; 
}



