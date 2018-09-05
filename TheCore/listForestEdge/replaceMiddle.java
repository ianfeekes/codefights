/*replaceMiddle.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *List Forest Edge 
 *#41
 */

int[] replaceMiddle(int[] arr) 
{
    if(arr.length%2==0)
    {
        int[] newArr = new int[arr.length-1];
        int index = 0;
        for(int i=0;i<arr.length;i++)
        {
            if((i!=arr.length/2)&&(i!=arr.length/2-1)) 
            {
                newArr[index]=arr[i];
                index++;
            }
            else
            {
                newArr[index]=arr[i]+arr[i+1];
                index++;
                i++;
            }
        }
        return newArr;
    }
    return arr;
}


