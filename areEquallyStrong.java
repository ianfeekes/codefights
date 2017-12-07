/*areEquallyStrong.java
 *codefights
 *Arcade
 *Introduction
 *Island of Knowledge
 *#19
 *Created by Ian Feekes December 6th 2017
 */

boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) 
{
 int yourStrongest;
 int yourWeakest;
 int friendsStrongest;
 int friendsWeakest;
 if(yourLeft>yourRight)
 {
  yourStrongest=yourLeft;
  yourWeakest=yourRight;
 }
 else
 {
  yourStrongest=yourRight;
  yourWeakest=yourLeft;
 }
 if(friendsLeft>friendsRight) 
 {
  friendsStrongest=friendsLeft;
  friendsWeakest=friendsRight;
 }
 else 
 {
  friendsStrongest = friendsRight;
  friendsWeakest = friendsLeft;
 }
 return((friendsStrongest==yourStrongest)&&(yourWeakest==friendsWeakest));
}


