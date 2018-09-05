/*candles.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Loop Tunnel
 *#34
 */

int countBlackCells(int n, int m) 
{
    /*int smallest = n;
    int largest = m;
    if(n>m)
    {
        smallest =m;
        largest =n;
    }
    return smallest*((int)(largest/smallest)+2)-2;*/
    
    int answer = 0;
    for (int x = 1; x <= n; x++) {
        int L = (int) (m * 1L * (x - 1) / n);
        if (m * 1L * (x - 1) % n == 0) {
            L--;
        }
        int R = (int) (m * 1L * x / n);
        if(L<=0)L=0;
        //L = Math.Max(0, L);
        if(R>(m-1))R=m-1;
        //R = Math.Min(R, m - 1);
        answer += R - L + 1;
    }
    return answer;
}

//return (least)*(slope+2)-2
