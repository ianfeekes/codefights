/*magicWell.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Loop Tunnel         
 *#27
 */

int magicalWell(int a, int b, int n) 
{
 int numBandz = 0;
 for(int i=1;i<=n;i++)
 {
  numBandz+=a*b;
  a++;
  b++;
 }
 return numBandz;
}


