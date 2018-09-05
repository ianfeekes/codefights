/*numberOfClans.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Mirror Lake
 *#66
 */

int numberOfClans(int[] divisors, int k) 
{
    int[] clanVals = new int[k];
    int[] arr = new int[k];
    int index=0;
    for(int i=0;i<k;i++)
    {
        clanVals[i]=-1;
        arr[i]=i+1;
    }
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]!=-1) //if this index hasn't been put into a clan yet
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]!=-1) //if the j index hasn't been put into a clan yet
                {
                    boolean sameDivisors = true; 
                    for(int l = 0;l<divisors.length;l++)
                    {
                        if((arr[i]%divisors[l]==0)&&(arr[j]%divisors[l]!=0))sameDivisors=false;
                        else if((arr[j]%divisors[l]==0)&&(arr[i]%divisors[l]!=0))sameDivisors=false;
                    }
                    if(sameDivisors)
                    {
                        clanVals[i]=index;
                        clanVals[j]=index;
                        arr[j]=-1;
                    }
                }
            }
        }
        arr[i]=-1;
        index++;
    }
    for(int i=0;i<clanVals.length;i++)System.out.print(clanVals[i]+" ");
    int toReturn =0;
    for(int i=0;i<clanVals.length;i++)
    {
        if(clanVals[i]!=-2)
        {
            if(clanVals[i]==-1)toReturn++;
            else
            {
                toReturn++;
                System.out.println("incrementing return for a clan member on index "+i);
                for(int j=i+1;j<clanVals.length;j++)
                {
                    if(clanVals[j]==clanVals[i])
                    {
                        System.out.println("setting index "+j+" to  -2");
                        clanVals[j]=-2;
                    }
                }
            }
        }
        
    }
    return toReturn;
}

