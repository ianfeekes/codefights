/*comfortableNumbers.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Labyrinth of Nested Loops
 *#47
 */

int comfortableNumbers(int l, int r) 
{
    int t = 0;
    for (int a = l; a <= r; a++) {
        for (int b = a+1; b <= r; b++) {
            if (b <= a + digitSum(a) && a >= b - digitSum(b))
                t++;
        }
    }
    return t;
}

int digitSum (int a) {
    if (a < 1)
        return 0;
    return (a%10 + digitSum(a/10));
}


