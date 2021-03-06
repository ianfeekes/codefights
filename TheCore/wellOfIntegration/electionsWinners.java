/*electionsWinners.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Well of Integration
 *#75
 */

int electionsWinners(int[] votes, int k) 
{
    int numCantidates = 0;
    int maxVotes = 0;
    for(int i=0;i<votes.length;i++)
    {
        if(votes[i]>maxVotes) maxVotes = votes[i];
    }
    //if(twoMaxVoters(votes,maxVotes)) return 0;
    //else if (k==0) return 1;
    for(int i=0;i<votes.length;i++)
    {
        if(votes[i]+k>maxVotes) numCantidates++;
    }
    if((numCantidates==0)&&(k==0)&&(!twoMaxVoters(votes, maxVotes)))numCantidates++;
    return numCantidates;
}

boolean twoMaxVoters(int[] arr, int max)
{
    int numMaxVoters=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==max) numMaxVoters++;
    }
    return(numMaxVoters>1);
}
