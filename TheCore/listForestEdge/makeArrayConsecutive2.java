/*makeArrayConsecutive2.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *List Forest Edge 
 *#42
 */

int makeArrayConsecutive2(int[] statues) 
{
    for(int i=0;i<statues.length-1;i++)
    {
        for(int j=i+1;j<statues.length;j++)
        {
            if(statues[j]<statues[i])
            {
                int temp=statues[i];
                statues[i]=statues[j];
                statues[j]=temp;
            }
        }
    }
    //for(int i=0;i<statues.length;i++)System.out.print(statues[i]+" ");
    int numNonConsecutive = 0;
    for(int i=0;i<statues.length-1;i++)
    {
        if(statues[i+1]-statues[i]>1)numNonConsecutive+=statues[i+1]-statues[i]-1;
        System.out.print(numNonConsecutive+" ");
    }
    return numNonConsecutive;
}


