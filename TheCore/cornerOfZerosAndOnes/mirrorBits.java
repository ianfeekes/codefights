/*mirrorBits.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Corner of 0s and 1s 
 *#20
 */

int mirrorBits(int a) 
{
    int b = 0;
    while(a>0)
    {
        int x = a & 1;
        if(x == 1)//if the first bit of the input digit is a 1
        {
            b = b | 1;//then set b to 1;
        }
        a = a >> 1;
        if(a<=0)break;
        b = b << 1;
        //a = a >> 1;
    }
    return b; 
}
//parse through a from the first bit. Create an integer with value of 0
