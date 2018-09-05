/*rounders.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Loop Tunnel
 *#32
 */

int rounders(int value)
{
    int temp = value; 
    int placeHolder = 1; 
    while(temp>10)
    {
        if(temp%10>=5)
        {
            value+=(10-temp%10)*placeHolder; 
            temp+=(10-temp%10);
        }
        else if(temp%10!=0)
        {
            value-=(temp%10)*placeHolder;
        }
        System.out.println(value);
        placeHolder*=10;
        temp/=10;
    }
    return value; 
}


