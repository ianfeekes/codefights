/*isSmooth.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *List Forest Edge 
 *#40
 */

boolean isSmooth(int[] arr) 
{
  if(arr[0]!=arr[arr.length-1])return false;
  //if(arr.length<3)return false; 
  if(arr.length%2!=0)//if odd
  {
    return(arr[0]==arr[arr.length/2]);
  }
  else
  {
    return(arr[0]==arr[arr.length/2]+arr[(arr.length/2)-1]);
  }
}


