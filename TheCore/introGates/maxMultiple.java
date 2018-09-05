/*maxMultiple.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Intro Gates
 *#5
 */

int maxMultiple(int divisor, int bound) 
{
 for(int i=bound;i>0;i--)
 {
  if(i%divisor==0)return i;
 }
 return 1;
}


