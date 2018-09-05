/*numbersGrouping.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Mirror Lake
 *#63
 */

int numbersGrouping(int[] a) {
    List<int> nGroupList = new List<int>();
    for(int i=0;i<100000;i++) {
        nGroupList.Add(0);
    }
    int len = a.Length;
    for(int i=0;i<len;i++) {
        int index = (a[i]-1)/10000;
        if(nGroupList[index]==0)
            nGroupList[index]+=2;
        else
            nGroupList[index]++;
    }
     
    return nGroupList.Sum();
}
