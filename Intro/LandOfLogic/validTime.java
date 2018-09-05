/*validTime.java
 *codefights
 *Arcade
 *Introduction
 *Land of Logic 
 *#53
 *Created by Ian Feekes December 6th 2017
 */

boolean validTime(String time) 
{
  if((time.charAt(0)=='2')&&(time.charAt(1)=='4')) return false;
  if((int)time.charAt(0)>50)return false;
  if((int)time.charAt(0)==50)
  {
    if((int)time.charAt(1)>52)return false;
  }
  if((int)time.charAt(3)>53)return false;
  return true;
}


