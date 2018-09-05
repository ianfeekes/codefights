/*integerToStringOfFixedWidth.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Well of Integration
 *#76
 */

String integerToStringOfFixedWidth(int number, int width) 
{
    int numDigits =0;
    String str = Integer.toString(number);
    int temp = number; 
    while(temp>0)
    {
        numDigits++;
        temp/=10;
    }
    if(number==0)numDigits=1;
    if(width==numDigits)return str; 
    else if(numDigits<width)
    {
        String t = "";
       while(numDigits<width)
       {
           t+="0";
           numDigits++;
       }
        return t+str; 
    }
    else
    {
            str = str.substring(str.length()-width, str.length());
        return str; 
    }
}


