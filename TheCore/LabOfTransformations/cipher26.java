/*cipher26.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *LabOfTransformations
 *#83
 */

String cipher26(String message) 
{
    String str = "";
    for(int i=0;i<message.length();i++)
    {
        int valToGet = (int)message.charAt(i)-97;
        int sum =0;
        for(int j=0;j<str.length();j++)
        {
            sum+=(int)str.charAt(j)-97;
        }
        int k;
        for(k=0;k<26;k++)
        {
            int val = (sum+k)%26;
            if(val==valToGet)break;
        }
        str+=(char)(k+97);
    }
    return str; 
}


