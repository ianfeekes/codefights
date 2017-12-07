/*sortByHeight.java
 *codefights
 *Arcade
 *Introduction
 *Smooth Sailing
 *#12
 *Created by Ian Feekes December 6th 2017
 */

int[] sortByHeight(int[] a) {
    int temp=0;
for(int i=0; i<a.length; i++)
{
    if(a[i]!=-1)
    {
        for(int j=a.length-1; j>i; j--)
        {
            if(a[j]!=-1)
            {
                if(a[j]<a[i])
                {
                    temp = a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
}
    return a;
}


