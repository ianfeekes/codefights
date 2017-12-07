/*variableName.java
 *codefights
 *Arcade
 *Introduction
 *Rains of Reason
 *#27
 *Created by Ian Feekes December 6th 2017
 */

boolean variableName(String name)
{
    if(Character.isDigit(name.charAt(0))) return false;
    for(int i=0; i<name.length();i++)
    {
        if(!Character.isDigit(name.charAt(i))&&(!Character.isLetter(name.charAt(i)))&&(name.charAt(i)!='_')) return false; 
    }
    return true; 
}


