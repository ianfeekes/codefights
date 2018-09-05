/*reflectString.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *LabOfTransformations
 *#81
 */

String reflectString(String inputString) 
{
    String str="";
    for(int i=0;i<inputString.length();i++)
    {
        int x = (97+26+96)-((int)inputString.charAt(i));
        str+=(char)x;
    }
    return str; 
}
