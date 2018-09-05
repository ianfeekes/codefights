/*findEmailDomain.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Book Market
 *#55
 */

String findEmailDomain(String address)
{
    int i=0;
    for( i=address.length()-1;i>0;i--)
    {
       if(address.charAt(i)=='@') break; 
    }
    String str = "";
    for(i=i+1;i<address.length();i++)
    {
        str+=address.charAt(i);
    }
    return str; 
}


