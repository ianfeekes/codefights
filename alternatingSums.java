/*alternatingSums.java
 *codefights
 *Arcade
 *Introduction
 *Exploring the Waters 
 *#14
 *Created by Ian Feekes December 6th 2017
 */

int[] alternatingSums(int[] a) 
{
    int[] team1 = new int[a.length];
    int[] team2 = new int[a.length];
    int index=0;
    for(int i=0;i<a.length;i++)
    {
        if(i%2==0) team1[i]=a[i];
        else team2[i]=a[i];
    }
    int[] toReturn = new int[2];
    int sum1=0;
    int sum2=0;
    for(int i=0;i<team1.length;i++)
    {
        sum1+=team1[i];
        sum2+=team2[i];
    }
    toReturn[0]=sum1;
    toReturn[1]=sum2;
    return toReturn;
}


