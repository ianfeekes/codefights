/*isMAC48Address.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Book Market
 *#57
 */

boolean isMAC48Address(String inputString) 
{
 if(inputString.length()>17)return false; 
 if(inputString.charAt(inputString.length()-1)=='G')return false; 
 if((inputString.charAt(0)=='-')||(inputString.charAt(inputString.length()-1)=='-'))return false; 
 for(int i=0;i<inputString.length()-3;i+=3)
 {
  if(isNotHex(inputString.charAt(i))==0)return false;
  else if(isNotHex(inputString.charAt(i+1))==0)return false;
  //if(isNotHex(inputString.charAt(i+1)))return false;
  if(inputString.charAt(i+2)!='-')return false;
 }
 return true; 
}

int isNotHex(char c)
{
 if(((int)c <71)&&((int)c>64))return 1; //if it's a letter
 if(((int)c>47)&&((int)c<58)) return 2; //if it's a number
 
 return 0;
}
