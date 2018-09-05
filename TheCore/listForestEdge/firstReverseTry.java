/*firstReverseTry.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *List Forest Edge 
 *#37
 */

int[] firstReverseTry(int[] arr) 
{
    if(arr.length>0)
    {
    int temp=arr[0];
    arr[0]=arr[arr.length-1];
    arr[arr.length-1]=temp;
    }
    return arr; 
}



