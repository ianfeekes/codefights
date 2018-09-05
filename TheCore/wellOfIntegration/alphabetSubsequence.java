/*alphabetSubsequence.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Well of Integration
 *#70
 */

boolean alphabetSubsequence(String s) 
{
    ArrayList<Character> arr = new ArrayList<Character>();
    for(int i=0;i<s.length();i++)
    {
        char c = s.charAt(i);
        for(int j=0;j<arr.size();j++)
        {
            if(arr.get(j)==c)return false; 
            if((int)arr.get(j)>(int)c)return false; 
        }
        arr.add(c);   
    }
    return true;
}


