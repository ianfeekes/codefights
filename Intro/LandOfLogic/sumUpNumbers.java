/*sumUpNumbers.java
 *codefights
 *Arcade
 *Introduction
 *Land of Logic 
 *#54
 *Created by Ian Feekes December 6th 2017
 */

int sumUpNumbers(String inputString) 
{
    int[] arr = new int[inputString.length()];
    int index=0;
    for(int i=0;i<inputString.length();i++)
    {
        arr[i]=-1;
        if(((int)inputString.charAt(i)>47)&&((int)inputString.charAt(i)<58))
        {
            arr[i]=(int)inputString.charAt(i)-48;
        }
    }
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(" "+arr[i]);
    }
    int sum=0;
    int placeHolder = 1;
    for(int i=arr.length-1;i>=0;i--)
    {
        if(arr[i]!=-1)
        {
            while(arr[i]!=-1)
            {
                sum+=arr[i]*placeHolder;
                placeHolder*=10;
                i--;
                if(i<0)break;
            }
        }
        else if(arr[i]==-1)
        {
            placeHolder=1;
        }
    }
    return sum;
}


