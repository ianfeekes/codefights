/*findEmailDomain.java
 *codefights
 *Arcade
 *Introduction
 *Eruption of Light
 *#44
 *Created by Ian Feekes December 6th 2017
 */

String findEmailDomain(String address) 
{
    String str = "";
    boolean startParsing = false; 
    for(int i=0;i<address.length();i++)
    {
        if(startParsing)str+=address.charAt(i);
        if((address.charAt(i)=='@')&&((int)address.charAt(i+1)>96)&&((int)address.charAt(i+1)<123)) startParsing = true; 
    }
    return str;
}


