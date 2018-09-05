/*weakNumbers.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Labyrinth of Nested Loops
 *#48
 */

int[] weakNumbers(int n) 
{
    int maxWeak = 0;
    int[] weakValArr = new int[n];
    int index=0;
    for(int i=1;i<=n;i++)
    {
        int iWeak =0;
        int iDiv = findNumDivisors(i);
        if(i>1)
        {
            for(int j=1;j<i;j++)
            {
                int jDiv = findNumDivisors(j);
                if(jDiv>iDiv)iWeak++;
            }
        }
        weakValArr[index]=iWeak;
        index++;
        if(iWeak>maxWeak)maxWeak=iWeak;
    }
    int[] weakness = new int[2];
    weakness[0]=maxWeak;
    int numWeak = 0;
    for(int i=0;i<weakValArr.length;i++)
    {
        if(weakValArr[i]==maxWeak)numWeak++;
    }
    weakness[1]=numWeak;
    return weakness; 
}

int findNumDivisors(int x)
{
    int toReturn = 0;
    for(int i=1;i<=x/2;i++)
    {
        if(x%i==0)toReturn++;
    }
    return toReturn; 
}


