/*alphabeticShift.java
 *codefights
 *Arcade
 *Introduction
 *Rains of Reason
 *#28
 *Created by Ian Feekes December 6th 2017
 */

String alphabeticShift(String inputString) 
{
 String str="";
 for(int i=0;i<inputString.length();i++)
 {
  int ascii = (int)inputString.charAt(i);
  if(ascii==122) ascii= 97;
  else if(ascii==26) ascii= 1;
  else ascii++;
  str+=(char)ascii;
 }
 return str;
}


