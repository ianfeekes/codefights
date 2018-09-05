/*lineup.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Loop Tunnel         
 *#28
 */

int lineUp(String commands) 
{
    boolean prevL = false;
    boolean prevR = false;
    boolean facingForward = true; 
    int incrementer = 0;
    for(int i=0;i<commands.length();i++)
    {
        if(commands.charAt(i)=='A')
        {
            if(facingForward)incrementer++;
        }
        else if(commands.charAt(i)=='L')
        {
            if((prevL)&&(!facingForward))
            {
                facingForward=true;
                incrementer++;
            }
            else if((prevR)&&(!facingForward))
            {
                facingForward = true; 
                incrementer++;
            }
            else facingForward = false;
            prevL=true;
            prevR=false;
        }
        else if(commands.charAt(i)=='R')
        {
            if((prevR)&&(!facingForward))
            {
                facingForward=true;
                incrementer++;
            }
            else if((prevL)&&(!facingForward))
            {
                facingForward=true;
                incrementer++;
            }
            else facingForward = false; 
            prevR = true; 
            prevL = false; 
        }
    }
    return incrementer; 
}


