/*isLucky.java
 *codefights
 *Arcade
 *Introduction
 *Smooth Sailing
 *#10
 *Created by Ian Feekes December 6th 2017
 */

boolean isLucky(int n) {
 int sumFirstHalf =0;
 int sumSecondHalf = 0;
 int digitsToDivideBy = (int)(Math.log10(n)+1);
 digitsToDivideBy /=2;
 int powerOfTen = 10;
 for(int i=0; i<digitsToDivideBy; i++)
 {
  //loops through each digit to divide by
  sumFirstHalf+=n%powerOfTen;
  n/=powerOfTen;
 }
 for(int i=0; i<digitsToDivideBy; i++)
 {
  sumSecondHalf+=n%powerOfTen;
  n/=powerOfTen;
 }
 if(sumSecondHalf==sumFirstHalf) return true;
 return false;
}


