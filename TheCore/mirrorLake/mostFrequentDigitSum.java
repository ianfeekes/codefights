/*mostFrequentDigitSum.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Mirror Lake
 *#65
 */

int mostFrequentDigitSum(int n) 
{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    while(n>0)
    {
        int temp = n;
        int toSubtract =0;
        while(temp>0)
        {
            toSubtract+=temp%10;
            temp/=10;
        }
        arr.add(toSubtract);
        n-=toSubtract;
    }
    int avg = 0;
    int largestOccurences = 0;
    int mostCommonVal = 0;
    for(int i=0;i<arr.size();i++)
    {
        int t = 0;
        for(int j=0;j<arr.size();j++)
        {
            if(arr.get(i)==arr.get(j))t++;
        }
        if(t>=largestOccurences)
        {
            largestOccurences=t;
            mostCommonVal=arr.get(i);
        }
    }
    return mostCommonVal;
}


