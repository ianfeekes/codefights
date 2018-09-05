/*concatenateArrays.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *List Forest Edge 
 *#38
 */

int[] concatenateArrays(int[] a, int[] b) 
{
    int[] arr = new int[a.length+b.length];
    for(int i = 0;i<arr.length;i++)
    {
        if(i<a.length)arr[i]=a[i];
        else arr[i]=b[i-a.length];
    }
    return arr;
}
